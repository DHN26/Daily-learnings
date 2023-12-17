package com.striver.learningre;

public class HighestAndLowestFrequencyElements {

	public static void main(String[] args) {
		int v[]= {1,1,2,3,6,8};
		int n=v.length;
		int count[]= new int[n];
		
		for (int i = 0; i < n; i++) {
            int current = v[i];
            count[current - 1]++;
        }
		
		int smallest=n+1;
		int largest=0;
		
		for(int i=0;i<v.length;i++)
		{
			if(count[i]<=smallest)
				smallest=count[i];
			if(count[i]>=largest)
				largest=count[i];
		}
		int comp[]= {smallest,largest};
		for(int k=0;k<comp.length;k++)
		{
			System.out.println(comp[k]);
		}

	}

}
