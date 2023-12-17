package com.striver.learningre;

public class CountNoOfBits {

	public static void main(String[] args) {
		int n=5;
		int arr[]=Solution.countBits(n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	
	class Solution {
	    public static int[] countBits(int n) {
	        String bin="";
	        int arr[]=new int[n+1];
	        arr[0]=0;
	        for(int i=1;i<=n;i++)
	        {
	            bin=Integer.toBinaryString(i);
	            arr[i]=method(bin);
	        }
	        return arr;
	       
	        
	    }

	    public static int method(String bin)
	    {
	        
	        char ch[]=bin.toCharArray();
	        int count=0;
	        for(int i=0;i<ch.length;i++)
	        {
	            if(ch[i]=='1')
	            count++;
	        }
	        return count;


	    }
	        
	    
	}

}
