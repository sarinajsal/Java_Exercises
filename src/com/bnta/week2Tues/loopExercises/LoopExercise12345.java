package com.bnta.week2Tues.loopExercises;

import java.util.Arrays;

public class LoopExercise12345 {
    static public void main (String[] args) {
        //within main class create a loop to print numbers 0 to 10
        //for (int i = 0; i <=10 ; i++) {
            //System.out.println(i);

        //Within your Main class, create some functionality which uses a for loop to print the numbers from 10 to 0 (inclusive).
        //for (int i = 10; i >= 0 ; i--) {
            //System.out.println(i);

        //Within your Main class, create some functionality which uses a for
        // loop to print the even numbers from 0 to 20 (inclusive).
        //for (int i = 0; i <=20; i = i+2) {
           // System.out.println(i);

        //Create a loop that adds all numbers 0-10 to an array then prints the array

        //create an int array to store numbers
        //create for loop 0 to 10
        //put i into array??
        //print

//         ATTEMPT 1
//         int[] array;
//        for (int i = 0; i <= 10 ; i++) {
//            int[] nArray = array + i;

        // EXAMPLE SOLUTION


        int[] numbers = new int[11];

        for (int i = 0; i <= 10; i++) {
            numbers[i] = i;
            //ourArray[i] is the index? i think, maybe check this with iain again.
            //System.out.println(Arrays.toString(ourArray));    shows how an array work
            //i = ourArray[i];
        }
        System.out.println(Arrays.toString(numbers));


        for (int number : numbers) {

                 System.out.println(number);
            }


//5. Create a loop that prints each item in an array
//Using your answer to the previous question, use a second for loop which prints each item in your array to the terminal individually.

//            printing in terminal individually, rather than whole array using arrays.tostring

        for (int number : numbers) {

            System.out.println(number);

            /*6. Create a loop that adds to a sum. Prints the sum
Using your answer from the question two above, use a for loop to add each number to a sum value. Print the sum value.*/

            int sum = 0;
            for (int sumNum : numbers) {
                sum = sumNum + sum;
                System.out.println(sum);
            }


        }



        }
        }










