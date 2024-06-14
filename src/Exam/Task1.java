package Exam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialCount = Integer.parseInt(scan.nextLine());
        int countIncrease = Integer.parseInt(scan.nextLine());
        int numOfHours = Integer.parseInt(scan.nextLine());
        int sum = initialCount;

        for (int i = 1; i < numOfHours; i++) {
            initialCount += countIncrease;
            sum += initialCount;
        }

        System.out.println(sum);
    }

}

