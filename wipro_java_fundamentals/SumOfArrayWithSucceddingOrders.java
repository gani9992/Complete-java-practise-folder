class SumOfArrayWithSucceddingOrders
{
	static int indexOfSeven(int a[]){
		int sign=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==7){
				//System.out.println("index of seven is: "+i);
				sign=i;
			}
		}
		return sign;
	}
	static int indexOfSix(int a[]){
		int sign=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==6){
			//	System.out.println("index of six is: "+i);
				sign=i;
			}
		}
		return sign;
	}
	public static void main(String args[])
	{
		int a[]={10,3,6,1,2,7,9};
		//int a[]={7,1,2,3,6};
		//int a[]={1,6,4,7,9};
		int sum=0;
		boolean b1=isIndexOfSixIsLessThanSeven(a);
		if(b1){
		for(int i=0;i<indexOfSix(a);i++)
		{
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i>indexOfSeven(a))
			sum+=a[i];
		}
		System.out.println(sum);	
		}
		else{
			//int sum=0;
			for(int i=0;i<a.length;i++){
				sum+=a[i];
			}
			System.out.println(sum);
		}
	}
	public static boolean isIndexOfSixIsLessThanSeven(int a[]){
		int c1=0,c2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==6){
				//System.out.println(i);
				c1=i;}
			
			if(a[i]==7){
				//System.out.println(i);
				c2=i;}
		}
		if(c1<c2){
			//System.out.println(c1<c2);
			return true;
			}
		else{
			return false;
		}}

}
