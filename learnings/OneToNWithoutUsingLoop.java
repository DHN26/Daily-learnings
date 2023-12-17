package com.striver.learningre;

import java.util.Scanner;

public class OneToNWithoutUsingLoop {

	public static void main(String[] args) {
		
		int n=5;
		int arr[]=new int[n];
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[i]=method(n);
			n--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	static int method(int n)
	{
		if(n>1)
		{
			return n;
		}
		else
			return 1;
		
			
		
	}

}
