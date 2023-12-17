package com.striver.learningre;

public class MaximunConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1,0,0,1,1,0};
		int n=6;
		int m=2;
	    for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0 && m>0)
			{
				arr[i]=1;
				m--;
			}
		}
		
		
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				count++;
		}
		
		System.out.println(count);

	}

}
