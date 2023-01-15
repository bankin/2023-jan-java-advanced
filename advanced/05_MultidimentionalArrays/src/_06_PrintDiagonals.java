import java.util.Arrays;
import java.util.Scanner;

public class _06_PrintDiagonals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            String[] columnData = scanner.nextLine().split(" ");

//            int[] currentRow = new int[size];
//            for (int col = 0; col < columnData.length; col++) {
//                currentRow[col] = Integer.parseInt(columnData[col]);
//            }

            int[] currentRow = Arrays.stream(columnData)
                    .mapToInt(elem -> Integer.parseInt(elem))
                    .toArray();

            matrix[row] = currentRow;
        }

//        Top left to bottom right
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                if (row == col) {
//                    System.out.print(matrix[row][col] + " ");
//                }
//            }
//        }
//        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int row = size - 1, col = 0; col < size; row--, col++) {
            System.out.print(matrix[row][col] + " ");
        }

        for (int i = 0; i < size; i++) {

        }

    }
}
