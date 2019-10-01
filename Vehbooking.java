import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.sql.*;

public class Vehbooking extends JFrame implements ActionListener,FocusListener,KeyListener
{
   JLabel ll,l1,l2,l3,l4,l5,l6,l7,l8,l9,bic1,bic2;
   public static JTextField t1,t2,t3,t4,t5,t6,t7,t8;
   public static JTextArea ta1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
   JPanel p1,p2,p3;
   Container c;
   ImageIcon ic,icc;
   Font f1=new Font("Footlight MT Light",Font.ITALIC,25);
   Font f2=new Font("Bookman Old Style",Font.BOLD,35);
public Vehbooking()
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

		ll= new JLabel("Vehicle booking Details");
		ll.setBounds(80,5,600,75);
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

        l1= new JLabel("Book ID:");
		l1.setBounds(10,10,200,30);
		l1.setFont(f1);
        p2.add(l1);
		t1=new JTextField(20);
		t1.setBounds(200,10,200,30);
        p2.add(t1);

        l2=new JLabel("Vehicle Id");
		l2.setBounds(10,50, 200,30);
		l2.setFont(f1);
		p2.add(l2);
		t2=new JTextField(50);
		t2.setBounds(200,50,200,30);
		p2.add(t2);

        l3=new JLabel("Customer Id");
		l3.setBounds(10,100, 200,30);
		l3.setFont(f1);
		p2.add(l3);
        t3=new JTextField(30);
		t3.setBounds(200,100,200,30);
		p2.add(t3);

        l4=new JLabel("Order Date");
		l4.setBounds(10,150, 200,30);
		l4.setFont(f1);
		p2.add(l4);
        t4=new JTextField(30);
		t4.setBounds(200,150,200,30);
		p2.add(t4);

        l5=new JLabel("Booking Amount");
		l5.setBounds(10,200, 200,30);
		l5.setFont(f1);
		p2.add(l5);
        ta1=new JTextArea();
		ta1.setBounds(200,200,200,30);
		p2.add(ta1);

        l6=new JLabel("Balance");
		l6.setBounds(10,250, 200,30);
		l6.setFont(f1);
		p2.add(l6);
        t5=new JTextField(30);
		t5.setBounds(200,250,200,30);
		p2.add(t5);

   l7=new JLabel("Book Type");
		l7.setBounds(10,300, 200,30);
		l7.setFont(f1);
		p2.add(l7);
        t6=new JTextField(30);
		t6.setBounds(200,300,200,30);
		p2.add(t6);

l8=new JLabel("Customer name");
		l8.setBounds(10,350, 200,30);
		l8.setFont(f1);
		p2.add(l8);
        t7=new JTextField(30);
		t7.setBounds(200,350,200,30);
		p2.add(t7);

l9=new JLabel("Customer cont no");
		l9.setBounds(10,400, 200,30);
		l9.setFont(f1);
		p2.add(l9);
        t8=new JTextField(30);
		t8.setBounds(200,400,200,30);
		p2.add(t8);


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
		t3.addFocusListener(this);

		t1.addKeyListener(this);
		t2.addKeyListener(this);
		t3.addKeyListener(this);
		ta1.addKeyListener(this);
		t5.addKeyListener(this);
		t8.addKeyListener(this);
		t7.addKeyListener(this);
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

