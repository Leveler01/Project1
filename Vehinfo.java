import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.sql.*;

public class Vehinfo extends JFrame implements ActionListener,KeyListener
{
   JLabel ll,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,bic1,bic2;
   public static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
   public static  JTextArea ta1;
   JButton b1;
   JPanel p1,p2,p3;
   Container c;
   ImageIcon ic,icc;
        Font f1=new Font("Footlight MT Light",Font.ITALIC,25);
	Font f2=new Font("Bookman Old Style",Font.BOLD,45);
   static public Connection con;
   static public Statement st;
   static public ResultSet rs;

public Vehinfo()
   {
        c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.black);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(400,10,600,75);
		p1.setBackground(new Color(51,27,119));
		c.add(p1);

		
        	p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(400,80,600,600);
		p2.setBackground(Color.orange);
		c.add(p2);


l1= new JLabel("Vehicle Name:");
		l1.setBounds(10,10,200,30);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		p1.add(l1);
t1=new JTextField(20);
		t1.setBounds(200,10,200,30);
        p1.add(t1);



  l2= new JLabel("Vehicle Sr no :");
		l2.setBounds(10,10,200,30);
		l2.setFont(f1);
        p2.add(l2);
		t2=new JTextField(20);
		t2.setBounds(200,10,200,30);
        p2.add(t2);

        l3=new JLabel("Mileage");
		l3.setBounds(10,50, 200,30);
		l3.setFont(f1);
		p2.add(l3);
		t3=new JTextField(50);
		t3.setBounds(200,50,200,30);
		p2.add(t3);

        l4=new JLabel("CC");
		l4.setBounds(10,100, 200,30);
		l4.setFont(f1);
		p2.add(l4);
        t4=new JTextField(30);
		t4.setBounds(200,100,200,30);
		p2.add(t4);

        l5=new JLabel("Color");
		l5.setBounds(10,150, 200,30);
		l5.setFont(f1);
		p2.add(l5);
        t5=new JTextField(30);
		t5.setBounds(200,150,200,30);
		p2.add(t5);

        l6=new JLabel("Price");
		l6.setBounds(10,200, 200,30);
		l6.setFont(f1);
		p2.add(l6);
        ta1=new JTextArea();
		ta1.setBounds(200,200,200,30);
		p2.add(ta1);

        l7=new JLabel("Engine_type");
		l7.setBounds(10,250, 200,30);
		l7.setFont(f1);
		p2.add(l7);
        t6=new JTextField(30);
		t6.setBounds(200,250,200,30);
		p2.add(t6);

   l8=new JLabel("Electricals");
		l8.setBounds(10,300, 200,30);
		l8.setFont(f1);
		p2.add(l8);
        t7=new JTextField(30);
		t7.setBounds(200,300,200,30);
		p2.add(t7);
   l9=new JLabel("net_power");
		l9.setBounds(10,350, 200,30);
		l9.setFont(f1);
		p2.add(l9);
        t8=new JTextField(30);
		t8.setBounds(200,350,200,30);
		p2.add(t8);

l10=new JLabel("Tyre_type");
		l10.setBounds(10,400, 200,30);
		l10.setFont(f1);
		p2.add(l10);
        t9=new JTextField(30);
		t9.setBounds(200,400,200,30);
		p2.add(t9);




b1=new JButton("Search");
		b1.setBounds(450,10,100,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		p1.add(b1);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);

       

		b1.addActionListener(this);

		t2.addKeyListener(this);
		t3.addKeyListener(this);
		t4.addKeyListener(this);

		ta1.addKeyListener(this);

ic=new ImageIcon("honda3.jpg");
			bic1=new JLabel(ic);
			bic1.setBounds(10,30,900,550);
			c.add(bic1);

icc=new ImageIcon("honda3.jpg");
			bic2=new JLabel(icc);
			bic2.setBounds(600,30,700,550);
			c.add(bic2);




}

public void keyTyped(KeyEvent ke)
         	{
		validation v=new validation();
               		char c = ke.getKeyChar();
		
		if(ke.getSource()==t2)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//bill id validation
		if(ke.getSource()==ta1)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//booking id validation
		if(ke.getSource()==t3)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//vehicle id validation
		if(ke.getSource()==t4)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//amount validation
		
}//keytyped ends
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke1){}




public void actionPerformed(ActionEvent ae)
{
 if(b1==ae.getSource())
     {
      
	Vehinfo.dosearch(t1.getText());
      }


}

public static void dosearch(String s1)
{int y; //=Integer.parseInt(s1); 
boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();
Statement st1=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Vehinfo");
  while(rs.next())
  {
     if(s1.equals(rs.getString(2))) {  rrr=true; break;}
     else { rrr=false;}
      
        }
	if(rrr==true)
	{
                 JOptionPane.showMessageDialog(null,"Vehicle Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                  String sss="select * from Vehinfo where  vhname = '"+s1+"'";
	 JOptionPane.showMessageDialog(null,sss,"Search Query",JOptionPane.INFORMATION_MESSAGE);
	ResultSet rs1=st1.executeQuery("select * from Vehinfo where  vhname = '"+s1+"'");
	  while(rs1.next())
 	 {
   	       
   	  t2.setText(String.valueOf(rs1.getInt(1)));
        	 t1.setText(String.valueOf(rs1.getString(2)));
         	t3.setText(String.valueOf(rs1.getInt(3)));
         	t4.setText(String.valueOf(rs1.getInt(4)));
        	 t5.setText(String.valueOf(rs1.getString(5)));
         	ta1.setText(String.valueOf(rs1.getInt(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
	t7.setText(String.valueOf(rs1.getString(8)));
	t8.setText(String.valueOf(rs1.getString(9)));
	t9.setText(String.valueOf(rs1.getString(10)));
         	
      
       	 }//while ends
	}//if ends
	else
 	{ 
                 JOptionPane.showMessageDialog(null,"Record is not found","Search Query",JOptionPane.INFORMATION_MESSAGE);
	}
 
}//try ends
catch(Exception  ee)
{
   
}

}//dosearch function ends

public static void main(String s[])
	{
		Vehinfo s1 =new Vehinfo();
s1.setTitle("Vehicle Showroom Sales System ........  Vehicle Information");
		s1.show();
	}//main ends
}//class ends
