class Pattern9
{
	public static void main(String args[])
	{
	int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i)+1;j++){
			System.out.print(j+" ");
			}
			if(i!=1){
			for(int j=1;j<(2*i)-1;j++){
			System.out.print("*"+" ");
			}}
			else{
				System.out.print("");
			}
			for(int j=(5-i)+1;j>=1;j--){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}