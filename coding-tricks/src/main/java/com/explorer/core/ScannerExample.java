package com.explorer.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = Integer.parseInt(sc.nextLine());
		Map<String, Integer> words = new HashMap<String, Integer>();
		for (int i = 0; i < no; i++) {
			String word = sc.nextLine();
			if (words.containsKey(word)) {
				words.put(word, words.get(word) + 1);
			} else {
				words.put(word, 1);
			}
		}
		int queryNo = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < queryNo; i++) {
			String query = sc.nextLine();
			if (words.get(query) == null) {
				System.out.println(0);
			} else {
				System.out.println(words.get(query));
			}
		}
	}
}
