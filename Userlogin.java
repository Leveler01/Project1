import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.lang.*;
import java.sql.*;

public class Userlogin extends JFrame implements ActionListener
{
   JLabel ll,l1,l2,l3,l4,bic1,bic2;
   JTextField t1;
    JPasswordField t2;
   JTextArea ta1;
JButton b1,b2;
   JPanel p1;
   Container c;
   ImageIcon ic,icc;

Color c1= new Color(47,153,191);
//Color c2= new Color(101,187,217);
//Color c3= new Color(188,225,238);
//Color c4= new Color(34,111,138);
	Font f1=new Font("Footlight MT Light",Font.BOLD,20);
	Font f2=new Font("Footlight MT Light",Font.BOLD,45);
public Userlogin()
   {
        c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.black);
		c.setName("Vehicle Showroom sales System ........ User Login details");
		

		

        p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(150,100,800,532); //150,100,900,400
		p1.setBackground(Color.black);
		c.add(p1);

ll= new JLabel(" B.U. Bhandari Sales Co. ");
		ll.setBounds(200,10,600,75);
		ll.setForeground(Color.blue);
		ll.setFont(f2);
		p1.setBackground(new Color(201,245,247));
		p1.add(ll);

ll= new JLabel(" User  Login Details");
		ll.setBounds(300,100,400,75);
		ll.setForeground(Color.black);
		ll.setFont(f2);
		p1.setBackground(new Color(201,245,247));
		p1.add(ll);

 l1= new JLabel("Enter your username:");
		l1.setBounds(400,200,200,30);
		l1.setForeground(Color.black);
		l1.setFont(f1);
        p1.add(l1);
		t1=new JTextField(20);
		t1.setBounds(650,200,130,30);
        p1.add(t1);

        l2=new JLabel("Enter your password");
		l2.setBounds(400,250, 200,30);
		l2.setForeground(Color.black);
		l2.setFont(f1);
	p1.add(l2);
		t2=new JPasswordField(50);
		t2.setBounds(650,250,130,30);
		p1.add(t2);

 b1=new JButton("Login");
		b1.setBounds(550,350, 100,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		p1.add(b1);

		b2=new JButton("Clear");
		b2.setBounds(680,350, 100,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		p1.add(b2);


		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();	
		setSize(screenSize.width,screenSize.height);

ic=new ImageIcon("Showroom.jpg");
			bic1=new JLabel(ic);
			bic1.setBounds(0,100,800,532);
			p1.add(bic1);



			/*icc=new ImageIcon("cbz1.jpg");
			bic2=new JLabel(icc);
			bic2.setBounds(400,70,700,300);
			p1.add(bic2);*/

		b1.addActionListener(this);
		b2.addActionListener(this);	

}


public static void main(String s[])
	{
		Userlogin s1 =new Userlogin();
s1.setTitle("Vehicle Showroom Sales System ........   Administrator Login  details");
		
		s1.show();
	}//main ends

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
   {
        if( t1.getText().equals("User") && t2.getText().equals("User"))
         {
             JOptionPane.showMessageDialog(null,"Login is correct","Login Messege",JOptionPane.INFORMATION_MESSAGE);  
             Mycustomer LL =new Mycustomer();
             LL.show();
             hide();
         }
       else
        {
             JOptionPane.showMessageDialog(null,"Login is not  correct","Connection Messege",JOptionPane.INFORMATION_MESSAGE);  
         }
   }//if of b1 ends

    if(ae.getSource() == b2)
   {
           t1.setText("");
           t2.setText("");
           t1.requestFocus();
     }   
}//method ends
}//class ends