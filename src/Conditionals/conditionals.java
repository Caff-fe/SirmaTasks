package Conditionals;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task 29
        int age = Integer.parseInt(scan.nextLine());
        String material = scan.nextLine();

        if (age < 500 && material.equals("stone")) {
            System.out.println("Ancient");
        }



        //Task 10

//        String product = scan.nextLine();
//        String city = scan.nextLine();
//        double quantity = Double.parseDouble(scan.nextLine());
//
//        if (city.equals("Sofia")) {
//            switch (product) {
//                case "tea":
//                    System.out.println(quantity * 0.5);
//                    break;
//                case "water":
//                    System.out.println(quantity * 0.8);
//                    break;
//                case "juice":
//                    System.out.println(quantity * 1.2);
//                    break;
//                case "sweets":
//                    System.out.println(quantity * 1.45);
//                    break;
//                case "chips":
//                    System.out.println(quantity * 1.6);
//                    break;
//            }
//
//        } else if (city.equals("Plovdiv")) {
//            switch (product) {
//                case "tea":
//                    System.out.println(quantity * 0.4);
//                    break;
//                case "water":
//                    System.out.println(quantity * 0.7);
//                    break;
//                case "juice":
//                    System.out.println(quantity * 1.15);
//                    break;
//                case "sweets":
//                    System.out.println(quantity * 1.3);
//                    break;
//                case "chips":
//                    System.out.println(quantity * 1.5);
//                    break;
//            }
//
//        } else if (city.equals("Varna")) {
//            switch (product) {
//                case "tea":
//                    System.out.println(quantity * 0.45);
//                    break;
//                case "water":
//                    System.out.println(quantity * 0.7);
//                    break;
//                case "juice":
//                    System.out.println(quantity * 1.1);
//                    break;
//                case "sweets":
//                    System.out.println(quantity * 1.35);
//                    break;
//                case "chips":
//                    System.out.println(quantity * 1.55);
//                    break;
//            }
//            }



        //Task 6
//        int number = Integer.parseInt(scan.next());
//
//        if (number % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }


        //Task 3
//        String word = scan.nextLine();
//        switch (word) {
//            case "zero":
//                System.out.println(0);
//                break;
//            case "one":
//                System.out.println(1);
//                break;
//            case "two":
//                System.out.println(2);
//                break;
//            case "three":
//                System.out.println(3);
//                break;
//            case "four":
//                System.out.println(4);
//                break;
//            case "five":
//                System.out.println(5);
//                break;
//            case "six":
//                System.out.println(6);
//                break;
//            case "seven":
//                System.out.println(7);
//                break;
//            case "eight":
//                System.out.println(8);
//                break;
//            case "nine":
//                System.out.println(9);
//                break;
//        }

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
