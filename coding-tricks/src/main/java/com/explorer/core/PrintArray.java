package com.explorer.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class PrintArray {
    public static void main(String[] args) {
 
        // A normal java list having four String objects
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        // Print the list in console
        System.out.println(list);
 
        // An array of String objects
        String[] array = new String[] { "First", "Second", "Third", "Fourth" };
        // Print the array using default toString method
        System.out.println(array.toString());
        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(array));
 
        String[] arr1 = new String[] { "Fifth", "Sixth" };
        String[] arr2 = new String[] { "Seventh", "Eigth" };
        // An array of array containing String objects
        String[][] arrayOfArray = new String[][] { arr1, arr2 };
 
        // Compare the different outputs
 
        // Print the array using default toString method
        System.out.println(arrayOfArray);
 
        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(arrayOfArray));
 
        // Print the array using Arrays.deepToString()
        System.out.println(Arrays.deepToString(arrayOfArray));
        
//        You need to explicitly initialize any local variables
        
//        Each class variable, instance variable, or array component is initialized with a default value when it is created (§15.9, §15.10):
//        	For type byte, the default value is zero, that is, the value of (byte)0.
//        	For type short, the default value is zero, that is, the value of (short)0.
//        	For type int, the default value is zero, that is, 0.
//        	For type long, the default value is zero, that is, 0L.
//        	For type float, the default value is positive zero, that is, 0.0f.
//        	For type double, the default value is positive zero, that is, 0.0d.
//        	For type char, the default value is the null character, that is, '\u0000'.
//        	For type boolean, the default value is false.
//        	For all reference types (§4.3), the default value is null.
        System.out.println("size");
        int items[] = new int[10];
        items[0] = 0 ;
        items[1] = 1 ;
        items[2] = 2 ;
        System.out.println("size "+items.length);
        for(int i = 0 ; i < 10 ; i++){
        	System.out.println(items[i]);
        }
    }
}