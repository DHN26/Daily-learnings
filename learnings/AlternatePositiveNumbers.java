package com.striver.learningre;

public class AlternatePositiveNumbers {

	public static void main(String[] args) {
		int a[]={1,2,-3,-1,-2,3};
		
		int na[]=new int[a.length];
        int j=1;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                na[j]=a[i];
                j+=2;
            }
            else
            {
                na[k]=a[i];
                k+=2;
            }
        }

		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
