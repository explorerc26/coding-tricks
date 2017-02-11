package com.explorer.core.tricks;

/**
 * 
 * https://shekhargulati.com/tag/java-puzzlers/
 *
 */
public class JavaPuzzler1 {

	public static void main(String[] args) {
		JavaPuzzler1 javaPuzzler = null;
		System.out.println(javaPuzzler);
		System.out.println(javaPuzzler.get());
	}

	private static String get() {
		return "i am a java puzzler";
	}

}