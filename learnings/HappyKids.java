package com.striver.learningre;

public class HappyKids {

	public static void main(String[] args) {
		int arr[]= {38 ,53, 49, 33, 36, 84, 18, 68, 57, 61 };
		int res=happyKids(arr);
		System.out.println(res);
		

	}
	public static int happyKids(int []balls) {
        
        int max=-1;
        for(int i=0;i<balls.length;i++)
        {
            
            if(balls[i]>max)
            for(int j=i+1;j<balls.length;j++)
            {
                if(balls[i]==balls[j])
                max=balls[i];
            }

        }
        return max;
    }

}
