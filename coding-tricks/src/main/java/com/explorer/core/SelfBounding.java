package com.explorer.core;

public class SelfBounding {
	  public static void main(String[] args) {
	    A a = new A();
	    a.set(new A());
	    a = a.set(new A()).get();
	    a = a.get();
	    C c = new C();
	    c = c.setAndGet(new C());
	  }
}