import java.util.Scanner;

public class _02_PositionOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            String[] columnData = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(columnData[col]);
            }
        }

        int search = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == search) {
                    isFound = true;

                    System.out.println(row + " " + col);
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}
