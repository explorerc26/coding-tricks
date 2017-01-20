package com.explorer.core;

/**
 * 
 * will there be any difference if you have return in finally??
 *
 */
public class LostException {

	public static void main(String[] args) {
		try {
			doSomething();
			System.out.println("yikes! don't program like this!");
		} catch (RuntimeException e) {
			System.out.println("got it.");
		}
	}

	public static void doSomething() {
		try {
			// Normally you would have code that doesn't explicitly appear
			// to throw exceptions so it would be harder to see the problem.
			throw new RuntimeException();
		} finally {
			System.out.println("in finally block");
			return;
		}
	}
}