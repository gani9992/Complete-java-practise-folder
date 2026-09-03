
@FunctionalInterface	// this is not mandatory if it has only one method
interface A
{
  void hai();
 @FunctionalInterface	// this is not mandatory if it has only one method
  interface B
    {
        void hello();
     @FunctionalInterface	// this is not mandatory if it has only one method
     interface C
     {
       void welcome();
     }
   }
  
}
public class Round2
{
static public void main(String...arg)
{

A r= ()-> {System.out.println("this is interface 1 method");};
A.B v=()->System.out.println("this is interface 2 method");

A.B.C  z=new A.B.C(){
    public void welcome() 
  {
   System.out.println("this is interface 3 method");
   
  }};
r.hai();
v.hello();
z.welcome();

}}