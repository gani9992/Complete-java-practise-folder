class Pattern8
{
	public static void main(String args[])
	{
	int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//count++;
				System.out.print("  ");
			}
			for(int j=1;j<=(5-i);j++)
			{
			System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}