package com.explorer.algos.dp;

/**
 *
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
 *
 */
public class CoinChangeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2 , 5, 3, 6};
		int sum = 10;
		System.out.println("Recursive sol-"+recursiveSolution(coins,coins.length,  sum));
		System.out.println("Dynamic  prog-"+dpSolution(coins, sum));
	}
	
	public static int recursiveSolution(int[] coins , int k , int sum){
		if(sum == 0 ){
			return 1;
		}
		if(sum < 0){
			return 0;
		}
		if(k <= 0 && sum > 0){
			return 0 ;
		}
		return recursiveSolution(coins, k-1, sum) + recursiveSolution(coins, k, sum-coins[k-1]);
	}
	
	public static int dpSolution(int[] coins , int sum){
		int[] counts = new int[sum+1];
		for(int i = 0 ; i < counts.length ; i++){
			counts[i]= 0 ;
		}
		counts[0] = 1; 
		for(int i = 0 ; i < coins.length ; i ++){
			for(int j = coins[i]; j < counts.length; j++){
				counts[j] += counts[j-coins[i]];
			}
		}
		
		return counts[counts.length-1];
	}

}
