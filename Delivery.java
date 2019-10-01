import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.sql.*;
import java.util.*;
public class Delivery extends JFrame implements ActionListener , KeyListener

{
   JLabel ll,l1,l2,l3,l4,l5,bic1,bic2;
   public static JTextField t1,t2,t3,t4;
   public static JTextArea ta1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
   JPanel p1,p2,p3;
   Container c;
   ImageIcon ic,icc;
   Font f1=new Font("Footlight MT Light",Font.ITALIC,25);
   Font f2=new Font("Bookman Old Style",Font.BOLD,35);

 
public Delivery()
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

		ll= new JLabel("Delivery Details");
		ll.setBounds(140,10,600,75);
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

        l1= new JLabel("Delivery_Id:");
		l1.setBounds(10,10,200,30);
		l1.setFont(f1);
        p2.add(l1);
		t1=new JTextField(20);
		t1.setBounds(200,10,200,30);
        p2.add(t1);

        l2=new JLabel("Booking No");
		l2.setBounds(10,50, 200,30);
		l2.setFont(f1);
		p2.add(l2);
		t2=new JTextField(50);
		t2.setBounds(200,50,200,30);
		p2.add(t2);

        l3=new JLabel("Vehicle Id");
		l3.setBounds(10,100, 200,30);
		l3.setFont(f1);
		p2.add(l3);
        t3=new JTextField(30);
		t3.setBounds(200,100,200,30);
		p2.add(t3);

        l4=new JLabel("Customer Id");
		l4.setBounds(10,150, 200,30);
		l4.setFont(f1);
		p2.add(l4);
        t4=new JTextField(30);
		t4.setBounds(200,150,200,30);
		p2.add(t4);

        l5=new JLabel("Delivery Date");
		l5.setBounds(10,200, 200,30);
		l5.setFont(f1);
		p2.add(l5);
        ta1=new JTextArea();
		ta1.setBounds(200,200,200,30);
		p2.add(ta1);

     


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
		t3.addKeyListener(this);   
		t4.addKeyListener(this);    
		    

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
                 		}
		if(ke.getSource()==t2)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}
		if(ke.getSource()==t3)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}
		if(ke.getSource()==t4)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}
		
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
	 ta1.setText("");*/

	 Delivery.doadd();
     }

 if(b8==ae.getSource())
     {
      
hide();
      }

if(b2==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Delivery.dosave(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText());
      }

	if(b9==ae.getSource())
     {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        ta1.setText("");
      }


 if(b3==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Delivery.doupdate(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText());
      }

 if(b4==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Delivery.dodelete(t1.getText());
      }

if(b5==ae.getSource())
     {
     
	 SPerson.dofirst();
      }
if(b6==ae.getSource())
     {
     
	 SPerson.dolast();
      }

 if(b7==ae.getSource())
     {
      
	 SPerson.dosearch(t1.getText());
      }

if(b9==ae.getSource())
     {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        ta1.setText("");
      }

if(b10==ae.getSource())
     {
JOptionPane.showMessageDialog(null,"Form is closed","Close Messege",JOptionPane.INFORMATION_MESSAGE);
/* addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)

          {

             System.exit(0);
          }

     });*/
       // s1.dispose();
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

ResultSet rs=st.executeQuery("Select max(del_id) from Delivery");
  while(rs.next())
  { 
     y=rs.getInt(1);   
   } 
   y++; 
	
        JOptionPane.showMessageDialog(null,"New Record is added with del_id =" +y,"Search Query",JOptionPane.INFORMATION_MESSAGE);
                  
   	        t1.setText(String.valueOf(String.valueOf(y)));
        	 
        t2.setText("");
        t3.setText("");
        t4.setText("");
        ta1.setText("");
		t2.requestFocus();
         	
      
       	
 
}//try ends
catch(Exception  ee)
{
   
}

}//doadd function ends


public static void dosave(String s1,String s2,String s3,String s4,String s5)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="insert into Delivery values("+s1+","+s2+","+s3+","+s4+",'"+s5+"')";     
          JOptionPane.showMessageDialog(null,sss,"Save Messege",JOptionPane.INFORMATION_MESSAGE);
          int y= st.executeUpdate(sss);
          if (y==0)
           JOptionPane.showMessageDialog(null,"Record is not saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);
          else
           JOptionPane.showMessageDialog(null,"Record is saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);

con.close();
        }//try ends
	catch(Exception ee)
        {
         }//catch ends

}//dosave ends



public static void doupdate(String s1,String s2,String s3,String s4,String s5)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="update  Delivery set  book_no= "+s2+",  vid_id= "+s3+", cust_id= "+s4+", deldate = '"+s5+"' where del_id= "  + Integer.parseInt(s1);    
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
         String sss="delete from  Delivery   where del_id= "  + Integer.parseInt(s1);    
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
ResultSet rs=st.executeQuery("Select * from Delivery");
  while(rs.next())
  {
     if(y==rs.getInt(1)) {  rrr=true; break;}
     else { rrr=false;}
      
        }
	if(rrr==true)
	{
                 JOptionPane.showMessageDialog(null,"Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                  String sss="select * from Delivery  where del_id = "+y;
	 JOptionPane.showMessageDialog(null,sss,"Search Query",JOptionPane.INFORMATION_MESSAGE);
	ResultSet rs1=st1.executeQuery("select * from Delivery  where del_id = "+y);
	  while(rs1.next())
 	 {
   	         t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	 t3.setText(String.valueOf(rs1.getInt(3)));
         	 t4.setText(String.valueOf(rs1.getInt(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	
         	
      
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
ResultSet rs=st.executeQuery("Select * from Delivery");
  while(rs.next())
  {
     id1=rs.getInt(1);
     y++;
    if(y==1)  {break;}
      
        }
	 JOptionPane.showMessageDialog(null,"First Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from Delivery  where del_id = "+id1);
	  while(rs1.next())
 	 {
   	    t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	 t3.setText(String.valueOf(rs1.getInt(3)));
         	 t4.setText(String.valueOf(rs1.getInt(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	
      
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
ResultSet rs=st.executeQuery("Select * from Delivery");
  while(rs.next())
  {
     id1=rs.getInt(1);
        }
	 JOptionPane.showMessageDialog(null,"Last Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from Delivery where del_id = "+id1);
	  while(rs1.next())
 	 {
   	   t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	 t3.setText(String.valueOf(rs1.getInt(3)));
         	 t4.setText(String.valueOf(rs1.getInt(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	
         	
       	 }//while ends
	
	 
}//try ends
catch(Exception  ee)
{
   
}

}//dolast function ends


public static  Delivery s1;
public static void main(String s[])
	{
		 s1 =new Delivery();
s1.setTitle("Vehicle Showroom Sales System ........ Delivery Details");
		s1.show();
	}
}