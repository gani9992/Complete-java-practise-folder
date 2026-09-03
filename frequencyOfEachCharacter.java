 class frequencyOfEachCharacter
{
	public static void main(String[] args) {
		String a="abdulgani abdulgani";
		String b="";
		for(int i=0;i<a.length();i++){
		    char c1=a.charAt(i);
		    if(b.contains(c1+"")==false){
		        int count=1;
		        for(int j=i+1;j<a.length();j++){
		            if(a.charAt(i)==a.charAt(j)){
		                count++;
		            }
		        }
		        System.out.println("'"+a.charAt(i)+"'"+"-"+count);
		    }
		    	b=b+c1;
		}
	
	}
}
