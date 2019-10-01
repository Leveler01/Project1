import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Container;
import java.lang.*;
import java.sql.*;

public class JTableDemo extends JFrame
{
   public void JTableDemo()
   {
	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());
	final String []colHeads ={"Name","Email","Phone"};
	 final Object [][]data = {{"john","John@yahoo.com","987656789"},{"jerry","jerry@gmail.com","0987654321"}};

    JTable JT = new JTable(data,colHeads);	
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp = new JScrollPane(JT, v ,h); 	
    cp.add(jsp,BorderLayout.CENTER); 		
   }//constructor ends

public static void main(String args [ ])
{
     JTableDemo JT=new JTableDemo();
     JT.show(); 
}
}
