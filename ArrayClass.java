class ArrayClass{
int j;
ArrayClass(int i){

i=this.j;
System.out.println(i+"th object is created...");
}

public static void main(String args[]){
ArrayClass a[]=new ArrayClass[10];
for(int i=0;i<a.length;i++){
a[i]=new ArrayClass(i);
}
}
}