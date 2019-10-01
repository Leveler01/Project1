import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.lang.*;
import java.sql.*;


public class MyLogin extends JFrame implements ActionListener
{
   JLabel ll,l1,l2,l3,l4,bic1,bic2;
   JTextField t1,t2;
   JTextArea ta1;
JButton b1,b2;
   JPanel p1;
   Container c;
      ImageIcon ic,icc;

Color c1= new Color(47,153,191);
Color c2= new Color(101,187,217);
Color c3= new Color(188,225,238);
Color c4= new Color(34,111,138);
	Font f1=new Font("Footlight MT Light",Font.BOLD,15);
	Font f2=new Font("Footlight MT Light",Font.BOLD,45);
public MyLogin()
   {
        c=getContentPane();
		c.setLayout(null);
		c.setVisible(true);
		c.setSize(800,800);
		c.setBackground(Color.yellow);
		c.setName("Card Designing and Printing System ........ Admin Login  Details");
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(300,10,600,65);
		c.add(p1);

		ll= new JLabel("Login Details");
		ll.setBounds(10,10,600,75);
		p1.setBackground(new Color(201,245,247));
		p1.add(ll);

        p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(150,100,900,400);
		p1.setBackground(new Color(207,178,228));
		c.add(p1);

		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(400,550,550,125);
		p1.setBackground(new Color(251,252,195));
		c.add(p1);

        l1= new JLabel("Enter your username:");
		l1.setBounds(500,10,200,30);
        p1.add(l1);
		t1=new JTextField(20);
		t1.setBounds(200,10,100,30);
        p1.add(t1);

        l2=new JLabel("Enter your password");
		l2.setBounds(500,50, 200,30);
		p1.add(l2);
		t2=new JTextField(50);
		t2.setBounds(200,50,100,30);
		p1.add(t2);

                

         b1=new JButton("Submit");
		b1.setBounds(10,30,100,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		p1.add(b1);

		b2=new JButton("Clear");
		b2.setBounds(120,30,100,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		p1.add(b2);

		


		ic=new ImageIcon("g2.jpeg");
			bic1=new JLabel(ic);
			bic1.setBounds(400,40,200,300);
			p1.add(bic1);

			icc=new ImageIcon("r11.jpeg");
			bic2=new JLabel(icc);
			bic2.setBounds(650,50,200,300);
			p1.add(bic2);


			b1.addActionListener(this);
                                       	 b2.addActionListener(this);

		
}//constructor ends

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
   {
         t1.setText(" ");
         t2.setText(" ");
   }//if of b1 ends

    if(ae.getSource() == b2)
   {
JOptionPane.showMessageDialog(null,"event occours","Connection Messege",JOptionPane.INFORMATION_MESSAGE);
     }   
}//method ends

public static void main(String s[])
	{
		MyLogin s1 =new MyLogin();
s1.setTitle("Vehicle Showroom Sales System ........   Administrator Login  details");
		
		s1.show();
	}//main ends


}//class ends