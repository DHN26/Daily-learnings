package com.striver.learningre;

public class MajorityElement {

	public static void main(String[] args) {
		int v[]= {1,3,3,3,1,1};
		int n=v.length;
		int res=majorityElement(v);
		System.out.println(res);
		
	}
	
	    public static int majorityElement(int []v) {
	        // Write your code here
	        int n=v.length;
	        for(int i=0;i<v.length;i++)
	        {
	            int count=1;
	            for(int j=i;j<v.length;j++)
	            {
	                if(v[i]==v[j])
	                 count++;
	                
	            }
	            if(count>n/2)
	            return v[i];
	        }
	        return 0;
	    }
	

}
