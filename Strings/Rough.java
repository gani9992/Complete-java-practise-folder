class Rough
{
public static void main(String arga[])
{
float a1=2342.218f,a2=2380.34f,a3;
a3=a1+a2;
System.out.println(a3);
char c1='\ucbba';
int a5='\u0bba'; // this value is 3002
String a6="hello";
char a7[]=a6.toCharArray();
char a8[]={'h','i',' ','g','a','n','i'};
byte a9[]={1,20,40,50};
	
System.out.print(c1);
System.out.println(a5);
System.out.println(a7);
System.out.println(a8);
System.out.println(a9);
}
}
// in java there are some escape characters
// which are directly accepted by the char 
// datatype.
// they are /b,/n,/t,/f,/r ,/',/",//

// by every we enter the slash it will give 
// us the error only if and only if we enter
// escape characters it will doesnot rise
// any error.
/*  /**/