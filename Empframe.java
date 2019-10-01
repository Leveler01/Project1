import java.awt.*;
import java.awt.event.*;
public class Empframe extends Frame

{

     static private final int frame_height=150;
     static private final int frame_width=250;

public Empframe()
   
    {
  
      addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)

          {
             System.exit(0);
          }

     });

    
        setBackground(Color.red);
        setForeground(Color.black);
        setTitle("Warning");
        setSize(frame_width,frame_height);
    }
public static void main(String[]args)
     
	{
      		 Empframe f=new Empframe();
       		 f.show();
	}
}
                        

 