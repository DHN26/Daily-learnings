package com.striver.learningre;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,1,3};
		int target=9;
		int res[]=method(arr,target);
		System.out.print(res[0]+" | ");
		System.out.print(res[1]);
		

	}
	
	public static int[] method(int arr[],int target)
	{
		boolean flag=false;
		int arr2[]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					
					arr2[0]=arr[i];
					arr2[1]=arr[j];
					flag=true;
				}
			}
			
			if(flag)
				break;
		}
		return arr2;
	}

}
