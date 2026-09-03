 interface ab{
     void display();
 }
 interface ba{
     void show();
 }
public class Main
{
      public static void main(String[] args) {
	   ab a1=new ab(){
	   public    void display(){
	           System.out.println("this is method bro");
	       }
	   };
	  
	   a1.display();
	      ab a2=new ab(){
	   public    void display(){
	           System.out.println("this is method bro");
	       }
	   };
	   a2.display();
	}
}