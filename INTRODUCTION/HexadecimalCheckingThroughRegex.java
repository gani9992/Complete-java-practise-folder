class HexaDecimalCheckingThroughRegex
{
	public static void main(String []argsps)
	{
		
		String a="2348af019";

		boolean b1=a.matches("[0-9a-fA-F]*");
		if(b1)
		{
		System.out.println("It is the hexadecimal number");
		}
		else{
		System.out.println("It is the not hexadecimal number");

		}
	//	System.out.println(domainName);
		
	}
}