package com.explorer.core;

public class ShotdownHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world !!");
		 Runtime.getRuntime().addShutdownHook(new Thread() {
             public void run() {
                 System.out.println("This is final message");
             }
       });;
       System.out.println("main is done!!!!");
	}

}
