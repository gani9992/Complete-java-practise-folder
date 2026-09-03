  
  import java.util.*;
  class Circle
{
	 float radius;
	public String toString()
	{
	//return String.valueOf((float)Math.PI*radius*radius);
	
	// or we can use
	//-->return ""+(float)Math.PI*radius*radius)
	//--> or we can use  Scanner class
	Scanner sc=new Scanner((float)Math.PI*radius*radius);
	String a1=sc.nextLine();
	return a1;
	
}
}
	

public class Oops1 
{
	
	public static void main(String args[])
	{
		Circle d1=new Circle();
		Circle d2=new Circle();
		d1.radius=30;
		//d2.radius=50;

		//float d3=d2.area();
		//System.out.println("the area is: "+d1.area());
		//System.out.println("the area is: "+d2.area());
		d2.radius=50;
		System.out.println("the area is: "+d1);
		System.out.println("the area is: "+d2);
	}
}