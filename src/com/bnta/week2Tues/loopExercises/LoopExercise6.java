package com.bnta.week2Tues.loopExercises;

import java.util.Arrays;
import java.util.Locale;

public class LoopExercise6 {
    public static void main (String[] args){


    /*Ex 7. Create a loop that makes all words in an array uppercase, print the array
        Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array. Print the contents of the array in the terminal.

      Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.*/

    String[] arrayBees = {"i", "sure", "do", "love", "bees"};
    String fin = "";
        for (String arrayBee : arrayBees) {
            arrayBee.toUpperCase();
            fin += arrayBee.substring(0,1).toUpperCase() + arrayBee.substring(1) + " ";


        }
        System.out.println(fin);


            
        }

    }



