package com.explorer.core;

public class ObjectReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder test1 = new StringBuilder("main");
		simpleString(test1);
		System.out.println(test1);
		Integer test2 = 100;
		simpleInteger(test2);
		System.out.println(test2);

	}
	
	public static void simpleString(StringBuilder var){
		var.append("method");
	}
	public static void simpleInteger(Integer var){
	}

}
