package com.explorer.core.tricks;

import java.util.HashSet;

public class JavaPuzzler2 {

	public static void main(String[] args) {
		HashSet<Short> s = new HashSet<Short>();// 1
		for (short i = 0; i < 100; i++) {// 2
			s.add(i);// 3
			s.remove(i - 1);// 4
		}
		System.out.println(s.size());// 5
	}
}
