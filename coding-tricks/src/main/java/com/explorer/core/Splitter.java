package com.explorer.core;

public class Splitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello I'm your String";
		String[] splitStr = str.split("\\s+");
		for(String s : splitStr){
			System.out.println(s);
		}
	}

}
