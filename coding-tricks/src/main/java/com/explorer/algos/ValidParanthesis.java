package com.explorer.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("{}s[(sasad)s]"));
		System.out.println(check("{}s[(sasad)s]("));
	}
	
	public static boolean check(String input){
		char[] characters = input.toCharArray();
		Map<Character, Character> validSysmbols = new HashMap<>();
		validSysmbols.put('(', ')');
		validSysmbols.put('[', ']');
		validSysmbols.put('{', '}');
		Stack<Character> stack = new Stack<Character>();
	 
		for(int i = 0 ; i < characters.length ; i++){
			if(validSysmbols.keySet().contains(characters[i])){
				stack.push(characters[i]);
			}else{
				if(validSysmbols.values().contains(characters[i])){
					if(!stack.isEmpty() && validSysmbols.get(stack.peek()) == characters[i]){
						stack.pop();
					}else{
						return false;
					}
				}
			}
			
		}
		return stack.isEmpty();
	}

}
