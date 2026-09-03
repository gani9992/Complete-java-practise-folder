
 
 
 abstract class shape{
  
      abstract double perimeter();
}
 class circle extends shape{
	int radius;
	public circle(int r)
	{
		this.radius=r;
	}
	
     double perimeter(){
			return 2*Math.PI*radius;
    }    
}

/*
 class rectangle extends shape{
	int length,breadth;
	public rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	
      double perimeter(){
			return length*breadth;
    }    
}
*/


 class Abstract1
{
	public static void main(String[] args) {
		shape s1=new circle(10);			// this is dynamic method dispatch.
		shape s2=new rectangle(10,20);		// this is dynamic method dispatch.
		System.out.println(s1.perimeter());
		System.out.println(s2.perimeter());

	}
}