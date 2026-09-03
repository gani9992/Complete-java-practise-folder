class MetaCharacters
{
	public static void main(String []argsps)
	{
		
		String a="gani@gmail.com";
		int  a1=a.indexOf('@');
		String userName=a.substring(0,a1);
		String domainName=a.substring(a1,a.length());
		System.out.println(userName);
		System.out.println(domainName);
		/*
		int a1=0b101101;
		System.out.println(a1);
		*/
	}
}