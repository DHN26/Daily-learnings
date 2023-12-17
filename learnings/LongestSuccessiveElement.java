package com.striver.learningre;

public class LongestSuccessiveElement {

	public static void main(String[] args) {
		int a[]= {1,2,2,1};
		int res=Solution.longestSuccessiveElements(a);
		System.out.println(res);

	}
	
	public class Solution {
	    public static int longestSuccessiveElements(int []a) {
	        // Write your code here.
	        for(int i=0;i<a.length-1;i++)
	        {
	            int help;
	            for(int j=0;j<a.length-1-i;j++)
	            {
	                if(a[j]>a[j+1])
	                {
	                    help=a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=help;
	                }
	            }

	        }
	        
	        for (int i : a) {
				System.out.print(i);
			}
	        System.out.println();

	        int val=1;

	        for(int i=0;i<a.length-1;i++)
	        {
	            if((a[i+1]-a[i]==1))
	            {
	               val++;
	               
	            }
	            
	            else
	              return val;
	        }
	        return val;
	    }
	}

}
