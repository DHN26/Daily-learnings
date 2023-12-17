package com.striver.learningre;

public class UpperBound {

	public static void main(String[] args) {
		int arr[]= {2,3,6,7};
		int x=5;
		
		int low=0;
		int high=arr.length-1;
		int mid;
		int ans=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]>x)
			{
				ans=mid;
				high=mid-1;
			}
			else
				low=mid+1;
				
		}
		
		System.out.println("Upper bound of "+x+" is "+ans);

	}

}
