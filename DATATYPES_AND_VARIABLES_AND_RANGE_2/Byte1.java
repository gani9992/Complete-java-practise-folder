class Byte1{
	public static void main(String argsp[])
	{
		byte a1=101;
		a1=101+30;		// this is error
		byte a2=10l;	// this is error
		byte a3=10;
		a3=a3+10;		// this is error
		byte a4=10,a5=30,a6;
		a6=a4+a5;		// this is error
		
		System.out.println(a1);
	}
}