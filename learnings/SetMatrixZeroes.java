package com.striver.learningre;
import java.util.Scanner;
public class SetMatrixZeroes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		
		Solution.setZeroes(matrix);
	}
	
	class Solution {
	    public static void setZeroes(int[][] matrix) {
	        
	    	int row=matrix.length;
	    	int col=matrix[0].length;
	    	boolean zrow[]=new boolean[row];
	    	boolean zcol[]=new boolean[col];
	    	
	    	//mark row and coulmns which has the value zero
	    	for(int i=0;i<row;i++)
	    	{
	    		for(int j=0;j<col;j++)
	    		{
	    			if(matrix[i][j]==0)
	    			{
	    				zrow[i]=true;
	    				zcol[j]=true;
	    			}
	    		}
	    	}
	    	
	    	//set row to zero
	    	for(int i=0;i<row;i++)
	    	{
	    		if(zrow[i]==true)
	    		{
	    			for(int j=0;j<col;j++)
	    			matrix[i][j]=0;
	    		}
	    			
	    	}
	    	
	    	//set column to zero
	    	for(int j=0;j<row;j++)
	    	{
	    		if(zcol[j]==true)
	    		{
	    			for(int i=0;i<row;i++)
	    			matrix[i][j]=0;
	    		}
	    			
	    	}
	    	
	    	//printing the array
	        for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[i].length;j++)
				{
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
	        
	        
	    }
	}

}
