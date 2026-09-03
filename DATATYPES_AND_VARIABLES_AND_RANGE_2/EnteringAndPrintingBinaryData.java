import java.util.Scanner;
class EnteringAndPrintingBinaryData
{
	public static void main(String args[])
	{
		System.out.println("enter binary data:  ");
		Scanner sc=new Scanner(System.in);
		sc.useRadix(2);
		int sc1=sc.nextInt();
		System.out.println(sc1);
		System.out.println("The binary data you entered is: "+Integer.toBinaryString(sc1));
		System.out.printf("The decimal data is: %d\n",sc1);
		System.out.printf("The octal data is: %o\n",sc1);
		System.out.printf("The hexadecimal data is: %x\n",sc1);
		String a1="gani l1";
		String a2=new String("gani l1");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}