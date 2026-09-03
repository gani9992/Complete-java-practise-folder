class ConditionalOperator2
{
	public static void main(String args[])
	{
		int a=425,b=320,c=530,d=209,e;
		e=((a>b)&& (a>c)&&(a>d))?a:(b>c && b>d)?b:(c>d)?c:d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}