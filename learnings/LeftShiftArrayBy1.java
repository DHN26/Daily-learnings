package com.striver.learningre;

public class LeftShiftArrayBy1 {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,3,4,5};
		int res[]=rotateArray(arr,n);
		for (int i : res) {
			System.out.print(i+" ");
		}
		

	}

	static int[] rotateArray(int[] arr, int n) {
	        // Write your code here.
		int help=arr[0];
	        for(int i=1;i<arr.length;i++)
	        {
	            arr[i-1]=arr[i];
	        }
	        arr[arr.length-1]=help;
	        return arr;

	    
	}
}


