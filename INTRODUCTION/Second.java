import java.lang.*;
import java.util.*;
public class Second
{
  public static void main(String args[])
  {
    System.out.println("ENTER THE YOUR BINARY DATA");
  Scanner s=new Scanner(System.in);
  s.useRadix(2);
int a=s.nextInt();
  System.out.println("THE BINARY DATA YOU ENTERED IS: "+a);
  }
}