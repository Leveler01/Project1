import java.awt.*;
import java.awt.event .*;
import javax.swing.*;
import javax.swing.event.*;
public class Combo1 extends JFrame 
{

	public void Combo1()
        {
	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());

	JComboBox jc = new JComboBox();
	jc.addItem("Home");
	jc.addItem("Travel");
	jc.addItem("Airport");

	cp.add(jc);
        }

public static void main(String args[])
{
     Combo1 cc=new Combo1();
     cc.show(); 
}

}