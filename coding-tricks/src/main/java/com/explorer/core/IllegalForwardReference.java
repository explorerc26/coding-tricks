package com.explorer.core;

public class IllegalForwardReference {

	static int i;

	static {
		System.out.println(i);
		// System.out.println(j); can't use a field before it is defined
		// i=j; even you can't use it to initialize other fields
		j = i; // but, can be initialized.
	}

	static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
