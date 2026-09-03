class String_methods
{
	public static void main(String args[])
	{
	//length()
	//toLowerCase
	//toUpperCase
	//trim
	//replace
	//substring(int start) and (int start,end)
	//startsWith
	//endsWith
	//charAt
	//indexOf
	//lastIndex
	// 
	
	String s1="Abdul Gani";
	String s2=new String(s1.toLowerCase());
	String s3=new String(s1.toUpperCase());
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s3.startsWith("ABdul"));	// this will throw the error
	// output: false
	System.out.println(s3.startsWith(Character.toString('A'))); // this will not throw the error
	// output: true	
	System.out.println(s3.startsWith('A'+""));	// this will throw the error
	// output: true  
	char c = 'D';
	String s = new String(new char[]{c});
	System.out.println(s); // "D"
	String s9 = "Hello";
	System.out.println(s9.getClass()); 
	// Output: java.lang.String
	System.out.println(s.getClass().getName()); 
	
	// Output: class  java.lang.String
	}
}	