import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
public class validation
{
	public boolean IsLetter(char c) 
	{
		if((Character.isDigit(c) ||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE))) 
		{	
		      return true;
		}
		else
		{
			return false;
		}
	}
	public boolean IsNumeric(char c)
	{
		if((Character.isDigit(c) ||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE))) 
		{	          
			return true;
		}
		else
		{
			return false;
		}
	}
		     
}