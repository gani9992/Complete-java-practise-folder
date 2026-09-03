
class super1{
    public void tvOn(){
        System.out.println("tv on");
    }
    public void changeChannel(){
        System.out.println("tv channel changed");
        
    }
}
 class sub extends super1{
    //@Override
    public void changeChannel(){
        System.out.println("smart tv channel changed");
    }
    public void browse(){
        System.out.println("smart tv browse is done.");
    }
}
public class MethodOverriding
{
	public static void main(String[] args) {
		super1 s1=new super1();
		sub s2=new sub();
		super1 s3=new sub();
	//	sub s4=new super1();
		s1.tvOn();
		s1.changeChannel();
		s2.changeChannel();
		s2.browse();
		s3.tvOn();
		s3.changeChannel();
	//	s3.browse();
	}
}