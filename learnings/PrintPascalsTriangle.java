package com.striver.learningre;

public class PrintPascalsTriangle {

	public static void main(String[] args) {
		int N=4;
		int res[][]=method(N);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		

	}
	
	public static int[][] method(int N)
	{
		int arr[][]=new int[N][];
		
     	for(int i=0;i<N;i++)
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
