package Conditionals;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Task 3
        String word = scan.nextLine();
        switch (word) {
            case "zero":
                System.out.println(0);
                break;
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;
        }

        // Task 2
//
//        int inputOne = Integer.parseInt(scan.next());
//        int inputTwo = Integer.parseInt(scan.next());
//
//        if (inputOne > inputTwo) {
//            System.out.println(inputOne);
//        } else if (inputTwo > inputOne) {
//            System.out.println(inputTwo);
//        } else {
//            System.out.println("Equal numbers");
//        }





        // Task 1
//        double input = Double.parseDouble(scan.next());
//        if (input > 5.5) {
//            System.out.println("Excellent");
//        }

    }
}
