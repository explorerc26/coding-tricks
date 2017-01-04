package com.samples.sort;

import java.util.Arrays;

/**
 *inert numbers in sorted sub array
 *in place sorting
 *best case: linear function of n - for already sorted elements
 *worst case: n^2
 *avg : n^2
 *stable
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = new int[] { 4, 1, 2, 2, 0, 4, 6, 5, 6, 7, 8 };
		new InsertionSort().sort(numbers);
		System.out.println("Sorted");
		System.out.println(Arrays.toString(numbers));
	}

	public void sort(int[] inputArray) {
		for(int i = 1 ; i < inputArray.length; i ++){
			int key = inputArray[i];
			int j = i-1; 
			while(j >=0 && inputArray[j]> key){
				inputArray[j+1] = inputArray[j];
				j = j-1;
			}
			inputArray[j+1] = key;
			System.out.println(Arrays.toString(inputArray)+" <- "+(i+1));
		}
	
	}
}
