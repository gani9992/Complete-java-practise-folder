import java.util.concurrent.*;
class CallableInterface1 implements Callable<String>{
public String call(){
return "this is task";
}

public static void main(String args[])throws Exception{
ExecutorService es1=Executors.newFixedThreadPool(10);
ExecutorService es2=Executors.newFixedThreadPool(10);
Future<String> f1=es1.submit(new CallableInterface1());
Future f2=es2.submit(new hello());
System.out.println(f1.get());
//System.out.println(f2.get());			o/p;- null,(due to run method return type is void it will return null).
es1.shutdown();
es2.shutdown();
}
}

class hello implements Runnable{
public void run(){
System.out.println("this is the run method...");
}

}