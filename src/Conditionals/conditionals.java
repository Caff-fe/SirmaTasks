package Conditionals;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task 2

        int inputOne = Integer.parseInt(scan.next());
        int inputTwo = Integer.parseInt(scan.next());

        if (inputOne > inputTwo) {
            System.out.println(inputOne);
        } else if (inputTwo > inputOne) {
            System.out.println(inputTwo);
        } else {
            System.out.println("Equal numbers");
        }





        // Task 1
//        double input = Double.parseDouble(scan.next());
//        if (input > 5.5) {
//            System.out.println("Excellent");
//        }

    }
}
