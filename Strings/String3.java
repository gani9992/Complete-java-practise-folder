class String3
{
	public static void main(String... abdul_gani)
	{
		byte  [] a={65,66,67,76};
		
		String s=new String(a);
		int s1=10;
		float f1=23.455f;
		//System.out.printf("%(d",s1);//no error prints successfully
		//System.out.printf("%)d",s1);// error
		System.out.printf("%s",s); 	//no error prints successfully
		/*System.out.printf("%0d",s1);//not an error
		System.out.printf("%1d",s1);// error
		System.out.printf("%010d",s1);// no error 
		System.out.printf("%110d",s1);//error*/
		System.out.printf("\n%1.0f",f1);
	}
}