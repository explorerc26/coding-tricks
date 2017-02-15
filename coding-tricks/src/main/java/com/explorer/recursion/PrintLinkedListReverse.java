package com.explorer.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintLinkedListReverse {

	public static void main(String[] args) {

		List<String> numbers = new ArrayList<String>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		print(numbers, 0);
	}
	
	public static void print(List<String>numbers, int index){
		if(index == numbers.size()-1){
			System.out.println(numbers.get(index));
			return;
		}else{
			 print(numbers, index+1);
			 System.out.println(numbers.get(index));
		}
	}

}
