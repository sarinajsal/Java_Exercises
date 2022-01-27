package com.bnta.week2Tues.loopExercises;

public class Exercise9 {
    public static void main (String[] args){

/*9. Create a loop that finds the greatest number in an array of numbers, prints the number (+ prints the index)
Start with the array of numbers: [1, 6, 17, 9, 20, 5] Using a for loop to go through the array to find the greatest
value Print the greatest number in the array
 */

        int[] numbers = new int[] {1, 6, 17, 9, 20, 5};
        int maxNum = 0;

        for (int number : numbers){
            if (number > maxNum) {maxNum = number;{

                //need an else statement? else

                System.out.println(maxNum);


            }
            }

        }
        //System.out.println(Math.max(int[]);



    }

}
