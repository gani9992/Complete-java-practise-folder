
class BinarySearchIn2DArrays {
    public static void main(String[] args) {
       int a[][]={{10,20,30},{40,50,60},{70,80,90}}; 
	  // System.out.println("the location of element is: "+binarySearch(a,34333,0,a.length-1));
    int target=60;
	for(int i=0;i<a.length;i++){
		if(binarySearch(a,i,target,0,a[i].length-1)!=-1){
			System.out.println("element found at row: "+i+" column: "+binarySearch(a,i,target,0,a[i].length-1));
			return;
	}}
	System.out.println("sorry bro your element is not found !!!");
	
	
	}
	
	
	
	
	public static int binarySearch(int a[][],int row,int target,int left,int right){
		
		int mid=(left+right)/2;
		if(left>right)
		{return -1;}
	if(a[row][mid]==target)
	{return mid;}	
	else if(a[row][mid]>target){
		return binarySearch(a,row,target,left,mid-1);
	}
	else{
		return binarySearch(a,row,target,mid+1,right);
	}	}
}