/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.FileReader;
import java.io.FileNotFoundException;
public class StackOverflowError1
{
   
    static void m1(){
        m2();
    }
    static void m2(){
        m1();
    }
	public static void main(String[] args) {
	    try{
	    m1();
	    }
	    catch(StackOverflowError e){
	        System.out.println("we caught it...");
	    }

	}
}