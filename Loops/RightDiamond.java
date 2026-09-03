class RightDiamond
{
	public static void main(String args[])
	{
		
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<i)
				{
					System.out.print((char)(64+j)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<(n-i))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
		}