package com.explorer.core;

//The inherited fields can be used directly, just like any other fields.
//You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
//You can declare new fields in the subclass that are not in the superclass.
//The inherited methods can be used directly as they are.
//You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
//You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
//You can declare new methods in the subclass that are not in the superclass.
//You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

public class SimpleAbstractImpl  extends SimpleAbstract{
	
	public int trick = 0 ; 
	
	public void parent(){
		System.out.println(" I am from SimpleAbstractImpl parent method");
	}

	public void parentIssue(){
		System.out.println(" I am from SimpleAbstractImpl parentIssue method");
	}
	
	public void overide(){
		super.overide();
		parent();
		System.out.println(" I am from SimpleAbstractImpl parent overide");
	}
	
	public void overideIssue(){
		super.overideIssue();
		System.out.println(" I am from SimpleAbstractImpl parent overideIssue");
	}
	
	public static void main(String[] args) {
		SimpleAbstractImpl simpleAbstractImpl  = new SimpleAbstractImpl();
		simpleAbstractImpl.overide();
		System.out.println("########");
		SimpleAbstract simpleAbstractImpl2  = new SimpleAbstractImpl();
		simpleAbstractImpl2.overide();
		//simpleAbstractImpl.overideIssue();
		SimpleAbstractImpl a  = new SimpleAbstractImpl();
		System.out.println(" variable hiding");
		System.out.println("*******"+a.trick);
		SimpleAbstract aa = a;
		System.out.println("*******"+aa.trick);

	}
}
