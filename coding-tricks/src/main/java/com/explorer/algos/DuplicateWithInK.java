package com.explorer.algos;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * http://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/
 * 
 *
 */
public class DuplicateWithInK {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 2, 3 };
		boolean result = checkForDuplicates(numbers1, 3);
		System.out.println(result);

		int[] numbers2 = { 1, 2, 3, 5, 9, 0, 3 };
		result = checkForDuplicates(numbers2, 3);
		System.out.println(result);
	}

	public static boolean checkForDuplicates(int[] numbers, int dis) {

		Set<Integer> lookup = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (lookup.contains(numbers[i])) {
				return true;
			}

			lookup.add(numbers[i]);
			if (i >= dis) {
				lookup.remove(numbers[i-dis]);
			}

		}
		return false;
	}

}
