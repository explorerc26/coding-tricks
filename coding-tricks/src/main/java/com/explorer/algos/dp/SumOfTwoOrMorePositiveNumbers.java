package com.explorer.algos.dp;

/**
 *http://www.geeksforgeeks.org/number-different-ways-n-can-written-sum-two-positive-integers/
 *
 *
 *Input : n = 5
Output : 6
Explanation : All possible six ways are :
4 + 1
3 + 2
3 + 1 + 1
2 + 2 + 1
2 + 1 + 1 + 1
1 + 1 + 1 + 1 + 1

Input : 3
Output : 4
Explanation : All possible four ways are :
3 + 1
2 + 2
2 + 1 + 1
1 + 1 + 1 + 1
 *
 */
public class SumOfTwoOrMorePositiveNumbers {

	public static void main(String[] args) {

		int n = 7 ; 
		int[] counts = new int[n+1];
		for(int i = 0 ; i < counts.length ; i++){
			counts[i]= 0 ;
		}
		counts[0] = 1; 
		//leaving n two numbers or more  
		for(int i = 1 ; i < n ; i ++){
			for(int j = i; j < counts.length; j++){
				counts[j] += counts[j-i];
			}
		}
		
		System.out.println(counts[n]);
	}

}
