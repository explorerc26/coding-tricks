package com.explorer.algos;

import java.util.HashSet;
import java.util.Set;

/**
 *http://www.programcreek.com/2013/01/leetcode-longest-consecutive-sequence-java/
 */
public class ContMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={1,3,2,20,22, 21,24,23,10};
		System.out.println(getMaxArrayLength(array));
	}
	
	public static int getMaxArrayLength(int[] array){
		Set<Integer> values= new HashSet<Integer>();
		for(int i = 0 ; i< array.length; i++){
			values.add(array[i]);
		}
		int max = 0; 
		int count = 0 ;
		int up;
		int down;
		for(int i = 0 ; i< array.length; i++){
			
			values.remove(array[i]);
			count = 1;
			up = array[i]+1;
			down = array[i] -1;
			while(values.contains(up)){
				values.remove(up);
				count++;
				up++;
			}
			while(values.contains(down)){
				values.remove(down);
				count++;
				down--;
			}
			max = max < count ? count : max ;
		}
		
		return max;
	}

}
