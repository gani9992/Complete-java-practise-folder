class Regex2{
public static void main(String argsp[])
{
	String a1="a1bcd345@gmail.com";
	System.out.println(a1.matches("[a-z0-9]*@gmail.com"));
	System.out.println("AB@gmail.com".matches("[^a-x@][^@gmail.com]*@gmail.com"));
}
}