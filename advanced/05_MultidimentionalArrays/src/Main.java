import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] table = new int[3][2];

        System.out.println(table.length);
        System.out.println(table[0].length);

        System.out.println(table[1][1]);

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = i + j;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowNums = scanner.nextLine().split(" ");

            for (int j = 0; j < cols; j++) {
                data[i][j] = Integer.parseInt(rowNums[j]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}