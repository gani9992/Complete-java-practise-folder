class TerinaryOperator{
	public static void main(String args[]){
		
		int a=1500,b=1120,c=610,d=90;
		
		System.out.println((a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d);
		System.out.println(Integer.toBinaryString(-2));
	}
}