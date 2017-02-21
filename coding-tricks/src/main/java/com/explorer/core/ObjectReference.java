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
		
		
		int[] array = new int[3];
		for(int i : array){
			System.out.print(i);
		}
		array[0] =10;
		check(array);
		System.out.println();
		for(int i : array){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		int[] array1[] = new int[3][4];
		int[][] array2 = new int[3][4];
		check(array1);
		check1(array2);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void simpleString(StringBuilder var){
		var.append("method");
	}
	public static void simpleInteger(Integer var){
	}
	public static void check(int[] array ){
		array[0] =100;
	}
	
	public static void check(int[] array[] ){
		array[0][0] =100;
	}
	
	public static void check1(int[][] array ){
		array[0][0] =100;
	}

}
