package com.explorer.core;

/**
 * Self-bound generics:
 * http://www.artima.com/weblogs/viewpost.jsp?thread=136394
 * 
 * another example 
 * class Enum<E extends Enum<E>>
 * @author srinivaas
 *
 */
public class SelfBounded <T extends SelfBounded<T>> {
	  T element;
	  SelfBounded<T> set(T arg) {
	    element = arg;
	    return this;
	  }
	  T get() { return element; }
	}

	class A extends SelfBounded<A> {}
	class B extends SelfBounded<A> {} // Also OK

	class C extends SelfBounded<C> {
	  C setAndGet(C arg) { set(arg); return get(); }
	}

	class D {}
	// Can't do this:
	// class E extends SelfBounded<D> {}
	// Compile error: Type parameter D is not within its bound


