import java.io.*;
import java.util.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Slideshow extends JFrame 
{ 
   public Slideshow() 
   { 
     add(new PicturePanel()); 
   } 
   
  public static void main(String args[]) 
  { 
    Slideshow frame=new Slideshow();
    frame.setTitle("Shhh"); 
    frame.setLocationRelativframe(null);
    frame.setDefaultCloseopeframe(JFrame.EXIT_ON_CLOSE); 
    frame.setSize (800,600); 
    frame.setVisible(true); 
   } 
}


  class PicturePanel extends JPanel 
  { 
    private int counter=0; 
    private ImageIcon[]image=new ImageIcon[25]; 
    public PicturePanel() 
    { 
     Timer timer=new Time(100,new TimerListener());
     timer.start(); 
    }
   }
  class TimerListener implements ActionListener 
  { 
    public void actionPerformed(ActionEvente ae) 
    { 
      if(counter==25) 
      { 
        counter=0;
      } 
      repaint(); 
      counter++; 
    }

   
  
 protected void paintComponent(Graphics g) 
 { 
   super.paintComponent(g);
   image[counter]=new ImageIcon("C:\Program Files\Java\jdk1.7.0_25\bin\Tejas 1\java_learn"); 
   add(new JLabel( image[counter]));
 }
 
}

}
}