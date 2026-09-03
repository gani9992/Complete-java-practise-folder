
class super1{
  
     static void changeChannel(){
        System.out.println("tv channel changed");
        
    }
}
 class sub extends super1{
   
     static void changeChannel(){
        System.out.println("smart tv channel changed bro");
    }
    
}
public class Inheritance1
{
	public static void main(String[] args) {
		super1 s1=new super1();
		sub s2=new sub();
		super1 s3=new sub();
		s1.changeChannel();
		s2.changeChannel();
		s3.changeChannel();
		

	}
}