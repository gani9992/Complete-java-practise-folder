import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		
		int n1=2090000,reverse=0,n2=10,n3=100;
	
		
		while (n1>0)
		{
			n2=n1%10;
			reverse=reverse*10+n2;
			n1/=10;
		}
		System.out.println(reverse);
		
	}
}