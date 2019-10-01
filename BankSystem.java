import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.awt.PrintJob.*;
import javax.swing.plaf.metal.*;

public class BankSystem extends JFrame implements ActionListener {

	//Main Place on Form where All Child Forms will Shown.
	private JDesktopPane desktop = new JDesktopPane ();
	protected Hashtable  m_lfs;
	//For Program's MenuBar.
	private JMenuBar bar;

	//All the Main Menu of the Program.
	private JMenu mnuFile, mnuEdit, mnuView, ThemeMenu, mnuWin, mnuHelp,LoanMenu;

	private JMenuItem addNew, printRec, end;				//File Menu Options.
	private	JMenuItem  deposit, withdraw, delRec, search, searchName;	//Edit Menu Options.
	private	JMenuItem oneByOne, allCustomer;				//View Menu Options.
	private	JMenuItem change, style, theme;					//Option Menu Options.
	private JMenuItem close, closeAll;					//Window Menu Options.
	private	JMenuItem content, keyHelp, about;				//Help Menu Options.
	private JMenuItem ApplyLoan;					//Window Menu Options.

	//PopupMenu of Program.
	private JPopupMenu popMenu = new JPopupMenu ();

	//MenuItems for PopupMenu of the Program.
	private JMenuItem open, report, dep, with, del, find, all;

	//For Program's ToolBar.
	private	JToolBar toolBar;

	//For ToolBar's Button.
	private	JButton btnNew, btnDep, btnWith, btnRec, btnDel, btnSrch, btnHelp, btnKey;

	//Main Form StatusBar where Program's Name & Welcome Message Display.
	private JPanel statusBar = new JPanel ();

	//Labels for Displaying Program's Name & saying Welcome to Current User on StatusBar.
	private JLabel welcome;
	private JLabel author;

	//Making the LookAndFeel Menu.
	private String strings[] = {"1. Metal", "2. Motif", "3. Windows"};
	private UIManager.LookAndFeelInfo looks[] = UIManager.getInstalledLookAndFeels ();
	private ButtonGroup group = new ButtonGroup ();
	private JRadioButtonMenuItem radio[] = new JRadioButtonMenuItem[strings.length];

	//Getting the Current System Date.
	private java.util.Date currDate = new java.util.Date ();
	private SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMM yyyy", Locale.getDefault());
	private String d = sdf.format (currDate);

	//Following all Variables are use in BankSystem's IO's.

	//Variable use in Reading the BankSystem Records File & Store it in an Array.
	private int count = 0;
	private int rows = 0;
	private	int total = 0;

	//String Type Array use to Load Records From File.
	private String records[][] = new String [500][6];

	//Variable for Reading the BankSystem Records File.
	private FileInputStream fis;
	private DataInputStream dis;

	//Constructor of The Bank Program to Iniatilize all Variables of Program.

	public BankSystem () {

		//Setting Program's Title.
		super ("BankSystem [Pvt] Limited.");

		//Creating the MenuBar.
		bar = new JMenuBar ();

		//Setting the Main Window of Program.
		setIconImage (getToolkit().getImage ("Images/Bank.gif"));
		setSize (900, 650);
		setJMenuBar (bar);

		//Closing Code of Main Window.
		addWindowListener (new WindowAdapter () {
			public void windowClosing (WindowEvent we) {
				quitApp ();
			}
		}
		);

		//Setting the Location of Application on Screen.
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getWidth()) / 2,
			(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);

		//Creating the MenuBar Items.
		mnuFile = new JMenu ("File");
		mnuFile.setMnemonic ((int)'F');
		mnuEdit = new JMenu ("Edit");
		mnuEdit.setMnemonic ((int)'E');
		mnuView = new JMenu ("View");
		mnuView.setMnemonic ((int)'V');
		LoanMenu = new JMenu ("Loan");
		LoanMenu.setMnemonic ((int)'L');
		ThemeMenu = new JMenu ("Themes");
		ThemeMenu.setMnemonic ((int)'T');
		mnuWin = new JMenu ("Window");
		mnuWin.setMnemonic ((int)'W');
		mnuHelp = new JMenu ("Help");
		mnuHelp.setMnemonic ((int)'H');

