package com.explorer.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 *http://www.geeksforgeeks.org/count-ways-reach-nth-stair/
 */
public class DavisStaircase {

	public static void main(String[] args) {
		for (int a0 = 1; a0 < 37; a0++) {
			long startTime = System.nanoTime();
			int result1 = recursive(a0);
			long endTime = System.nanoTime();
			
			long duration1 = (endTime - startTime)/1000000;  
			
			startTime = System.nanoTime();
			int result2 = recursiveCache(a0);
			endTime = System.nanoTime();
			
			long duration2 = (endTime - startTime)/1000;  
			System.out.println(a0+"-"+result1+"-"+duration1+"-"+result2+"-"+duration2+"/1000");
		}
	}

	public static int recursive(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}
		return recursive(n - 3) + recursive(n - 2) + recursive(n - 1);
	}
	public static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
	static{
		cache = new HashMap<Integer, Integer>();
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(3, 4);
		
	}
	public static int recursiveCache(int n){
		if(cache.containsKey(n)){
			return cache.get(n);
		}
		int res = recursiveCache(n - 3) + recursiveCache(n - 2) + recursiveCache(n - 1);
		cache.put(n, res);
		return res;
	}
}