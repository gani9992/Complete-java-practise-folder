public class DoubleWithOctalAndHexadecimal
{
	public static void main(String args[])
	{
		double d1=123.456;
		System.out.println(d1);
		double d2=0123.456;	// this will be considered as decimal
							// only.
		System.out.println(d2);
		
		double d3=0xf1a10.110;	// this will rise the error
		System.out.println(d3);
		
		double d4=0b1.0;	// this will rise the error
		System.out.println(d4);
		
		boolean b=0;
		System.out.println(b);
	}
}

	