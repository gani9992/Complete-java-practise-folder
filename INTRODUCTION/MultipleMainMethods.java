class MultipleMainMethods1
{
public static void main2(String args[])			// there will be no error 
{												// but it will not be printed
System.out.println("hello world");
}
public static void main(String args1bro[])		//there will be no error
{												// and it will be printed
System.out.println("hi world");
}
}