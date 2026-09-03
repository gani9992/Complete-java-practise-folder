interface m1{
default  void hello(){System.out.println("hello world");}
    void kill();
    interface m2{default void kill2(){System.out.println("default method");}}
}
public class Main
{
	public static void main(String[] args) {

	
		m1 m=new m1(){public void kill(){}};
m.hello();
		new m1.m2(){}.kill2();
	}
}