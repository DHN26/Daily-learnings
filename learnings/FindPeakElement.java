package com.striver.learningre;

public class FindPeakElement {

	public static void main(String[] args) {
		int arr[]= {1,2};
		int res=method(arr,arr.length);
		System.out.println(res);
	}
	
	public static int method(int[] arr,int n)
	{
		
		        int peak=0;
		        if(arr.length==1)
		        {
		           return 0;
		        }

		        if(arr.length==1)
		        {
		        if (arr[0] > arr[1]) 
		            return 0;
		            else
		            return 1;
		        } 
		        
		        
		        for(int i=1;i<arr.length-1;i++)
		        {
		           if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
		            peak=i;
		        }

		        if (arr[arr.length - 1] > arr[arr.length - 2]) {
		            return arr.length - 1; 
		        }
		        return peak;
		  
}
}
