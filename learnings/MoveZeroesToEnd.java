package com.striver.learningre;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,0,0,5,5};
		int res[]=rotateArray(arr);
		for (int i : res) {
			System.out.print(i+" ");
		}

	}
	
	static int[] rotateArray(int arr[])
	{
		int j=0;
		int al=arr.length-1;
		for(int i=0;i<arr.length-j;i++)
		{
			if(arr[i]==0)
			{
				j++;
				for(int k=i;k<arr.length-1;k++)
				{
					arr[k]=arr[k+1];
				}
				arr[al]=0;
				al--;
				i--;
	
			}
		}
		
		return arr;
		
	}

}
