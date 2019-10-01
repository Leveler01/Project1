import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.sql.*;

public class Vehicle extends JFrame implements ActionListener,KeyListener
{
   JLabel ll,l1,l2,l3,l4,l5,l6,l7,l8,bic1,bic2;
   public static JTextField t1,t2,t3,t4,t5,t6,t7;
   public static JTextArea ta1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
   JPanel p1,p2,p3;
   Container c;
   ImageIcon ic,icc;
   Font f1=new Font("Footlight MT Light",Font.ITALIC,25);
   Font f2=new Font("Bookman Old Style",Font.BOLD,35);
   static public Connection con;
   static public Statement st;
   static public ResultSet rs;

public Vehicle()
   {
        c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.black);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(400,10,570,75);
		p1.setBackground(new Color(51,27,119));
		c.add(p1);

		ll= new JLabel("Vehicle Registration");
		ll.setBounds(100,10,600,75);
		ll.setForeground(Color.white);
		ll.setFont(f2);
		p1.add(ll);

        	p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(400,80,570,435);
		p2.setBackground(Color.orange);
		c.add(p2);

		p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(400,500,570,125);
		p3.setBackground(Color.orange);
		c.add(p3);

        l1= new JLabel("Vehicle Id:");
		l1.setBounds(10,10,200,30);
		l1.setFont(f1);
        p2.add(l1);
		t1=new JTextField(20);
		t1.setBounds(200,10,200,30);
        p2.add(t1);

        l2=new JLabel("Vehicle No");
		l2.setBounds(10,50, 200,30);
		l2.setFont(f1);
		p2.add(l2);
		t2=new JTextField(50);
		t2.setBounds(200,50,200,30);
		p2.add(t2);

        l3=new JLabel("Vehicle Name");
		l3.setBounds(10,100, 200,30);
		l3.setFont(f1);
		p2.add(l3);
        t3=new JTextField(30);
		t3.setBounds(200,100,200,30);
		p2.add(t3);

        l4=new JLabel("Chassis No");
		l4.setBounds(10,150, 200,30);
		l4.setFont(f1);
		p2.add(l4);
        t4=new JTextField(30);
		t4.setBounds(200,150,200,30);
		p2.add(t4);

        l5=new JLabel("Model Name");
		l5.setBounds(10,200, 200,30);
		l5.setFont(f1);
		p2.add(l5);
        ta1=new JTextArea();
		ta1.setBounds(200,200,200,30);
		p2.add(ta1);

        l6=new JLabel("Vehicle Price");
		l6.setBounds(10,250, 200,30);
		l6.setFont(f1);
		p2.add(l6);
        t5=new JTextField(30);
		t5.setBounds(200,250,200,30);
		p2.add(t5);

   l7=new JLabel("Vehicle color");
		l7.setBounds(10,300, 200,30);
		l7.setFont(f1);
		p2.add(l7);
        t6=new JTextField(30);
		t6.setBounds(200,300,200,30);
		p2.add(t6);
   l8=new JLabel("Vehicle Type");
		l8.setBounds(10,350, 200,30);
		l8.setFont(f1);
		p2.add(l8);
        t7=new JTextField(30);
		t7.setBounds(200,350,200,30);
		p2.add(t7);



