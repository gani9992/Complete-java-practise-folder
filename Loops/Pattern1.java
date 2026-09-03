import java.util.*;
class Pattern1
{
	
	public static void main(String args[])
	{
		System.out.println("please enter the n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=(n-i))
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}