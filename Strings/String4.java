class String4
{
	public static void main(String argsp[])
	{
		String a0="shaik  dharanikota abdul     gani";
		String a1=new String(a0);
		String a2[]=a1.split("\\s+");
	
		for(int i=a2.length-1;i>=0;i--)
		{
			System.out.println(a2[i] +" "+i);
	} 
	// this is for printing the word reverse order not characters in it
	
	/*for(int i=0;i<a1.length();i++)
	{
		System.out.println(a1[i]);
	
}*/
}
}