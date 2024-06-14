package Exam;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Stack<Character> temp = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                temp.push(ch);
            } else if (ch == ')' && !temp.isEmpty() && temp.peek() == '('
                    || ch == '}' && !temp.isEmpty() && temp.peek() == '{'
                    || ch == '!' && !temp.isEmpty() && temp.peek() == '!') {
                temp.pop();
            }
        }

        if (temp.isEmpty()) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not legendary");
        }

    }
}
