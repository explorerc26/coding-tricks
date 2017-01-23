package com.explorer.core;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddCheckIncorrect(-1));
		System.out.println(oddCheckCorrect(-1));
	}

	public static boolean oddCheckIncorrect(int num){
		 return num % 2 == 1;
	}
	
	public static boolean oddCheckCorrect(int num){
		return (num & 1) != 0;
	}
}
