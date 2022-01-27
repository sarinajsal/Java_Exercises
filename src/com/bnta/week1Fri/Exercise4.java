package com.bnta.week1Fri;

public class Exercise4 {
    public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */
                String input = "0.90, 1.00, 9.00, 8.78, 0.01";
                double result = 0;
                String inputConvertToArray[] = input.split(",");

                for (int i = 0; i < inputConvertToArray.length; i++) {
                    String number = inputConvertToArray[i];
                    double numberDbl = Double.parseDouble(number);
                    result =  result + numberDbl;
                    System.out.println(result);

//        {
//            String input = "9, 10, 11 ";
//            int result = 0;
//            String inputNowArray[] = input.split(",");
//            for (int i = 0; i < inputNowArray.length; i++) ;
//            {
//


            }


        }

    }









