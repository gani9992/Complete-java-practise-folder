class ConditionalOperator1
{
	public static void main(String args[])
	{
		int a=25,b=20,c=30,d;
		d=a>b && a>c?a:b>c?b:c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}