package com.explorer.core.tricks;

public class Declaration {

	public static void main(String[] args) {
		 //here matric is 2d array
		 int[] rowvector, colvector, matrix[];
		 matrix = new int[10][10];
		 byte rowvector1[], colvector1[], matrix1[][];
		 //all below are arrays
		 int[] a, b, c;
		 // only d is array
		 int a1[], b1, c1;
		 
		 
	        int ia[][] = { {1,2}, null };
	        int ja[][] = ia.clone();
	        System.out.print((ia == ja) + " ");
	        System.out.println(ia[0] == ja[0] && ia[1] == ja[1]);
		 
		 
	        for (int[] ea : ia) {
	            for (int e: ea) {
	                System.out.println(e);
	            }
	        }
	}

}
