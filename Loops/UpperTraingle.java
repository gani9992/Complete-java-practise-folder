class UpperTraingle
{
	public static void main(String args[])
	{
		//int n=5;
		/* //char a='👿';	//character only accepts the unicode not any emojis  or gifs.
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=(2*i)+1;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		}
		}*/
		int n=5;
		//char a='👿';	//character only accepts the unicode not any emojis  or gifs.
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j+i)>n)
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