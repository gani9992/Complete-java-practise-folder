import java.lang.*;
import java.util.*;
public class InputRead
{
  public static void main(String args[])
  {
    // we use the javap command for the knowing the methods in the class
    // eg., javap java.util.Scanner 
    // dont use the semicolon
    // we use type command for the printing the program


    System.out.println("ENTER THE YOUR BINARY DATA");
    Scanner s=new Scanner(System.in);
    s.useRadix(10);


    // we can use any radix like radix(2) for the binary numbers reading
    //eg., s.useRadix(2)
    //int a=s.nextInt();


    int a=s.nextInt();
    System.out.println("THE BINARY DATA YOU ENTERED IS: "+a);
    System.out.println("ENTER THE YOUR INTEGER DATA");
    int a1=s.nextInt();    
    System.out.println("ENTER THE YOUR FLOAT DATA");
    float f1=s.nextFloat();
    System.out.println("ENTER THE YOUR DOUBLE DATA");

    Double d1=s.nextDouble();    
    System.out.println("ENTER THE YOUR BOOLEAN DATA");

    boolean b1=s.nextBoolean();
    System.out.println("ENTER THE ANY ONE OF YOUR  DATA");

    boolean h1=s.hasNextInt();
    System.out.println("THE INTEGER VALUE YOU ENTERED IS: "+a1);
    System.out.println("THE FLOAT VALUE YOU ENTERED IS: "+f1);
    System.out.println("THE DOUBLE VALUE YOU ENTERED IS: "+d1);
    System.out.println("THE BOOLEAN VALUE YOU ENTERED IS: "+b1);
    System.out.println("THE HAS NEXT INT  VALUE IS: "+h1);

  }
}