import java.util.*;
class PassingListAsParameter{
public static void main(String argsp[]){
ArrayList<Integer> l1=new ArrayList<>();
l1.add(10);
l1.add(20);
l1.add(30);
System.out.println(new PassingListAsParameter().transfer(l1));

}

int transfer(ArrayList  l1){
return 100;
}
}