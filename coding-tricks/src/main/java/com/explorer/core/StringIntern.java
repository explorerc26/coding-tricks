package com.explorer.core;

/**
 *  Used to to deal with String duplication problem in Java
 *  Since String object consumes a large amount of heap memory in average Java application, it makes sense to use intern() method to reduce duplication and take advantage of String pool feature provided by Java
 *  By calling  the intern() method on this object, you can instruct JVM to put this String in the pool and whenever someone else creates "abc", this object will be returned instead of creating a new object.
 * 
 * 
 * 
 *  Prior to Java 6, uncontrolled usage of String.intern() method can cause
 *  java.lang.OutOfMemory: PermGen space because String pool was physically 
 *  located on PermGen area of Java heap, which is quite small in many JVM (32M to 96M) 
 *  and fixed. From Java 7 onward, the intern()  method has become even more 
 *  useful because String pool is relocated to main heap space of JVM. 
 *  This will help to further reduce String duplication by using String.intern()
 *   method.
 */
public class StringIntern {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello".intern();
		String s4 = new String("Hello");
		String s5 = new String("Hello").intern();

		if ( s1 == s2 ){
		    System.out.println("s1 and s2 are same");  // 1.
		}

		if ( s1 == s3 ){
		    System.out.println("s1 and s3 are same" );  // 2.
		}

		if ( s1 == s4 ){
		    System.out.println("s1 and s4 are same" );  // 3. // wont print this 
		}

		if ( s1 == s5 ){
		    System.out.println("s1 and s5 are same" );  // 4.
		}

	}

}
