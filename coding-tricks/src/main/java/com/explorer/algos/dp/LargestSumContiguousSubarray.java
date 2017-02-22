package com.explorer.algos.dp;

/**
 *
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * Kadane's algorithm 
 *
 */
public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
		System.out.println("Maximum contiguous with -ve  is " + maxSubArraySumWithNeg(a));
		int[] b = { -2, -3, -4, -1, -2, -1, -5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(b));
		System.out.println("Maximum contiguous with -ve  is " + maxSubArraySumWithNeg(b));
	}

	public static int maxSubArraySum(int[] a) {
		int overallMax = 0;
		int currentMax = 0;
		for (int i = 0; i < a.length; i++) {
			currentMax = currentMax + a[i];
			if (currentMax < 0) {
				currentMax = 0;
			}
			if (currentMax > overallMax) {
				overallMax = currentMax;
			}
		}
		return overallMax;
	}

	public static int maxSubArraySumWithNeg(int[] a) {
		int overallMax = a[0];
		int currentMax = a[0];
		for (int i = 0; i < a.length; i++) {
			currentMax = currentMax + a[i] > a[i] ? currentMax + a[i] : a[i];
			if (currentMax > overallMax) {
				overallMax = currentMax;
			}
		}
		return overallMax;
	}

}
