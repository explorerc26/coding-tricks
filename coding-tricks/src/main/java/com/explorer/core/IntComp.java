package com.explorer.core;

import java.lang.Integer.IntegerCache;

public class IntComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        
//        reason
//        http://javaconceptoftheday.com/why-128-128-returns-false-in-java/
//        public static Integer valueOf(int i) {
//            if (i >= IntegerCache.low && i <= IntegerCache.high)
//                return IntegerCache.cache[i + (-IntegerCache.low)];
//            return new Integer(i);
//        }
	}

}
