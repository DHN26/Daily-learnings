package com.striver.learningre;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int prices[]= {7, 7, 9, 8, 6, 7, 6, 10, 5};
		int res=Solution.bestTimeToBuyAndSellStock(prices);
		System.out.println(res);
		
	}
	
	public class Solution {
	    public static int bestTimeToBuyAndSellStock(int []prices) {
	        // Write your code here.
	        int small=100;
	        int pos=0;
	        for(int i=0;i<prices.length-1;i++)
	        {
	            if(prices[i]<small)
	            {
	            small=prices[i];
	            pos=i;
	            }

	        }
	        
	        int large=0;

	        for(int j=pos;j<prices.length;j++)
	        {
	            if(prices[j]>large)
	            large=prices[j];

	        }

	        int profit=large-small;
	        return profit;
	    }
	}

}
