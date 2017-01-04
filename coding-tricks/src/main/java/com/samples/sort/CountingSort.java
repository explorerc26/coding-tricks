package com.samples.sort;

/**
 * counting sort assumes that the input consists of integers in a small range
 * not a comparison sort 
 * Run time -  O(n) - n input elements is an integer in the range 0 to k, for some integer k. When k = O(n) 
 * stable sort - numbers with the same value appear in the output array in the same order as they do in the input array. 
 * not in place sort - need extra space also the output is in different array 
 * for -ve numbers - need to consider max and min
 *
 */
public class CountingSort {

	public static void main(String[] args) {

		int[] numbers = new int[] { 4, 1, 2, 2, 0, 4, 6, 5, 6, 7, 8 };

		CountingSort countingSort = new CountingSort();
		int[] sortedNumbers = countingSort.sort(numbers);
		for (int i = 0; i < sortedNumbers.length; i++) {
			System.out.println(sortedNumbers[i]);
		}
	}

	public int[] sort(int[] inputArray) {

		int[] outputArray = new int[inputArray.length];

		// O(n)
		int k = getMax(inputArray);

		// O(k) k<= n
		int[] countArray = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			countArray[i] = 0;
		}

		for (int i = 0; i < inputArray.length; i++) {
			countArray[inputArray[i]]++;
		}

		for (int i = 1; i <= k; i++) {
			countArray[i] = countArray[i] + countArray[i - 1];
		}

		for (int i = inputArray.length - 1; i >= 0; i--) {
			outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
			countArray[inputArray[i]]--;
		}

		return outputArray;
	}

	public int getMax(int[] inputArray) {
		int max = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		return max;
	}
}