        b1=new JButton("Add");
		b1.setBounds(10,30,100,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		p3.add(b1);

		b2=new JButton("Save");
		b2.setBounds(120,30,100,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		p3.add(b2);

		b3=new JButton("Update");
		b3.setBounds(230,30,100,30);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		p3.add(b3);
		
		b4=new JButton("Delete");
		b4.setBounds(340,30,100,30);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		p3.add(b4);

		b5=new JButton("First");
		b5.setBounds(10,70,100,30);
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		p3.add(b5);

		b6=new JButton("Last");
		b6.setBounds(120,70,100,30);
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		p3.add(b6);

		b7=new JButton("Search");
		b7.setBounds(230,70,100,30);
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		p3.add(b7);

		b8=new JButton("Back");
		b8.setBounds(340,70,100,30);
		b8.setBackground(Color.black);
		b8.setForeground(Color.white);
		p3.add(b8);

		b9=new JButton("clear");
		b9.setBounds(450,30,100,30);
		b9.setBackground(Color.black);
		b9.setForeground(Color.white);
		p3.add(b9);

		b10=new JButton("Close");
		b10.setBounds(450,70,100,30);
		b10.setBackground(Color.black);
		b10.setForeground(Color.white);
		p3.add(b10);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b8.addActionListener(this);
		t1.addKeyListener(this);	
		t2.addKeyListener(this);
		t4.addKeyListener(this);
		t5.addKeyListener(this);
		t3.addKeyListener(this);
		ta1.addKeyListener(this);		
			t6.addKeyListener(this);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);


ic=new ImageIcon("honda3.jpg");
			bic1=new JLabel(ic);
			bic1.setBounds(10,30,900,550);
			c.add(bic1);

icc=new ImageIcon("honda3.jpg");
			bic2=new JLabel(icc);
			bic2.setBounds(600,30,700,550);
			c.add(bic2);


}//constructor ends

public void keyTyped(KeyEvent ke)
         	{
		validation v=new validation();
               		char c = ke.getKeyChar();
		
		if(ke.getSource()==t1)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//bill id validation

		if(ke.getSource()==t3)
		{ 
			if((v.IsLetter(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Character", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//customer name validation
		
		if(ke.getSource()==t6)
		{ 
			if((v.IsLetter(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Character", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//customer name validation

		
		if(ke.getSource()==ta1)
		{ 
			if((v.IsLetter(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Character", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//customer name validation


		if(ke.getSource()==t2)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//booking id validation
		
		if(ke.getSource()==t4)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//tax validation
		if(ke.getSource()==t5)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//total validation
}//keytyped ends
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke1){}



public void actionPerformed(ActionEvent ae)
{
    if(b1==ae.getSource())
     {
        /*t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        ta1.setText("");
boolean r1=Vehicle.doconnect();*/

 Vehicle.doadd();
        
      }
 if(b8==ae.getSource())
     {
      
hide();
      }


if(b2==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 boolean r2=Vehicle.dosave(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText(),t5.getText(),t6.getText(),t7.getText());
         if(r2==true)
JOptionPane.showMessageDialog(null,"Record is saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);
	 else  
JOptionPane.showMessageDialog(null,"Record is not saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);
          
      }

if(b3==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Vehicle.doupdate(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText(),t5.getText(),t6.getText(),t7.getText());
      }

 if(b4==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Vehicle.dodelete(t1.getText());
      }

if(b5==ae.getSource())
     {
     
	 Vehicle.dofirst();
      }
if(b6==ae.getSource())
     {
     
	Vehicle.dolast();
      }

 if(b7==ae.getSource())
     {
      
	 Vehicle.dosearch(t1.getText());
      }
	if(b9==ae.getSource())
     {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        ta1.setText("");
      }

if(b10==ae.getSource())
     {
JOptionPane.showMessageDialog(null,"Form is closed","Close Messege",JOptionPane.INFORMATION_MESSAGE);
hide();
}//b10 ends

}//actionPeformed ends

public static void doadd()
{int y=0; boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();

ResultSet rs=st.executeQuery("Select max(vid) from Vehicle");
  while(rs.next())
  { 
     y=rs.getInt(1);   
   } 
   y++; 
	
        JOptionPane.showMessageDialog(null,"New Record is added with vid =" +y,"Search Query",JOptionPane.INFORMATION_MESSAGE);
                  
   	        t1.setText(String.valueOf(String.valueOf(y)));
        	 t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        ta1.setText("");
		t2.requestFocus();
         	
      
       	
 
}//try ends
catch(Exception  ee)
{
   
}

}//doadd function ends

/*public static boolean doconnect()
{
boolean rr=false;
try
        {


 
	  rr=true; 
	
        }//try ends
	catch(Exception ee)
        {
         }//catch ends
return(rr);
}//doconnect ends */



public static boolean dosave(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8)
{
boolean b=false;
try
        {
	  
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         
          con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
          st=con.createStatement();
          String sss="insert into Vehicle values("+s1+",'"+s2+"','"+s3+"','"+s4+"','"+s5+"',"+s6+",'"+s7+"','"+s8+"')";     
          JOptionPane.showMessageDialog(null,sss,"Save Messege",JOptionPane.INFORMATION_MESSAGE);
	  int f= st.executeUpdate(sss);
          if(f==0)
           b=false;
          else
           b=true;
         
        }//try ends
	catch(Exception ee)
        {
         }//catch ends
return(b);
}//dosave ends 

public static void doupdate(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="update  Vehicle set  vehno= '"+s2+"',  vehname= '"+s3+"', chassino= '"+s4+"', modelname = '"+s5+"', price= "+s6+",vcolor = '"+s7+"',vtype = '"+s8+"'  where vid= "  + Integer.parseInt(s1);    
          JOptionPane.showMessageDialog(null,sss,"Update Messege",JOptionPane.INFORMATION_MESSAGE);
          int y= st.executeUpdate(sss);
          if (y==0)
           JOptionPane.showMessageDialog(null,"Record is not Updated","Update Messege",JOptionPane.INFORMATION_MESSAGE);
          else
           JOptionPane.showMessageDialog(null,"Record is Updated","Update Messege",JOptionPane.INFORMATION_MESSAGE);


        }//try ends
	catch(Exception ee)
        {
         }//catch ends

}//doupdate ends

public static void dodelete(String s1)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="delete from  Vehicle   where vid= "  + Integer.parseInt(s1);    
          JOptionPane.showMessageDialog(null,sss,"Delete Messege",JOptionPane.INFORMATION_MESSAGE);
          int y= st.executeUpdate(sss);
          if (y==0)
           JOptionPane.showMessageDialog(null,"Record is not Deleted","Delete Messege",JOptionPane.INFORMATION_MESSAGE);
          else
           JOptionPane.showMessageDialog(null,"Record is Deleted","Delete Messege",JOptionPane.INFORMATION_MESSAGE);


        }//try ends
	catch(Exception ee)
        {
         }//catch ends

}//dodelete ends


public static void dosearch(String s1)
{int y=Integer.parseInt(s1); boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();
Statement st1=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Vehicle");
  while(rs.next())
  {
     if(y==rs.getInt(1)) {  rrr=true; break;}
     else { rrr=false;}
      
        }
	if(rrr==true)
	{
                 JOptionPane.showMessageDialog(null,"Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                  String sss="select * from Vehicle  where vid = "+y;
	 JOptionPane.showMessageDialog(null,sss,"Search Query",JOptionPane.INFORMATION_MESSAGE);
	ResultSet rs1=st1.executeQuery("select * from Vehicle  where vid= "+y);
	  while(rs1.next())
 	 {
   	    t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getString(2)));
         	t3.setText(String.valueOf(rs1.getString(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getInt(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
		t7.setText(String.valueOf(rs1.getString(8)));
		
         	
      
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

public static void dofirst()
{int y=0,id1=0; boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();
Statement st1=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Vehicle");
  while(rs.next())
  {
     id1=rs.getInt(1);
     y++;
    if(y==1)  {break;}
      
        }
	 JOptionPane.showMessageDialog(null,"First Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from Vehicle  where vid = "+id1);
	  while(rs1.next())
 	 {
   	     t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getString(2)));
         	t3.setText(String.valueOf(rs1.getString(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getInt(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
		t7.setText(String.valueOf(rs1.getString(8)));
		
       	 }//while ends
	
	 
}//try ends
catch(Exception  ee)
{
   
}

}//dofirst function ends

public static void dolast()
{int y=0,id1=0; boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();
Statement st1=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Vehicle");
  while(rs.next())
  {
     id1=rs.getInt(1);
        }
	 JOptionPane.showMessageDialog(null,"Last Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from Vehicle  where vid = "+id1);
	  while(rs1.next())
 	 {  t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getString(2)));
         	t3.setText(String.valueOf(rs1.getString(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getInt(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
		t7.setText(String.valueOf(rs1.getString(8)));
		
       	 }//while ends
	
	 
}//try ends
catch(Exception  ee)
{
   
}

}//dolast function ends

public static Vehicle s1;
public static void main(String s[])
	{
		 s1 =new Vehicle();
s1.setTitle("Vehicle Showroom Sales System ........ Vehicle Details");
		s1.show();
	}//main ends
}//class ends








/*
public static void doconnect() 
doconnect( )  function is made static because static  function is independant of object of class.
Meaning every normal function gets memory within every object of that class but static function gets memory
once and it is shared by all objects

class  AA
{
    public d1,d2;

     public void show()
     {

     }
     public static void setdata()
     {

     }
}
p s v  m()
{
    AA A1=new AA(); 
    AA A2=new AA(); 
    AA A3=new AA();
    AA A4=new AA();
    AA A5=new AA();
}


public void show() gets memory within ojects A1,A2,A3,A4,A5 etc

     public static void setdata()  is static function so gets only one independant memory
location and that location is shared by all objects of same class

AA.setdata() static function is called by class name but not by object
*/