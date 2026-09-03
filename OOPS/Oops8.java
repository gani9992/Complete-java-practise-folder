import java.util.*;
class Circle
{
	double radius;
	public Circle()
	{
	System.out.println("This is non-parameterised constructor of parent");
	}
	public Circle(double r)
	{
	//	radius=r;
	System.out.println("This is parameterised constructor of parent");
	}
	public Circle(double r,double k)
	{
	System.out.println("This is two parameterised constructor of parent");
	}
	 double area()
	{
	return Math.PI*radius*radius;
	}	
}

// child class Cylinder extends  Circle


class Cylinder extends Circle
{
	public void show()
	{
	System.out.println(radius);
	}
	double height; 
		
	public Cylinder()
	{
	System.out.println("This is non-parameterised constructor of child");
	}
	public Cylinder(double height)
	{
	super(height);
	super.radius=100;
	this.height=height;
	this.radius=90;
	System.out.println("This is parameterised constructor of child");
	//super();
	System.out.println("This is parameterised constructor of child");
	}
	public Cylinder(double h,double k)
	{
			super(h,k);
			//super(h);
	System.out.println("This is two parameterised constructor of child");
	}
	public double volume()
	{
	return area()*height;
	}	
}



class Oops8
{
	public static final void main(String[] args)
	{
		Circle st1=new Circle(10);
	//	Cylinder st1=new Cylinder(10);
		Cylinder st2=new Cylinder(10,20);
		//System.out.println(st2.volume());
		//System.out.println("The radius value of the Cylinder is: "+st2.radius);
		//System.out.println("The radius value of the Circle is: "+st2.radius);
		st2.show();
	}
}
		
		