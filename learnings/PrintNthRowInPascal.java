package com.striver.learningre;

public class PrintNthRowInPascal {

	public static void main(String[] args) {
		int r=3;
		int c=1;
		int n=4;
		int res[][]=method(n);
		
		//printing particular row
		int i=r;
		while(i==r)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(res[i][j]);
			}
			break;
		}
		
		//printing particular column
		
		
		
		
		

	}
	
	public static int[][] method(int n)
	{
		int arr[][]=new int[n][];
		for(int i=0;i<n;i++)
		{
			arr[i] = new int[i + 1];
			arr[i][i]=1;
		
			for(int j=0;j<i;j++)
			{
				if(j==0)
					arr[i][j]=1;
				else
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
			
		}
		
		return arr;
	}

}
