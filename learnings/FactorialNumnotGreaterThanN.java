package com.striver.learningre;

public class FactorialNumnotGreaterThanN {

	public static void main(String[] args) {
		int n=7;
		factorialNumbers(n);
		
	}
	
	    public static void factorialNumbers(int n) {
	        // Write Your Code Here
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=fact(i);
	        }
	        
	        for(int i=1;i<arr.length;i++)
	        {
	        	if(arr[i]<n)
	        	System.out.println(arr[i]);
	        }
	        
	        

	    }

	    static int fact(int n)
	    {
	        if(n==0)
	        return 1;
	        else
	        return n*fact(n-1);
	    }


	

}
