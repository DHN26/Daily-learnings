package com.striver.learningre;

public class CountingFrequencyInARange {

	public static void main(String[] args) {
		int arr[]= {0,1,3,4,5};
		int n=4;
		int x=4;
		int count[]= {0,0,0,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(arr[i]==j)
				{
					count[j-1]=count[j-1]+1;
				}
					
			}
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.println(count[i]);
		}

	}

}