		if(ke.getSource()==t6)
		{ 
			if((v.IsLetter(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Character", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//customer name validation

		if(ke.getSource()==t7)
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
		if(ke.getSource()==t3)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//vehicle id validation
		if(ke.getSource()==ta1)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//amount validation
		if(ke.getSource()==t5)
		{ 
			if(!(v.IsNumeric(c)))
			{	
				JOptionPane.showMessageDialog(null, "This Field Only accepts Number", "Error",JOptionPane.DEFAULT_OPTION);
	                   		 ke.consume();
			}
                 		}//tax validation
		if(ke.getSource()==t8)
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
        ta1.setText("");*/

	Vehbooking.doadd();
      }

 if(b8==ae.getSource())
     {
      
hide();
      }

 if(b2==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Vehbooking.dosave(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText(),t5.getText(),t6.getText());
      }

if(b3==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Vehbooking.doupdate(t1.getText(),t2.getText(),t3.getText(),t4.getText(),ta1.getText(),t5.getText(),t6.getText());
      }

 if(b4==ae.getSource())
     {
         System.out.println("\n\tEvent occurs\n");
	 Vehbooking.dodelete(t1.getText());
      }

 if(b5==ae.getSource())
     {
     
	 Vehbooking.dofirst();
      }
if(b6==ae.getSource())
     {
     
	  Vehbooking.dolast();
      }

 if(b7==ae.getSource())
     {
      
	  Vehbooking.dosearch(t1.getText());
      }       

	if(b9==ae.getSource())
     {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        ta1.setText("");
      }

if(b10==ae.getSource())
     {
JOptionPane.showMessageDialog(null,"Form is closed","Close Messege",JOptionPane.INFORMATION_MESSAGE);

hide();
}//b10 ends

}//actionPeformed ends

public void focusLost(FocusEvent te)
{
   if(t3== te.getSource())
    {
        int cid=Integer.parseInt(t3.getText());
        Vehbooking.doselect(cid);
    }
}//methods ends

public void focusGained(FocusEvent te)
{
}//methods ends

                     /*Database Transaction Methods*/

public static void doadd()
{int y=0; boolean rrr=false;
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();

ResultSet rs=st.executeQuery("Select max(book_id) from Vehbooking");
  while(rs.next())
  { 
     y=rs.getInt(1);   
   } 
   y++; 
	
        JOptionPane.showMessageDialog(null,"New Record is added with book_id =" +y,"Search Query",JOptionPane.INFORMATION_MESSAGE);
                  
   	        t1.setText(String.valueOf(String.valueOf(y)));
        	t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        ta1.setText("");
		t2.requestFocus();
         	
      
       	
 
}//try ends
catch(Exception  ee)
{
   
}

}//doadd function ends

public static void dosave(String s1,String s2,String s3,String s4,String s5,String s6,String s7)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="insert into Vehbooking values("+s1+","+s2+","+s3+",'"+s4+"','"+s5+"','"+s6+"','"+s7+"')";     
          JOptionPane.showMessageDialog(null,sss,"Save Messege",JOptionPane.INFORMATION_MESSAGE);
          int y= st.executeUpdate(sss);
          if (y==0)
           JOptionPane.showMessageDialog(null,"Record is not saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);
          else
           JOptionPane.showMessageDialog(null,"Record is saved","Save Messege",JOptionPane.INFORMATION_MESSAGE);


        }//try ends
	catch(Exception ee)
        {
         }//catch ends

}//dosave ends

public static void doupdate(String s1,String s2,String s3,String s4,String s5,String s6,String s7)
{
try
        {

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
          System.out.println("\n\tDriver is loaded\n");

          Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
	  System.out.println("\n\tConnection is done\n");

	  Statement st=con.createStatement();
         String sss="update  Vehbooking set  vid= '"+s2+"',  cust_id= '"+s3+"', orderdate= '"+s4+"', bk_amt = '"+s5+"', balance= '"+s6+"',book_type = '"+s7+"' where book_id= "  + Integer.parseInt(s1);    
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
         String sss="delete from  Vehbooking  where book_id= "  + Integer.parseInt(s1);    
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
ResultSet rs=st.executeQuery("Select * from  Vehbooking");
  while(rs.next())
  {
     if(y==rs.getInt(1)) {  rrr=true; break;}
     else { rrr=false;}
      
        }
	if(rrr==true)
	{
                 JOptionPane.showMessageDialog(null,"Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                  String sss="select * from  Vehbooking  where book_id = "+y;
	 JOptionPane.showMessageDialog(null,sss,"Search Query",JOptionPane.INFORMATION_MESSAGE);
	ResultSet rs1=st1.executeQuery("select * from  Vehbooking where book_id = "+y);
	  while(rs1.next())
 	 {
   	    t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	t3.setText(String.valueOf(rs1.getInt(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getString(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
         	
      
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
ResultSet rs=st.executeQuery("Select * from  Vehbooking");
  while(rs.next())
  {
     id1=rs.getInt(1);
     y++;
    if(y==1)  {break;}
      
        }
	 JOptionPane.showMessageDialog(null,"First Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from  Vehbooking  where book_id = "+id1);
	  while(rs1.next())
 	 {
   	  t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	t3.setText(String.valueOf(rs1.getInt(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getString(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
         	
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
ResultSet rs=st.executeQuery("Select * from  Vehbooking");
  while(rs.next())
  {
     id1=rs.getInt(1);
        }
	 JOptionPane.showMessageDialog(null,"Last Record is found","Search Query",JOptionPane.INFORMATION_MESSAGE);
                	ResultSet rs1=st1.executeQuery("select * from  Vehbooking  where book_id = "+id1);
	  while(rs1.next())
 	 {
   	   t1.setText(String.valueOf(rs1.getInt(1)));
        	 t2.setText(String.valueOf(rs1.getInt(2)));
         	t3.setText(String.valueOf(rs1.getInt(3)));
         	t4.setText(String.valueOf(rs1.getString(4)));
        	 ta1.setText(String.valueOf(rs1.getString(5)));
         	t5.setText(String.valueOf(rs1.getString(6)));
         	t6.setText(String.valueOf(rs1.getString(7)));
         	
       	 }//while ends
	
	 
}//try ends
catch(Exception  ee)
{
   
}

}//dolast function ends

public static void doselect(int cid)
{
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
         Connection con=DriverManager.getConnection("Jdbc:Odbc:Vehicle"); 
  Statement st=con.createStatement();

ResultSet rs=st.executeQuery("Select * from  Customer where custid = "+cid);
  
	  while(rs.next())
 	 {
   	    t7.setText(String.valueOf(rs.getString(2)));
        	 t8.setText(String.valueOf(rs.getInt(3)));
         	break;
         	
      
       	 }//while ends
	
 
}//try ends
catch(Exception  ee)
{
   
}
}//doselect ends

public static Vehbooking s1;
public static void main(String s[])
	{
		 s1 =new Vehbooking();
s1.setTitle("Vehicle Showroom Sales System ........  Vehicle booking details");
		s1.show();
	}
}