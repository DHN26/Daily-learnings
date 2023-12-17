package com.striver.learningre;

public class Merge2ArraysWithoutRepetition {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,6,7};
		int c[]=new int[a.length+b.length];
		int k=0;
		//add first array to result array
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		//add second array to result array
		int g=0;
		for(int j=a.length;j<(a.length+b.length);j++)
		{
			if(g<b.length)
			{
				for(int x=0;x<b.length;x++)
				{
					if(c[g]==b[x])
					  continue;
				    else 
					   {
						  c[j]=b[g];
						  g++;
					   }
				}
			 
			   
			}
		}
		
		
		
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}
