import java.io.*;
import java.util.*;

class ABC
{
   public int x,y;
   public float P;
public void show(int m,int n )
  {
     x=m;
     y=n;
     System.out.println("value="+x+y);
  }

public void show(float T)

 {
    P=T;
    System.out.println("value of="+T);
 }
}
public class Overload
{

   public static void main(String args[])
     {
        ABC AA=new ABC();
        AA.show(92,55);
        AA.show(99.45F);
     }
}

