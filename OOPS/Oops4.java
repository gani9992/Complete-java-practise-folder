import java.util.*;
class Student{
	 float length,breadth;
	public Student(){
		length =1;
		breadth=1;
	}
	public Student(int l,int b){
		if(l>0)		//
		{			//here instead of writing this many lines of code we can use the
		length=l;	//functions as below:
		}			// setLength(l);setbreadth(b);
		else		// 
		{			//void setLength(int l)
		length=0;	//{if(l>0){length=l;}else{length=0;}
		}			//}
		if(b>0)		//
		{			//void setbreadth(int b)
		breadth=b;	//{ if(b>0){breadth=b;}else{breadth=0;}
		}			//}
		else		//
		{breadth=0;	//
		}			//
	}
	public String area(){
		return "The area is: "+length*breadth;
	}
		
}
	

class Oops4
{
	public static strictfp void main(String[] args)
	{
		Scanner sc=new Scanner(123.89);
		//String s1=sc.next();
		int b1=sc.nextInt();
		
	//	char s1=sc.nextChar();
		Student st=new Student(10,20);
		System.out.println(st.area());
		System.out.println(s1);
		System.out.println(b1);
		
	}
}
		