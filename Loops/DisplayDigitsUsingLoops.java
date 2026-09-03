class DisplayDigitsUsingLoop
{	public static void main(String args[])
	{
		int n1=257;
		int n2,n3;
		String n4="";
		String n5;
		//n2+=n1;	//error
		//System.out.println(n2);	//error due to not initialized.
		while(n1>0)
		{
			n2=n1%10;
			System.out.println(n2);
			n4+=n2;
			//n5+=n2;	//error due to not initialized
			n1/=10;
		}
		System.out.println(n4);
	}
}
