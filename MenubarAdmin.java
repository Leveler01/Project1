import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Reports.*;
public class MenubarAdmin extends JFrame  implements ActionListener
{
MenuBar mbar;
/*masster forms objects*/
MenuItem m1,m2,m3,m4,m5;

/*Complaint forms objects*/
MenuItem m6,m7;

MenuItem m8,m9,m10,m11,m12,m13,m14,m15,m16,mcust,m17,m18,m19;
 JLabel l;
ImageIcon img;
   Container c;
MenubarAdmin()
{
		MenuBar mbar=new MenuBar();
	
	/*All menuitems of  first menu Master Forms*/
		Menu m=new Menu("Masters Forms");
		m1=new MenuItem("New User Details");
		m.add(m1);
		 m2=new MenuItem("Vehicle Details");
		m.add(m2);
	    	m3=new MenuItem("Customer Details");
		m.add(m3);
	    	mcust=new MenuItem("Service Person Details");
		m.add(mcust);
	    	m4=new MenuItem("Enquiry Details");
		m.add(m4);
	           	m5=new MenuItem("Exit");
		m.add(m5);
		mbar.add(m);


/*All menuitems of  second menu Complaint process*/		
		Menu mm=new Menu("Complaint Process");
		m6=new MenuItem("Complaint Details");
		mm.add(m6);
		 m7=new MenuItem("Service Details");
		mm.add(m7);
		mbar.add(mm);


/*All menuitems of  third menu Order process*/	
		

		Menu mm1=new Menu("Order Process");
		m8=new MenuItem("Vehicle Info");
		mm1.add(m8);
		m9=new MenuItem("Vehicle Booking");
		mm1.add(m9);
	               m10=new MenuItem("Delivery Details");
		mm1.add(m10);
		m11=new MenuItem("Loan Details");
		mm1.add(m11);
		m12=new MenuItem("Stock Details");
		mm1.add(m12);
		mbar.add(mm1);
	

/*All menuitems of  fourth menu bill process*/	
		Menu mnu2=new Menu("Billing Process");
		m13=new MenuItem("Bill Details");
		mnu2.add(m13);
		m14=new MenuItem("Payment Details");
		mnu2.add(m14);
		m15=new MenuItem("Vehicle Details Report");
		mnu2.add(m15);
		m16=new MenuItem("Customer Details Report");
		mnu2.add(m16);
		m17=new MenuItem("Loan Details Report");
		mnu2.add(m17);
		mbar.add(mnu2);
		setMenuBar(mbar);
		
		
		
		
		img=new ImageIcon("Outlet.jpg");
	      	l=new JLabel("",img,JLabel.CENTER);
	       	l.setSize(45,50);
	       	add(l);


	//Menus of master forms 
 		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		mcust.addActionListener(this);
		m5.addActionListener(this);

	/*All menuitems of  second menu Complaint process*/	
		m6.addActionListener(this);
		m7.addActionListener(this);

	/*All menuitems of  third menu Order process*/	
		m8.addActionListener(this);
		m9.addActionListener(this);
		m10.addActionListener(this);
		m11.addActionListener(this);
		m12.addActionListener(this);

/*All menuitems of  third menu Billing process*/	
		m13.addActionListener(this);
		m14.addActionListener(this);
		m15.addActionListener(this);
		m16.addActionListener(this);
		m17.addActionListener(this);
		
	show();
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);
		//resize
}//constructor ends

public void actionPerformed(ActionEvent aaa)
{
    /*All menuitems of  first menu Master Forms*/
	if(aaa.getSource()==m1)
	{
		  JOptionPane.showMessageDialog(null, "New user is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Customer s2 = new Customer();
		  s2.setVisible(true);
		
	}

	if(aaa.getSource()==m2)
	{
  JOptionPane.showMessageDialog(null, "Vehicle Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Vehicle s3 = new Vehicle();
		  s3.setVisible(true);
		
	}
if(aaa.getSource()==m3)
	{
   JOptionPane.showMessageDialog(null, "Customer Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Customer s2 = new Customer();
		  s2.setVisible(true);
	}
if(aaa.getSource()==m4)
	{
  JOptionPane.showMessageDialog(null, "Enquiry Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Enquiry s5 = new Enquiry();
		  s5.setVisible(true);
		
	}

if(aaa.getSource()==mcust)
	{
  JOptionPane.showMessageDialog(null, "Service Person Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                SPerson s4 = new SPerson();
		  s4.setVisible(true);
	}	


	if(aaa.getSource()==m5)
	{
  JOptionPane.showMessageDialog(null, "Exit Application", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
		md.dispose();
		md.hide();
	}

/*All menuitems of  second menu Complaint process*/
	if(aaa.getSource()==m6)
	{
		  JOptionPane.showMessageDialog(null, "Complaint Details Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Complaint s5 = new   Complaint();
		  s5.setVisible(true);
		
	}

	if(aaa.getSource()==m7)
	{
		  JOptionPane.showMessageDialog(null, "Service Details Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Service1 s6 = new Service1();
		  s6.setVisible(true);
		
	}

/*All menuitems of  third menu Order process*/	
	if(aaa.getSource()==m8)
	{
		  JOptionPane.showMessageDialog(null, "Vehicle information Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Vehinfo s7 = new   Vehinfo();
		  s7.setVisible(true);
		
	}

	if(aaa.getSource()==m9)
	{
		  JOptionPane.showMessageDialog(null, "Vehicle Booking Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Vehbooking s8 = new Vehbooking();
		  s8.setVisible(true);
		
	}
	if(aaa.getSource()==m10)
	{
		  JOptionPane.showMessageDialog(null, "Delivery Form is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Delivery s9 = new   Delivery();
		  s9.setVisible(true);
		
	}

	if(aaa.getSource()==m11)
	{
		  JOptionPane.showMessageDialog(null, "Loan Details is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Loan s10 = new   Loan();
		  s10.setVisible(true);
		
	}
	if(aaa.getSource()==m12)
	{
		  JOptionPane.showMessageDialog(null, "Stock  Details opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Stock s11 = new   Stock();
		  s11.setVisible(true);
		
	}

	
/*All menuitems of  fourth menu Billing process*/	
if(aaa.getSource()==m13)
	{
		  JOptionPane.showMessageDialog(null, "Bill Details is opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                                Bill s12 = new   Bill();
		  s12.setVisible(true);
		
	}
	if(aaa.getSource()==m14)
	{
		  JOptionPane.showMessageDialog(null, "Payment Details opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                               Payment s13 = new   Payment();
		  s13.setVisible(true);
		
	}

		if(aaa.getSource()==m15)
	{
		  JOptionPane.showMessageDialog(null, "Vehicle report opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                               Reports.VehicleReport s13 = new   Reports.VehicleReport();
		  s13.setVisible(true);
		
	}

		if(aaa.getSource()==m16)
	{
		  JOptionPane.showMessageDialog(null, "Customer  report opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                               Reports.custReport s13 = new   Reports.custReport();
		  s13.setVisible(true);
		
	}
		if(aaa.getSource()==m17)
	{
		  JOptionPane.showMessageDialog(null, "Loan report opened", "Vehicle Showroom Sales System",JOptionPane.DEFAULT_OPTION);
                               Reports.LoanReport s13 = new   Reports.LoanReport();
		  s13.setVisible(true);
		
	}
}//action performed ends

public static MenubarAdmin md;

public static void main(String s[])
{
md=new MenubarAdmin();
md.setTitle("Vehicle Showroom Sales System ........ ..... Main Page");
md.show();
}//main ends
}//class ends