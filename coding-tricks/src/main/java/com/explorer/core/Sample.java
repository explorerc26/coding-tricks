package com.explorer.core;

import java.io.UnsupportedEncodingException;

public class Sample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = "bb";
		byte[] aytes= a.getBytes();
		byte[] bytes= b.getBytes();
		
		byte[] a8bytes= a.getBytes("UTF-8");
		byte[] b8bytes= b.getBytes("UTF-8");
		
		byte[] a16ytes= a.getBytes("UTF-16");
		byte[] b16ytes= b.getBytes("UTF-16");
		
		String s = Integer.toString((a8bytes[0] & 0xff) + 0x100, 16).substring(0);

		
		System.out.println(a);
	}

}
