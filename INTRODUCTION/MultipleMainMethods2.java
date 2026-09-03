class MultipleMainMethods1
{
public static void main(String args[])			// there will be no error 
{												// and it will  be printed
System.out.println("hello world");
}
public static int main(String args1bro[])		//there will be  error
{												// and it will not be printed
System.out.println("hi world");
}
public static String main(String args1bro[])		//there will be  error
{												// and it will not be printed
System.out.println("hi world");
}
public static byte main(String args1bro[])		//there will be  error
{												// and it will not be printed
System.out.println("hi world");
}
public static float main(String args1bro[])		//there will be  error
{												// and it will not be printed
System.out.println("hi world");
}
}

// here the reason for error of 2,3,4,5 method signature is it's return type is:
// int, string, float, byte
// it should not return anything to jvm due to int,float,byte,string they will return according to  
// their datatype.