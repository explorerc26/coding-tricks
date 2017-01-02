package com.explorer.core;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("going to try catch block");
		try{
			System.out.println("I am in try block");
			return;
		}catch(Exception e){
			System.out.println("I am in catch block");
		}finally {
			System.out.println("I am in finally block");
		}
	}

}
