package com.explorer.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * http://www.programcreek.com/2012/12/leetcode-solution-of-two-sum-in-java/
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=0, index2=1
 * 
 */
public class TwoSumSol1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(getIndices(numbers, 10)));
		
		int[] numbers1 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(getIndices(numbers1, 5)));
		
		int[] numbers2 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(getIndices(numbers2, 50)));
	}
	
	public static int[] getIndices(int[]numbers, int sum){
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < numbers.length ; i ++){
			if(hashMap.get(numbers[i]) != null){
				int[] result = new int[2];
				result[0] = hashMap.get(numbers[i]);
				result[1] = numbers[i];
				return result;
			}else{
				hashMap.put(sum-numbers[i], numbers[i]);
			}
		}
		
		return null;
		
	}

}
