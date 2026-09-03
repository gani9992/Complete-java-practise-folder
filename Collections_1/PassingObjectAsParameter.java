import java.util.*;
class PassingTheListAsMethodObject{
public static void main(String argsp[]){
ArrayList<Integer> l1=new ArrayList<>();
l1.add(10);
l1.add(20);
l1.add(30);
System.out.println(transfer(l1));

}

int transfer(Integer  l1){
return 100;
}
}