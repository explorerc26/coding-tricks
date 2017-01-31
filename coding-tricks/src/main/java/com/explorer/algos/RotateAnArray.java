package com.explorer.algos;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6};
		rotateLeft(input,1);
		System.out.println(Arrays.toString(input));
		
		int[] input1 = {1,2,3,4,5,6};
		rotateRight(input1,1);
		System.out.println(Arrays.toString(input1));

	}
	
	
	private static void rotateLeft(int[] input, int k){
		reverse(input, 0, k-1);
		reverse(input, k, input.length-1);
		reverse(input, 0, input.length-1);
	}
	private static void rotateRight(int[] input, int k){
		reverse(input, 0, input.length-k-1);
		reverse(input, input.length-k, input.length-1);
		reverse(input, 0, input.length-1);
	}
	
	
	private static void reverse(int[] input, int left , int right){
		while(left < right){
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left ++; 
			right -- ;
		}
	}

}
