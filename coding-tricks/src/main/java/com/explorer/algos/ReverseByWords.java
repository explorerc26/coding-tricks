package com.explorer.algos;

/**
 *http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/
 * Given s = "the sky is blue",
 * return "blue is sky the".
 *
 */
public class ReverseByWords {

	public static void main(String[] args) {
		
		System.out.println(run("the sky is blue "));
		System.out.println(run(" the sky is blue"));
		System.out.println(run("the sky is blue"));

	}
	
	private static String run(String input){
		char[] inputChars = input.toCharArray();
		int j = 0 ; 
		for(int i = 0 ; i < inputChars.length ; i++){
			if(inputChars[i] == ' '){
				reverse(inputChars, j , i-1);
				j = i+1;
			}
		}
		reverse(inputChars, j, inputChars.length-1);
		reverse(inputChars, 0, inputChars.length-1);
		return new String(inputChars);
	}
	
	
	private static void reverse(char[] input, int start, int end){
		while(start < end ){
			char temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
	}
	
	
	

}
