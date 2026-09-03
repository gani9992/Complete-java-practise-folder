class VariableArg
{
	static void show(int ...a){
		//for(int x[]:a)
		//{
			for(int y:a){
			System.out.print(y+" " );
			//System.out.format("%(9d ",x);
			}	System.out.println();
		//}
	
	}
	public static void main(String[] args)
	{
		//show(null);
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		//show(a);
		//show(new int[]{10,20});
		//show(new int[]{10,20,20,30,90});
		//show(new int[]{10,20,20,30,90,20,30,90});
		show(a);
	}
}