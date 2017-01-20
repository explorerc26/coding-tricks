package com.explorer.core;

public class LabelBreak {

	public static void main(String[] args) {
		boolean visited = false; 
		System.out.println("started ");
		
		jump: for(int i = 0 ; i < 10; i ++){
			System.out.println("i is "+i);
			if(i == 3 && !visited){
				visited= true;
				break jump;
			}
		}
		
		System.out.println("at the end ");
	}

}
