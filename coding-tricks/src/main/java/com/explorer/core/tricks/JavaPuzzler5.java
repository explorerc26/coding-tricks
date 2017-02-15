package com.explorer.core.tricks;

public class JavaPuzzler5 {
	public static void main(String[] args) {
		int num = methodOfA();
		System.out.println(num);
	}

	static int methodOfA() {
		return (true ? null : 0);
	}
}
