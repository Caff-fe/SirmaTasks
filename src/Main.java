import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int colls = Integer.parseInt(scan.nextLine());

        String test = scan.nextLine();
        String testTwo = scan.nextLine();

        int[] temp = Arrays.stream(test.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] tempTwo = Arrays.stream(testTwo.split(" ")).mapToInt(Integer::parseInt).toArray();

        // Need to put numbers into cells from the input
        int[][] arr = new int[rows][colls];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                arr[i][j] = temp[j];
            }

        }

        System.out.println((Arrays.deepToString(arr)));
    }
}
