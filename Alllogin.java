import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.lang.*;
import java.sql.*;

public class Alllogin extends JFrame implements ActionListener

{


   JLabel ll,l1,l2,bic1;
//  JTextField t1,t2,t3;
//   JTextArea ta1;
	JButton b1,b2;
   JPanel p1,p2,p3;
   Container c;
  ImageIcon ic,icc;

   

Color c1= new Color(47,153,191);
//Color c2= new Color(101,187,217);
//Color c3= new Color(188,225,238);
//Color c4= new Color(34,111,138);
	Font f1=new Font("Footlight MT Light",Font.BOLD,20);
	Font f2=new Font("Footlight MT Light",Font.BOLD,45);
public Alllogin()
{
c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.black);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(300,50,750,75);//300,100,750,100
		p1.setBackground(Color.black);
		c.add(p1);

		ll= new JLabel("Vehicle Showroom Sales System");
		ll.setBounds(50,5,700,75); //50,5,700,75
		ll.setForeground(Color.white);
		ll.setFont(f2);
		p1.add(ll);

		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(380,130,560,420);
		p2.setBackground(Color.white);
		c.add(p2);

ic=new ImageIcon("activa1.jpg");
			bic1=new JLabel(ic);
			bic1.setBounds(0,0,560,420); //0,0,900,400
			p2.add(bic1);


		p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(300,650,700,150); //300,100,750,100
		p3.setBackground(Color.black);
		c.add(p3);


b1=new JButton("Admin login");
		b1.setBounds(150,10,200,30);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setFont(f1);
		p3.add(b1);


b2=new JButton("User login");
		b2.setBounds(400,10,200,30);
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b2.setFont(f1);
		p3.add(b2);
		
	                     b1.addActionListener(this);
		     b2.addActionListener(this);



		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);

	
}//constructor ends

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
   {
                
             //JOptionPane.showMessageDialog(null,"Welcome to B.U.Bhandari","Welcome",JOptionPane.INFORMATION_MESSAGE);  
             Login  LL = new Login();
             LL.show();
	hide();
          }   
        
     
 

if(ae.getSource() == b2)
        {
                
             //JOptionPane.showMessageDialog(null,"Welcome to B.U.Bhandari","Welcome",JOptionPane.INFORMATION_MESSAGE);  
             Userlogin kk =new Userlogin();
             kk.show();
	hide();
          }   
        
     
 


}
public static void main(String s[])
	{
		Alllogin s1 =new Alllogin();
		 
s1.setTitle("Vehicle Showroom Sales System ........ Welcome Page");
		s1.show();
	}//main ends
}//class ends
	                   