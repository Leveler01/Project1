import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.lang.*;
import java.sql.*;

public class Mycustomer extends JFrame implements ActionListener
{
   JLabel ll,l1,l2,l3,l4,bic1,bic2;
   JTextField t1,t2;
   JTextArea ta1;
JButton b1,b2,b3,b4;
   JPanel p1;
   Container c;
   ImageIcon ic,icc;

Color c1= new Color(47,153,191);
//Color c2= new Color(101,187,217);
//Color c3= new Color(188,225,238);
//Color c4= new Color(34,111,138);
	Font f1=new Font("Footlight MT Light",Font.BOLD,20);
	Font f2=new Font("Footlight MT Light",Font.BOLD,45);
public Mycustomer()
   {
        c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.black);
		c.setName("Vehicle Showroom sales System ........ Administrator  Login details");

        p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(150,100,900,400); //150,100,900,400
		p1.setBackground(Color.black);
		c.add(p1);



b1=new JButton("Customer Requirement");
		b1.setBounds(200,30,200,30);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setFont(f1);
		p1.add(b1);

b2=new JButton("Vehicle Information");
		b2.setBounds(300,100,200,30);
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b2.setFont(f1);
		p1.add(b2);

b3=new JButton("Vehicle booking");
		b3.setBounds(400,170,200,30);
		b3.setBackground(Color.white);
		b3.setForeground(Color.black);
		b3.setFont(f1);
		p1.add(b3);
		

b4=new JButton("Complaint Details");
		b4.setBounds(500,240,200,30);
		b4.setBackground(Color.white);
		b4.setForeground(Color.black);
		b4.setFont(f1);
		p1.add(b4);
	                        
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

ic=new ImageIcon("cbr-150r-india.jpg");
			bic1=new JLabel(ic);
			bic1.setBounds(0,0,900,400);
			p1.add(bic1);

/*icc=new ImageIcon("honda.jpg");
			bic2=new JLabel(icc);
			bic2.setBounds(500,10,900,400);
			c.add(bic2);*/

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);



}//constructor ends

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
   {
                
             //JOptionPane.showMessageDialog(null,"Welcome to Customer Form","Welcome",JOptionPane.INFORMATION_MESSAGE);  
             Customer LL =new Customer();
             LL.show();
              LL.setVisible(true);
	
       
     
   }//if of b1 ends


if(ae.getSource() == b2)
   {
                
             //JOptionPane.showMessageDialog(null,"Welcome to Vehicle information Form","Welcome",JOptionPane.INFORMATION_MESSAGE);  
             Vehinfo KK =new Vehinfo();
             KK.show();
              KK.setVisible(true);
	
          }   

if(ae.getSource() == b3)
   {
                
             //JOptionPane.showMessageDialog(null,"Welcome to Vehicle booking Form","Welcome",JOptionPane.INFORMATION_MESSAGE);  
             Vehbooking KK =new Vehbooking();
             KK.show();
              KK.setVisible(true);
	
          }

if(ae.getSource() == b4)
   {
                
            // JOptionPane.showMessageDialog(null,"Welcome to Complaint Form","Welcome",JOptionPane.INFORMATION_MESSAGE);  
            Complaint KK =new Complaint();
             KK.show();
              KK.setVisible(true);
	
          }      
        
     
   }



public static void main(String s[])
	{
		Mycustomer s1 =new Mycustomer();
s1.setTitle("Vehicle Showroom Sales System ........   Administrator Login  details");
		
		s1.show();
	}//main ends
}


