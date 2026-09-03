class If2
{
public static void main(String argsp[])
{
	//String b1="0x0afa100239373";
	//String b2="0b101010111";
	//String b3="0100115730";
	String b1="10101217912";
	if(b1.matches("0b[10]+"))
	{
		System.out.println("Binary Number");	
	}
	else if(b1.matches("0[0-7]+"))	{
		System.out.println("Octal Number"); }
	else if(b1.matches("[^0][0-9]+"))
	{
		System.out.println("Decimal Number");
	}
	else if(b1.matches("0x[0-9a-fA-F]+"))
	{
	System.out.println("Hexadecimal Number");
	}
	else{
		System.out.println("Please enter the correct number");
	}
}
}