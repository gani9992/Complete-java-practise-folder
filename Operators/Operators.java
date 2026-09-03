public class Operators
{
	public static void main(String[] gani)
	{
		byte a1=10,a2;
		short b1=20,b2;
		int c1=30,c2,c3;
		char d1=65,d2;
		a2=a1+b1;	// it will throws the error
		
		b2=a1+b1;	// it will also throws the error 
		
		c2=a1+b1;	// this will not rise the error as the 
					// literal will be considered as the 
					// integer literal only.
					
		d2=d1+a1;	// it will throws the error as the integer 
					// is cann't be converted to char which leads
					// lossy conversion
					
		c3=d1+a1+b1+c1;	// this will not throw the error as it is
						//integer.
					
		//--> by default any non decimal point is integer only.
		//** so if you try to store in an byte or short it is error.
		//--> by default any decimal point is double only.
		
		//System.out.println("the sum of a1 and b1 is: "+a2);
		//System.out.println("the sum of a1 and b1 is: "+b2);
		System.out.println("the sum of a1 and b1 is: "+c2);
		System.out.println("the sum of a1 and b1 is: "+d1);
		System.out.println("the sum of a1 and b1 is: "+c3);
	}
}
