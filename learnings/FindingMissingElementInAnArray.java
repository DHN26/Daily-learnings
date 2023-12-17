package com.striver.learningre;

public class FindingMissingElementInAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8};
		int n=8;
		float sum1=(n*(n+1))/2;
		float sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			sum2=sum2+arr[i];
		}
		
		float res=sum1-sum2;
		System.out.println(res);
		

	}

}
