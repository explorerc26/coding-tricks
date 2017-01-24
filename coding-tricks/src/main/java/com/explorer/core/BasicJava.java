package com.explorer.core;

import java.util.Date;

public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddCheckIncorrect(-1));
		System.out.println(oddCheckCorrect(-1));
		stringValue();
	}

	public static boolean oddCheckIncorrect(int num){
		 return num % 2 == 1;
	}
	
	public static boolean oddCheckCorrect(int num){
		return (num & 1) != 0;
	}
	
	public static void stringValue(){
		Date test = null;
		System.out.println(String.valueOf(test));
		// Next statement will throw NPE
		try{
			System.out.println(test.toString());
		}catch(Exception ex){
//			order of ex.printStackTrace() statements and sysout statements are not deterministic 
//			It is because printStackTrace writes in System.err while System.out.println writes on System.out. Even if both System.err and System.out use the same underlying resource for the output messages (e.g. the same file or the same console), they flush at different moments.
//			If you want to have a synchronized output, write the exceptions in System.out as well:
//			e.printStackTrace(System.out);
			System.out.println("print exception");
			ex.printStackTrace();
			System.out.println("done print exception");
		}
		System.out.println("done string value");
	}
}
