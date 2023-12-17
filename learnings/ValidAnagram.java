package com.striver.learningre;
import java.util.Arrays;
public class ValidAnagram {

	public static void main(String[] args) {
		String s="a";
		String t="ab";
		boolean res=Solution.isAnagram(s,t);
		System.out.println(res);

	}
	
	class Solution {
	    public static boolean isAnagram(String s, String t) {
	        char ch[]=s.toLowerCase().toCharArray();
	        char ch2[]=t.toLowerCase().toCharArray();

	        Arrays.sort(ch);
	        Arrays.sort(ch2);

	        for(int i=0;i<ch.length;i++)
	        {
	            if(ch[i]!=ch2[i])
	            return false;
	            else
	            continue;
	        }
	        return true;


	    }
	}

}
