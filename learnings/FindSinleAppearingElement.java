package com.striver.learningre;

public class FindSinleAppearingElement {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4};
		int res=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count!=2)
			{
				res=arr[i];
				break;
			}
				
				
		}
		
		System.out.println(res);
		

	}

}
