package com.explorer.core;

public class FinallyDemo {

	public static void main(String[] args) {
		
//		finally block get executed if we insert a return statement	inside the try block of a try-catch-finally
		
//		Note that there are some cases in which the finally block will not get executed, such as the following:
//		• If the virtual machine exits during try / catch block execution.
//		• If the thread which is executing during the try / catch block gets killed.

		
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
