package com.striver.learningre;

public class LeftShiftArrayByK {

	public static void main(String[] args) {
		int k=3;
		int arr[]= {1,2,3,4,5};
		int res[]=rotateArray(arr,k);
		for (int i : res) {
			System.out.print(i+" ");
		}

	}
	
		public static int[] rotateArray(int []arr, int k) {
	        // Write your code here.
	        
	        for(int i=0;i<k;i++)
	        {
	            method(arr);
	            
	        }
	        return arr;
	        
	    }
	    static int [] method(int arr[]){
	    int help=arr[0];
	        for(int i=1;i<arr.length;i++)
	        {
	            arr[i-1]=arr[i];
	        }
	        arr[arr.length-1]=help;
	        return arr;
	    }

	

}
