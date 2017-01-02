package com.explorer.core;

public class SimpleAbstractImpl  extends SimpleAbstract{
	public void parent(){
		System.out.println(" I am from SimpleAbstractImpl parent method");
	}

	public void parentIssue(){
		System.out.println(" I am from SimpleAbstractImpl parentIssue method");
	}
	
	public void overide(){
		super.overide();
		System.out.println(" I am from SimpleAbstractImpl parent overide");
	}
	
	public void overideIssue(){
		super.overideIssue();
		System.out.println(" I am from SimpleAbstractImpl parent overideIssue");
	}
	
	public static void main(String[] args) {
		SimpleAbstractImpl simpleAbstractImpl  = new SimpleAbstractImpl();
		simpleAbstractImpl.overide();
		simpleAbstractImpl.overideIssue();

	}
}
