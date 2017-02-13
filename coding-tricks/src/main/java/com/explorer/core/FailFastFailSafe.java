package com.explorer.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafe {

	public static void main(String[] args) {
		// Creating an ArrayList of integers
		// http://javaconceptoftheday.com/fail-fast-and-fail-safe-iterators-in-java-with-examples/
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Adding elements to list
		// look for Increments modCount
		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(3845);
		// Getting an Iterator from list
		Iterator<Integer> it = list.iterator();
		try{
		while (it.hasNext()) {
			System.out.println("should get exception here");
			Integer integer = (Integer) it.next();
			System.out.println("should not see this");
			list.add(8457); // This will throw ConcurrentModificationException
			System.out.println("added successfully");
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}

		// Creating a ConcurrentHashMap

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		// Adding elements to map
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		// Getting an Iterator from map
		Iterator<String> it2 = map.keySet().iterator();
		while (it2.hasNext()) {
			String key = (String) it2.next();
			System.out.println(key + " : " + map.get(key));
			map.put("FIVE", 5); // This will not be reflected in the Iterator
		}
		System.out.println("no five");
	}
}
