
class BinarySearch {
    public static void main(String[] args) {
       int a[]={10,20,40,56,780,4533,34333};
       System.out.println("the location of element is: "+binarySearch(a,34333,0,a.length-1));
    }
	
	
	/*
    public static int binarySearch(int a[],int target,int left,int right){
        while(left<=right){
        int mid=(left+right)/2;
        if(a[mid]==target){
            return mid;
        }
        else if(a[mid]>target){
            right=mid;
        }
        else{
            left=mid+1;
        }}
        return -1;
    }*/
	
	public static int binarySearch(int a[],int target,int left,int right){
		
		int mid=(left+right)/2;
		if(left>right)
		{return -1;}
	if(a[mid]==target)
	{return mid;}	
	else if(a[mid]>target){
		return binarySearch(a,target,left,mid-1);
	}
	else{
		return binarySearch(a,target,mid+1,right);
	}	}
}