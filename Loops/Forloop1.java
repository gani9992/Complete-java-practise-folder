class Forloop1
{
	public static void main(String args[])
	{
		int i=0;
		for(System.out.println("initialization"); ;System.out.println("Updation"))
		{
			System.out.println("gani"+"  "+i);
			i++;
			/*if(i==10)
			{
				break;
			}
			else{
				continue;
			}
			*/
		}
		System.out.println("unreachable statement error");
	}
}
