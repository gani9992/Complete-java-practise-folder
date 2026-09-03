class ParameterPassing
{
static void change(String a)
{
a+="shaik";
//System.out.println(a);
//return a;

}
static void change2(String a)
{
	a+="shaik";
}
static void change3(char[] a)
{
	a[0]='s';
}
public static void main(String args[])
{
String a="gani";
change(a);
String a1=new String("gani ");
change2(a1);
char a2[]={'a','b','d','u','l'};
change3(a2);
System.out.println(a);
System.out.println(a1);
System.out.println(a2);
}
}