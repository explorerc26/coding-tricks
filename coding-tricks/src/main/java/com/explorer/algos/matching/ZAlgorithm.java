package com.explorer.algos.matching;

import java.util.Arrays;

public class ZAlgorithm {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getMatchingIndex("xyzaxyz", "abc")));

		String string = "hello world this is sample";
		String pattern = "world";
		System.out.println(Arrays.toString(getMatchingIndex(string, pattern)));
	}

	public static int[] getMatchingIndex(String inputString, String pattern) {

		char[] array = (pattern+inputString).toCharArray();
		int L = 0;
		int R = 0;
		int[] Z = new int[array.length];
		Z[0] = 0;
		for (int i = 1; i < array.length; i++) {
			if (i > R) {
				L = i;
				R = i;
				while ((R < array.length) && (array[R] == array[R - L])) {
					R++;
				}
				Z[i] = R - L;
				R--;
			} else {
				int k = i - L;
				if (Z[k] < R - i + 1) {
					Z[i] = Z[k];
				} else {
					L = i;
					while ((R < array.length) && (array[R] == array[R - L])) {
						R++;
					}
					Z[i] = R - L;
					R--;
				}

			}
		}
		return Z;
	}

}
