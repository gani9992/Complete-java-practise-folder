class Forloop2
{
	public static void main(String args[])
	{
		// byte i,j;
		// int i,j;
		// short i,j;
		// long i,j;	
		// char i,j;
		char a1;int a2;
		for(a1=74;a1<=81;a1++)
		{
			//System.out.println(a1);
			for(int i=0;i<10;i++)
			{
				if(i<6&&a1=='J')
				{
					continue;
				}
				else if(i>2 && a1=='Q')
				{
					break;
				}
					
				System.out.println("23481A12"+a1+" "+i);
			}
		}
	}
}
