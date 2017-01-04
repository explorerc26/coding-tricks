package com.explorer.core;

import java.util.HashMap;
import java.util.Map;

public abstract class SimpleAbstract {
	
	public String trick = "tricky" ;
	
	public Map methodSignature(){
		System.out.println("int");
		return null;
	}
	
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