		//Creating the MenuItems of Program.
		//MenuItems for FileMenu.
		addNew = new JMenuItem ("Open New Account", new ImageIcon ("Images/Open.gif"));
		addNew.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
		addNew.setMnemonic ((int)'N');
		addNew.addActionListener (this);
		printRec = new JMenuItem ("Print Customer Balance", new ImageIcon ("Images/Print16.PNG"));
		printRec.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK));
		printRec.setMnemonic ((int)'R');
		printRec.addActionListener (this);
		end = new JMenuItem ("Quit BankSystem ?", new ImageIcon ("Images/Exit16.PNG"));
		end.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
		end.setMnemonic ((int)'Q');	
		end.addActionListener (this);

		//MenuItems for EditMenu.
		deposit = new JMenuItem ("Deposit Money", new ImageIcon ("Images/Deposite.png"));
		deposit.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK));
		deposit.setMnemonic ((int)'T');
		deposit.addActionListener (this);
		withdraw = new JMenuItem ("Withdraw Money", new ImageIcon ("Images/Withdraw.png"));
		withdraw.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
		withdraw.setMnemonic ((int)'W');	
		withdraw.addActionListener (this);
		delRec = new JMenuItem ("Delete Customer", new ImageIcon ("Images/delete.gif"));
		delRec.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
		delRec.setMnemonic ((int)'D');
		delRec.addActionListener (this);
		search = new JMenuItem ("Search By No.", new ImageIcon ("Images/Search.gif"));
		search.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
		search.setMnemonic ((int)'S');	
		search.addActionListener (this);
		searchName = new JMenuItem ("Search By Name", new ImageIcon ("Images/Search.gif"));
		searchName.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK));
		searchName.setMnemonic ((int)'M');
		searchName.addActionListener (this);

		//MenuItems for ViewMenu.
		/*oneByOne = new JMenuItem ("View One By One", new ImageIcon ("Images/View.png"));
		oneByOne.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
		oneByOne.setMnemonic ((int)'O');	
		oneByOne.addActionListener (this);*/
		allCustomer = new JMenuItem ("View All Customer", new ImageIcon ("Images/View.png"));
		allCustomer.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
		allCustomer.setMnemonic ((int)'A');
		allCustomer.addActionListener (this);

		//Loan
		ApplyLoan= new JMenuItem ("Apply Loan", new ImageIcon ("Images/View.png"));
		ApplyLoan.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK));
		ApplyLoan.setMnemonic ((int)'A');	
		ApplyLoan.addActionListener (this);
		
		//Theme
		ActionListener lst = new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e)
			{
				String str = e.getActionCommand();
				Object obj = m_lfs.get(str);
				if (obj != null)
					try
					{
						String className = (String)obj;
						Class lnfClass = Class.forName(className);
						UIManager.setLookAndFeel((LookAndFeel)(lnfClass.newInstance()));
						SwingUtilities.updateComponentTreeUI(BankSystem.this);
					}
					catch (Exception ex) 
					{
						ex.printStackTrace();
						System.err.println(ex.toString());
					}
			}
		};

		m_lfs = new Hashtable();
		UIManager.LookAndFeelInfo lfs[] = UIManager.getInstalledLookAndFeels();
		ThemeMenu = new JMenu("Themes");
		ThemeMenu.setMnemonic('T');
		for (int k = 0; k < lfs.length; k++ )
		{
			String name = lfs[k].getName();
			JMenuItem lf = new JMenuItem(name);
			m_lfs.put(name, lfs[k].getClassName());
			lf.addActionListener(lst);
			ThemeMenu.add(lf);
		}
				
		//MenuItems for WindowMenu.
		close = new JMenuItem ("Close Active Window", new ImageIcon ("Images/CloseActive.png"));
		close.setMnemonic ((int)'C');
		close.addActionListener (this);
		closeAll = new JMenuItem ("Close All Windows...", new ImageIcon ("Images/CloseAll.png"));
		closeAll.setMnemonic ((int)'A');
		closeAll.addActionListener (this);

		//MenuItems for HelpMenu.
		content = new JMenuItem ("Help Contents", new ImageIcon ("Images/Help16.png"));
		content.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_H, Event.CTRL_MASK));
		content.setMnemonic ((int)'H');
		content.addActionListener (this);
		keyHelp = new JMenuItem ("Help on Shortcuts...", new ImageIcon ("Images/Help16.png"));
		keyHelp.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_K, Event.CTRL_MASK));
		keyHelp.setMnemonic ((int)'K');
		keyHelp.addActionListener (this);
		about = new JMenuItem ("About BankSystem", new ImageIcon ("Images/AboutNotePad16.PNG"));
		about.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
		about.setMnemonic ((int)'C');
		about.addActionListener (this);

		//Adding MenuItems to Menu.
	
		//File Menu Items.
		mnuFile.add (addNew);
		mnuFile.addSeparator ();
		mnuFile.add (printRec);
		mnuFile.addSeparator ();
		mnuFile.add (end);

		//Edit Menu Items.
		mnuEdit.add (deposit);
		mnuEdit.add (withdraw);
		mnuEdit.addSeparator ();
		mnuEdit.add (delRec);
		mnuEdit.addSeparator ();
		mnuEdit.add (search);
		mnuEdit.add (searchName);

		//View Menu Items.
		/*mnuView.add (oneByOne);
		mnuView.addSeparator ();*/
		mnuView.add (allCustomer);

		//Loan
		LoanMenu.add(ApplyLoan);

		//Window Menu Items.
		mnuWin.add (close);
		mnuWin.add (closeAll);

		//Help Menu Items.
		mnuHelp.add (content);
		mnuHelp.addSeparator ();
		mnuHelp.add (keyHelp);
		mnuHelp.addSeparator ();
		mnuHelp.add (about);

		//Adding Menues to Bar.
		bar.add (mnuFile);
		bar.add (mnuEdit);
		bar.add (mnuView);
		bar.add (LoanMenu);
		bar.add (ThemeMenu);
		bar.add (mnuWin);
		bar.add (mnuHelp);

		//MenuItems for PopupMenu.
		open = new JMenuItem ("Open New Account", new ImageIcon ("Images/Open.gif"));
		open.addActionListener (this);
		report = new JMenuItem ("Print BankSystem Report", new ImageIcon ("Images/Print16.PNG"));
		report.addActionListener (this);
		dep = new JMenuItem ("Deposit Money", new ImageIcon ("Images/Deposite.png"));
		dep.addActionListener (this);
		with = new JMenuItem ("Withdraw Money", new ImageIcon ("Images/Withdraw.png"));
		with.addActionListener (this);
		del = new JMenuItem ("Delete Customer", new ImageIcon ("Images/delete.gif"));
		del.addActionListener (this);
		find = new JMenuItem ("Search Customer", new ImageIcon ("Images/Search.gif"));
		find.addActionListener (this);
		all = new JMenuItem ("View All Customer", new ImageIcon ("Images/View.png"));
		all.addActionListener (this);

		//Adding Menues to PopupMenu.
		popMenu.add (open);
		popMenu.add (report);
		popMenu.add (dep);
		popMenu.add (with);
		popMenu.add (del);
		popMenu.add (find);
		popMenu.add (all);

		//Following Procedure display the PopupMenu of Program.
		addMouseListener (new MouseAdapter () {
			public void mousePressed (MouseEvent me) { checkMouseTrigger (me); }
			public void mouseReleased (MouseEvent me) { checkMouseTrigger (me); }
			private void checkMouseTrigger (MouseEvent me) {
				if (me.isPopupTrigger ())
					popMenu.show (me.getComponent (), me.getX (), me.getY ());
			}
		}
		);
		
		//Creating the ToolBar's Buttons of Program.
		btnNew = new JButton (new ImageIcon ("Images/Open.gif"));
		btnNew.setToolTipText ("Create New Account");
		btnNew.addActionListener (this);
		btnDep = new JButton (new ImageIcon ("Images/Deposite.png"));
		btnDep.setToolTipText ("Deposit Money");
		btnDep.addActionListener (this);
		btnWith = new JButton (new ImageIcon ("Images/Withdraw.png"));
		btnWith.setToolTipText ("Withdraw Money");
		btnWith.addActionListener (this);
		btnRec = new JButton (new ImageIcon ("Images/Print16.PNG"));
		btnRec.setToolTipText ("Apply Loan");
		btnRec.addActionListener (this);
		btnDel = new JButton (new ImageIcon ("Images/delete.gif"));
		btnDel.setToolTipText ("Delete Customer");
		btnDel.addActionListener (this);
		btnSrch = new JButton (new ImageIcon ("Images/Search.gif"));
		btnSrch.setToolTipText ("Search Customer");
		btnSrch.addActionListener (this);
		btnHelp = new JButton (new ImageIcon ("Images/Help.gif"));
		btnHelp.setToolTipText ("Help on Bank System");
		btnHelp.addActionListener (this);
		btnKey = new JButton (new ImageIcon ("Images/Keys.gif"));
		btnKey.setToolTipText ("Shortcut Keys of BankSystem");
		btnKey.addActionListener (this);

		//Creating the ToolBar of Program.
		toolBar = new JToolBar ();
		toolBar.add (btnNew);
		toolBar.addSeparator ();
		toolBar.add (btnDep);
		toolBar.add (btnWith);
		toolBar.addSeparator ();
		toolBar.add (btnRec);
		toolBar.addSeparator ();
		toolBar.add (btnDel);
		toolBar.addSeparator ();
		toolBar.add (btnSrch);
		toolBar.addSeparator ();
		toolBar.add (btnHelp);
		toolBar.add (btnKey);

		//Creating the StatusBar of Program.
		author = new JLabel (" " + "BankSystem [Pvt] Limited.", Label.LEFT);
		author.setForeground (Color.black);
		author.setToolTipText ("Program's Title");
		welcome = new JLabel ("Welcome Today is " + d + " ", JLabel.RIGHT);
		welcome.setForeground (Color.black);
		welcome.setToolTipText ("Welcoming the User & System Current Date");
		statusBar.setLayout (new BorderLayout());
		statusBar.add (author, BorderLayout.WEST);
		statusBar.add (welcome, BorderLayout.EAST);

		//For Making the Dragging Speed of Internal Frames Faster.
		desktop.putClientProperty ("JDesktopPane.dragMode", "outline");

		//Setting the Contents of Programs.
		getContentPane().add (toolBar, BorderLayout.NORTH);
		getContentPane().add (desktop, BorderLayout.CENTER);
		getContentPane().add (statusBar, BorderLayout.SOUTH);

		//Showing The Main Form of Application.
		setVisible (true);

	}

	//Function For Performing different Actions By Menus of Program.

	public void actionPerformed (ActionEvent ae) {
	
		Object obj = ae.getSource();

		if(obj == ApplyLoan || obj == btnRec){
			boolean b = openChildWindow ("Apply Loan");
			if (b == false) {
				Loan ln=new Loan();
				desktop.add (ln);
				ln.setLocation(350,0);
				ln.show ();
			}
			
			
		}

		if (obj == addNew || obj == open || obj == btnNew) {

			boolean b = openChildWindow ("Create New Account");
			if (b == false) {
				NewAccount newAcc = new NewAccount ();
				desktop.add (newAcc);
				newAcc.setLocation(350,0);
				newAcc.show ();
			}

		}
		
		else if (obj == end) {

			quitApp ();

		}
		else if (obj == deposit || obj == dep || obj == btnDep) {

			boolean b = openChildWindow ("Deposit Money");
			if (b == false) {
				DepositMoney depMon = new DepositMoney ();
				desktop.add (depMon);
				depMon.show ();
			}

		}
		else if (obj == withdraw || obj == with || obj == btnWith) {

			boolean b = openChildWindow ("Withdraw Money");
			if (b == false) {
				WithdrawMoney withMon = new WithdrawMoney ();
				desktop.add (withMon);
				withMon.setLocation(0,250);
				withMon.show ();
			}

		}
		else if (obj == delRec || obj == del || obj == btnDel) {

			boolean b = openChildWindow ("Delete Account Holder");
			if (b == false) {
				DeleteCustomer delCus = new DeleteCustomer ();
				desktop.add (delCus);
				delCus.setLocation(0,500);
				delCus.show ();
			}

		}
		else if (obj == search || obj == find || obj == btnSrch) {

			boolean b = openChildWindow ("Search Customer [By No.]");
			if (b == false) {
				FindAccount fndAcc = new FindAccount ();
				desktop.add (fndAcc);
				fndAcc.show ();
			}

		}
		else if (obj == searchName) {

			boolean b = openChildWindow ("Search Customer [By Name]");
			if (b == false) {
				FindAccountName fndNm = new FindAccountName ();
				desktop.add (fndNm);
				fndNm.show ();
			}

		}
		else if (obj == oneByOne) {

			boolean b = openChildWindow ("View Account Holders");
			if (b == false) {
				ViewOne vwOne = new ViewOne ();
				desktop.add (vwOne);
				vwOne.show ();
			}

		}
		else if (obj == allCustomer || obj == all) {

			boolean b = openChildWindow ("View All Customers");
			if (b == false) {
				//ViewCustomer viewCus = new ViewCustomer ();
				//desktop.add (viewCus);
				//viewCus.show ();
				
				DBManager db = new DBManager();
				
				java.util.LinkedList l = db.getCustomerValues();
				
				TableExample te = new TableExample();
				
				te.setValuesInJTable1(l);
				
				desktop.add (te);
				te.setLocation(75,200);
				te.show();
			}

		}
		else if (obj == change) {

			Color cl = new Color (153, 153, 204);
			cl = JColorChooser.showDialog (this, "Choose Background Color", cl);
			if (cl == null) { }
			else {
				desktop.setBackground (cl);
				desktop.repaint ();
			}

		}
		else if (obj == close) {

			try {
				desktop.getSelectedFrame().setClosed(true);
			}
			catch (Exception CloseExc) { }

		}
		else if (obj == closeAll) {

			JInternalFrame Frames[] = desktop.getAllFrames (); //Getting all Open Frames.
			for(int getFrameLoop = 0; getFrameLoop < Frames.length; getFrameLoop++) {
				try {
	 				Frames[getFrameLoop].setClosed (true); //Close the frame.
				} 
				catch (Exception CloseExc) { }	//if we can't close it then we have a problem.
			}

		}
		else if (obj == content || obj == btnHelp) {

			boolean b = openChildWindow ("BankSystem Help");
			if (b == false) {
				BankHelp hlpBank = new BankHelp ("BankSystem Help", "Help/Bank.htm");
				desktop.add (hlpBank);
				hlpBank.show ();
			}

		}
		else if (obj == keyHelp || obj == btnKey) {

			boolean b = openChildWindow ("BankSystem Keys");
			if (b == false) {
				BankHelp hlpKey = new BankHelp ("BankSystem Keys", "Help/Keys.htm");
				desktop.add (hlpKey);
				hlpKey.show ();
			}

		}
		else if (obj == about) {

			String msg = "BankSystem [Pvt] Limited.\n\n" + "Created & Designed By:\n" + 
				"TEJASHREE, PRIYANKA & DARSHAN \n\n" + "E-mail me:\n teju8792@yahoo.com";
			JOptionPane.showMessageDialog (this, msg, "About BankSystem", JOptionPane.PLAIN_MESSAGE);

		}
	}

	
	//Function For Closing the Program.

	private void quitApp () {

		try {
			//Show a Confirmation Dialog.
		    	int reply = JOptionPane.showConfirmDialog (this,
					"Are you really want to exit\nFrom BankSystem?",
					"BankSystem - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
			//Check the User Selection.
			if (reply == JOptionPane.YES_OPTION) {
				setVisible (false);	//Hide the Frame.
				dispose();            	//Free the System Resources.
				System.exit (0);        //Close the Application.
			}
			else if (reply == JOptionPane.NO_OPTION) {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		} 

		catch (Exception e) {}

	}

	//Loop Through All the Opened JInternalFrame to Perform the Task.

	private boolean openChildWindow (String title) {

		JInternalFrame[] childs = desktop.getAllFrames ();
		for (int i = 0; i < childs.length; i++) {
			if (childs[i].getTitle().equalsIgnoreCase (title)) {
				childs[i].show ();
				return true;
			}
		}
		return false;

	}
}
