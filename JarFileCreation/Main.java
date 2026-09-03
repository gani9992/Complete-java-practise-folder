class Main{
public static void main(String args[]){
Student s=new Student();
Teacher t=new Teacher();
System.out.println(s);
System.out.println(t);
System.out.println(s.hashCode());
System.out.println(t.hashCode());
s.attend();

}
}