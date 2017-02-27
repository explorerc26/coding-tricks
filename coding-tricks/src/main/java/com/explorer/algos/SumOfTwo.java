package com.explorer.algos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * http://www.geeksforgeeks.org/check-exist-two-elements-array-whose-sum-equal-sum-rest-array/
 *
 *Input  : arr[] = {2, 11, 5, 1, 4, 7}
Output : Elements are 4 and 11
Note that 4 + 11 = 2 + 5 + 1 + 7

Input  : arr[] = {2, 4, 2, 1, 11, 15}
Output : Elements do not exist
 *
 */
public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array1 = {2, 11, 5, 1, 4, 7};
		compute(array1);
		int []array2 = {2, 4, 2, 1, 11, 15};
		compute(array2);
	}
	private static void compute(int[] array){
		Map<Integer,Integer> nums = new HashMap<Integer,Integer>();
		int sum = 0;
		for(int i = 0 ; i < array.length ; i ++){
			sum += array[i];
			int value = 1;
			if(nums.get(array[i]) !=null){
				value = nums.get(array[i])+1;
			}
			nums.put(array[i], value);
		}
		if(sum%2 ==1){
			System.out.println("Elements do not exist");
			return;
		}
		int req = sum/2;
		for(int i = 0 ; i < array.length ; i ++){
			int m = array[i];
			int n = sum/2- m;
			Integer got = nums.get(n);
			if(m != n){
				if(got != null){
					System.out.println("Elements are "+m+" and "+n);
					return;
				}
			}else{
				if(got != null && got ==2){
					System.out.println("Elements are "+m+" and "+n);
					return;
				}
			}
		}
	}

}
