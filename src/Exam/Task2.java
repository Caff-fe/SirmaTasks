package Exam;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        String[] tempArr = temp.split(", ");
        int yesCount = 0;
        int noCount = 0;

        for (String s : tempArr) {
            if (s.equalsIgnoreCase("yes")) {
                yesCount += 1;
            } else if (s.equalsIgnoreCase("no")) {
                noCount += 1;
            }
        }

        if (yesCount > noCount) {
            System.out.println("Yes");
        } else if (noCount > yesCount) {
            System.out.println("No");
        } else if (yesCount == 0) {
            System.out.println("Abstain");
        } else {
            System.out.println("Tie");
        }
    }

}

