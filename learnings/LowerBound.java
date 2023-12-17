/*L0werbound of a number x is the index value where arr[index]
is >= the value of x.*/

package com.striver.learningre;

public class LowerBound {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5};
		int x=2;
		//Linear search approach
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=x)
			{
				System.out.println(i);
			    return;
			}

		}
		System.out.println(-1);
		*/
		
		//using binary search approach
		int low=0;
		int high=arr.length-1;
		int mid;
		int ans=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]>=x)
			{
				ans=mid;
				high=mid-1;
			}
			else
				low=mid+1;
		}
			

	}

}
