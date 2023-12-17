package com.striver.learningre;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int arr[]= {3,4,1,2};
		int arr2[] = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		int count=0;
		do {
            int res[] = method(arr);
            count++;

            if (Arrays.equals(res, arr2)) {
            	
            	System.out.println(count);
                break; 
            }

        } while (true);


	}
	
	public static int[] method(int arr[])
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

}
