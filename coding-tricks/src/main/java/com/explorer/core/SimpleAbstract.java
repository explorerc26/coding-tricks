package com.explorer.core;

public abstract class SimpleAbstract {
	public void parent(){
		System.out.println("********* I am from SimpleAbstract parent method");
	}
	
	private void parentIssue(){
		System.out.println("********* I am from SimpleAbstract parentIssue method");
	}
	public void overide(){
		parent();
		System.out.println(" I am from SimpleAbstract parent overide");
	}

	public void overideIssue(){
		parentIssue();
		System.out.println(" I am from SimpleAbstract parent overideIssue");
	}
}
