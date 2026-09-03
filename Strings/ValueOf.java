class ValueOf
{
public static void main(String argsp[])
{
int a=10;
String b=String.valueOf(a);

System.out.println(b.getClass());
System.out.println(((Object)a).getClass());	
System.out.println(String.valueOf(a).getClass());		//class java.lang.String 
System.out.format("\n%s",String.valueOf(a).getClass().getName());	//java.lang.String 
System.out.printf("\n%s",String.valueOf(a).getClass().getName());	//java.lang.String 

}
}