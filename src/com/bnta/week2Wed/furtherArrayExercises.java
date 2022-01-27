package com.bnta.week2Wed;

import java.lang.reflect.Array;
import java.util.Arrays;

public class furtherArrayExercises {
    public static void main(String[] args) {

        // 1) declare an empty integer array of length = 3


        int[] empty = new int[3];

        // 2) using your array from Q1, print the contents to the console
        //nb just printing 'empty' will give the reference in the stack, Arrays.tostring prints the contents
//        System.out.println(Arrays.toString(empty));

        // 3) using your array from Q1, fill it with the number `4`
        // print the array to the console (use .fill()

//        Arrays.fill(empty, 4);
//        System.out.println(Arrays.toString(empty));

        for (int i = 0; i < empty.length; i++) {
            empty[i] = 4;
        }
//        System.out.println(empty);
//        System.out.println(Arrays.toString(empty));


        // 4) adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
        // print the array to the console

        empty[1] = 17;
//        System.out.println(Arrays.toString(empty));

        // 5) declare and initialise a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console

        String[] strArray = {"a", "b", "c", "d"};
        // can be written String[] strArray = new String[] {"a"....}; - usually for when you dont know whats in the array
        //declaring and initialising vs
        //String[] strArray;
        //strArray = new String [] {"a","b","c","d"};
//        System.out.println(Arrays.toString(strArray));

        /*6) using your answer to Q5, create a second array which is initialised using your original array
        hint: instead of using the `new` keyword, try simply giving the name of your original array
        change the value at index 0 of the new array to "z"
        print both of your arrays and compare*/
//        System.out.println(Arrays.toString(strArray));
        String[] arrayTwo = strArray;
        arrayTwo[0] = "z";
//        System.out.println(Arrays.toString(arrayTwo));
//        System.out.println(Arrays.toString(strArray));
        // "why is this output maybe not what you were expecting"? - this is what I expected - check with colin - code
        //read line by line, two variables arrayTwo and strArray are pointing at the same place in the memory/same reference

        // 6b) using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String[] copy = Arrays.copyOf(strArray, 7);
        //brand new array in memory - unlike 6a, where arrayTwo and Strarray are the same thing
        copy[0] = "x";
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(copy));

        // 7) using your array from Q5, create a `for` loop which prints each item in the array

        for (String str : strArray) {
            System.out.println(str);
//str is a placeholder, like a variable. StrArray is the array, but a placeholder is needed (str) to store this info and then pass it to sout
        }
//            int[] intArray = new int[10];
//
//            for (int i = 0; i < 10; i++) {
//                intArray[i] = i + 1;
//
//
//            }
//            System.out.println(Arrays.toString(intArray));
//        }

    }
}











