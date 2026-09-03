class AssignmentOperator
{
	public static void main(String... gani)
	{
		int a=10,b=20,c=30;
		a+=10;
		System.out.println("THIS IS STEP 1: "+a);
		a-=10;
		System.out.println("THIS IS STEP 2: "+a);
		a*=10;
		System.out.println("THIS IS STEP 3: "+a);
		a/=10;
		System.out.println("THIS IS STEP 4: "+a);
		a%=10;
		System.out.println("THIS IS STEP 5: "+a);
		a&=10;
		System.out.println("THIS IS STEP 6: "+a);
		a|=10;
		System.out.println("THIS IS STEP 7: "+a);
		a>=10;	//this will throw the error 
		System.out.println("THIS IS STEP 8: "+a);
		a<=10;	//this will throw the error
		System.out.println("THIS IS STEP 9: "+a);
		a==10;	//this will throw the error
		System.out.println("THIS IS STEP 10: "+a);
		a!=10;	//this will throw the error
		System.out.println(a);
		
		System.out.println("THIS IS STEP 11: "+a>10);	//this will throws the error as 
														//first type:string
														//second type:int
		a&&=10;	//this will throw the error
		a||=10;	//this will throw the error
		a!=10;	//this will throw the error
											
		System.out.println(a>10);
	}
}
	