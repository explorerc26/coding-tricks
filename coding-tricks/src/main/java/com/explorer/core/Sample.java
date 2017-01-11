package com.explorer.core;

import java.io.UnsupportedEncodingException;

public class Sample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "bb";
		byte[] aytes= a.getBytes();
		byte[] bytes= b.getBytes();
		
		byte[] a8bytes= a.getBytes("UTF-8");
		byte[] b8bytes= b.getBytes("UTF-8");
		//In the UTF-16 version, you get extra two bytes because of a marker inserted to distinguish between Big Endian (default) and Little Endian.
		//Java encodes strings in UTF-16, which represents each character (code point) with one or two 16-bit code units.
		byte[] a16ytes= a.getBytes("UTF-16");// feff0061
		byte[] b16ytes= b.getBytes("UTF-16");
		byte[] a16leytes= a.getBytes("UTF-16LE");
		byte[] b16sytes= b.getBytes("UTF-16LE");
		String s = Integer.toString((a8bytes[0] & 0xff) + 0x100, 16).substring(0);

		
		System.out.println(a);
	}

}
