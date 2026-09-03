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

// here it will only prints the main method only until then no matter how many main methods
// with the void return type will be thrown an error but those data will not be printed.