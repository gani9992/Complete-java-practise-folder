 class StartWith
 {
	 public static void main(String args[])
	 {
		 String s1="Mr.m Sharumkh mKhan";
		 System.out.println(s1.startsWith("m",3));
		 System.out.println(s1.endsWith("KHan"));
		 
		 System.out.println(s1.indexOf("m",5));
		 char c1='a';
		// String s2=(String)c1;	// this will results in the error
	 }
 }