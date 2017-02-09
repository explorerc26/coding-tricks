package com.explorer.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( (isBalanced("{[()]}")) ? "YES" : "NO" );
		System.out.println( (isBalanced("{[(])}")) ? "YES" : "NO" );
		System.out.println( (isBalanced("{{[[(())]]}}")) ? "YES" : "NO" );
	}
	  
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        char []charArray = expression.toCharArray();
        for(int i = 0 ; i <charArray.length ; i ++){
            if(charArray[i] =='[' || charArray[i] =='(' ||charArray[i] =='{'){
                stack.push(charArray[i]);
            }else{
            	if(stack.isEmpty()){
            		return false;
            	}
                char c = stack.pop();
                if(map.get(c) != charArray[i]){
                     return false ;
                }
            }
        }
        if(stack.isEmpty()){
        	return true ;
        }else{
        	return false ;
        }

    }

}
