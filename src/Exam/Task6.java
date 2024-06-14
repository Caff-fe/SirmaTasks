package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {

    private static ArrayList<Integer> temp;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String inputTwo = scan.nextLine();
        String[] commands = Arrays.stream(inputTwo.split(" ")).toArray(String[]::new);


        int[] numbers = Arrays.stream(input.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        temp = Arrays.stream(numbers).boxed().collect(Collectors.toCollection(ArrayList::new));

        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "destroy" -> destroy(Integer.parseInt(commands[1]));
                case "swap" -> swap(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                case "add" -> add(Integer.parseInt(commands[1]));
                case "insert" -> insert(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                case "center" -> center();
            }
            inputTwo = scan.nextLine();
            commands = Arrays.stream(inputTwo.split(" ")).toArray(String[]::new);
        }

    }

    static void destroy(int num) {
        temp.remove(num);
        System.out.println(temp);
    }

    static void swap(int indexOne, int indexTwo) {
        Collections.swap(temp, indexOne, indexTwo);
        System.out.println(temp);
    }

    static void add(int num) {
        temp.add(num);
        System.out.println(temp);
    }

    static void insert(int index, int num) {
        temp.add(index, num);
        System.out.println(temp);
    }

    static void center() {
        if (temp.size() % 2 == 0) {
            System.out.print(temp.get(temp.size() / 2 - 1) + " ");
            System.out.print(temp.get(temp.size() / 2 + 1));
            System.out.println();
        } else {
            System.out.println(temp.get(temp.size() / 2));
        }
    }

}
