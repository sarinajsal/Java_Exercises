package com.bnta.week1Fri;

public class Exercise3 {
    public static void main(String[] args) {

        String[] content = {"YoU", "aRe", "how", "hellO"};

        content[0]="you?";
        content[1]="are";
        content[2]="how";
        content[3]="Hello";

        for (int i = content.length - 1; i >= 0; i--) {

            System.out.println(content[i]);
            String result = "";
            result += content[i] + " ";
            System.out.println(result + "?");
        }




    }
}
