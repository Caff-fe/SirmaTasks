package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String searchWord = scan.nextLine();

        int first = - 1;
        int last = -0;

        List<String> tempList = new ArrayList<String>(Arrays.asList(input.split(", ")));

        first = tempList.indexOf(searchWord);
        last = tempList.lastIndexOf(searchWord);

        if (first == -1){
            System.out.println("Record not found");
        } else {
            System.out.println(first);
            System.out.println(last);
        }
    }
}
