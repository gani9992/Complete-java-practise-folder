// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SuperCallilngExplicitely1 {
    public static void main(String[] args) {
        System.out.println("Main class");
		child c1=new child();
    }
}
class parent{
/*   
   parent(int a){
        System.out.println("this is parent class");
    }
	 parent(){
       System.out.println("this is parent class");
    }
	*/
}
class child extends parent{
    child(){
		super();
        System.out.println("this is child class");
    }
}