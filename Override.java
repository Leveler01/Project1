import java.io.*;
import java.util.*;

class Emp
{
  public int Empid;
  public void show(int a)
  
  {
    Empid=a;

    System.out.println("Emlopee ID="+Empid);
  }
}

class Staff extends Emp

{

   public int staffid;
   public void show(int x)
    {
      super.show(92);
      staffid=x;
      System.out.println("Staff ID="+staffid);
}
}

public class Override
   {
     public static void main(String args[])

     {

     Staff st=new Staff();
      st.show(48);
      st.show(46);
    }
}

     
