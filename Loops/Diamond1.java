class Diamond
{
	public static void main(String args[])
	{
		int n=5;
		//char a='👿';	//character only accepts the unicode not any emojis  or gifs.
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=(2*i)+1;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		// here using this logic i have printed the upper traingle
			for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i+2;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*(n-i)-1;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			// using this logic i have printed the lower traingle
		}
		// by combining the lower and upper traingle we have builted the diamond
	}
}