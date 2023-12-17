

package com.striver.learningre;
import java.util.* ;

public class CeilOfFloor {

	public static void main(String[] args) {
		int arr[]= {4, 3, 8, 4, 7, 10};
		int x=5;
		
		int res=Solution.ceilingInSortedArray(arr.length, x, arr);
		System.out.println(res);
		

	}
	
	
	public class Solution {
	    public static int ceilingInSortedArray(int n, int x, int[] arr) {
	        // Write your code here.
	        Arrays.sort(arr);

	        //floor of x
	        for(int i=arr.length-1;i>0;i--)
	        {
	            if(arr[i]<=x)
	            return arr[i];
	        }

	        //ceil of x
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]>=x)
	            return arr[i];
	        }
	        return 0;
	    }
	}

}
