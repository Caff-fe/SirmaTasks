package Loops;

import java.util.Scanner;

public class LoopsEasy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numToCheck = scan.next();
        int[] numbers = new int[numToCheck.length()];
        for (int i = 0; i < numToCheck.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(numToCheck.charAt(i)));
        }

        int sum = 0;
        for (int num : numbers) {
            sum += (int) Math.pow(num, numToCheck.length());
        }

        if (sum == Integer.parseInt(numToCheck)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
