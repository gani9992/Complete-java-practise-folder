class CountingDigitsUsingLoop
{	public static void main(String args[])
	{
		int n1=257,count=0;
		int n2,n3;
		String n4="";
		String n5;
		
		//n2+=n1;	//error
		//System.out.println(n2);
		while(n1>0)
		{
			n2=n1%10;
			//System.out.println(n2);
			n4+=n2;
			//n5+=n2;	//error due to not initialized
			n1/=10;
			count++;
		}
		System.out.println("Reverse is: "+n4);
		System.out.println("Count is:"+count);
	}
}
