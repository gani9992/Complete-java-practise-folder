import java.util.*;
class Super
{
	double radius;
	public Super()
	{
	System.out.println("This is non-parameterised constructor of parent");
	}
	public void show()
	{
	System.out.println("this is parent class method");
	}
}

// child class Sub extends  Super

class Sub extends Super
{
	public void show()
	{
	System.out.println("this is child class method");
	}
	double height; 
		
	public Sub()
	{
	System.out.println("This is non-parameterised constructor of child");
	}	
}



class Oops9
{
	public static final void main(String[] args)
	{
		Super s2=new Super();
		Sub s3=new Sub();
		Super s1=new Sub();
		s2.show();
		s3.show();
		s1.show();
		
	}
}
		
		