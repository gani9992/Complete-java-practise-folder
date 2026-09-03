

class Main {
    public static void main(String[] args) {
        
       System.out.println(check(101,2));
       for(int i=2;i<101;i++){
           System.out.println(i+"\t"+check(i,i/2));
       }
    }
    static boolean check(int n,int a){
        if(a==1){
			return true;
		} 
		else if(n%a==0){
		return false;}
		else{return check(n,--a);}
    }
}