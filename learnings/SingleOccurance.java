package com.striver.learningre;

public class SingleOccurance {

	public static void main(String[] args) {
		int nums[]= {1,1,2,3,3,4,4,8,8};
		int re=Solution.singleNonDuplicate(nums);
		System.out.println(re);

	}
	
	public class Solution {
	    public static int singleNonDuplicate(int[] nums) {
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        	int count=1;
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(nums[i]==nums[j])
	                count++;
	            }

	            if(count==1)
	            return nums[i];
	            i++;

	        }
	        return 0;
	    }
	}

}
