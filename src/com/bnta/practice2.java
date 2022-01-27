package com.bnta;

import java.util.Locale;

public class practice2 {
    /*
         Given the following String input
         String input = "   b ri   ght net   work  "
         Write a program that transforms input into: Bright Network
       */
    public static void main(String[] args) {

        String input = "   b ri   ght net   work  ";
        String bright = "   b ri   ght";

        String inputs = input.replaceAll("\\s", "");
        System.out.println(inputs);
        // for (int i = 0; i <=6 ; i++) {
        //if (i=="b"||i=="n")


//        bright = "B" + inputs.substring(1, 6) + " " + "N" + inputs.substring(7,13);
        bright =inputs.substring(0, 6) + " " + inputs.substring(6,13);
        //char[]charArray = bright.toCharArray();

        String brightStr[]=bright.split("\\s");

String capitalizeWord = "";

        for (int i = 0; i< brightStr.length; i++);{
            String first=bright.substring(0,1);
            String afterfirst=bright.substring(1);

            //if(Character.isLetter(charArray[0]));{

            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
            }
        System.out.println(capitalizeWord);
        }

        //bright.charAt(0);
        //System.out.println(bright.charAt(0));
    }









