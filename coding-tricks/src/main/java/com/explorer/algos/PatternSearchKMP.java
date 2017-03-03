package com.explorer.algos;

import java.util.Arrays;

public class PatternSearchKMP {

	public static void main(String[] args) {

	System.out.println(Arrays.toString(patternMatch("hello wowld hello","wowld")));	
	System.out.println(Arrays.toString(patternMatch("hello wowld hello","AAACAAAAAC")));	
		
	}
	
	public static int[] patternMatch(String input, String pattern){
		int[] lps = getLPS(pattern);
		int[] ipmat = new int[input.length()];
		char[] ip = input.toCharArray();
		char[] p = pattern.toCharArray();
		
		// two pointers i = nput  j = pattern
		int i = 0 ; 
		int j = 0 ;
		while(i< ip.length){
			if(ip[i] == p[j]){
				i++;
				j++;
			}

			if(j== p.length){
				System.out.println("matched at"+(i-j));
				j = lps[j-1];
			}else if(i < ip.length && ip[i] != p[j]){
				if(j !=0){
					j =lps[j-1];
				}else{
					i = i+1;
				}
			}
			
		}
		
		
		return lps;
	}
	
	public static int[] getLPS(String pattern){
		int[] lps = new int[pattern.length()];
		lps[0]  = 0 ; 
		char[] p = pattern.toCharArray();
		// two pointers len , i ; 
		int i = 1 ; 
		int len = 0 ; 
		while(i< pattern.length()){
			if(p[i] == p[len]){
				len++;
				lps[i] = len;
				i++;
			}else{
				if(len == 0){
					lps[i] = len;
					i++;
				}else{
					len = lps[len-1];
				}
			}
			
		}
		return lps;
	}
}
