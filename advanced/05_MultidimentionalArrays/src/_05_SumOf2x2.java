import java.util.Scanner;

public class _05_SumOf2x2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                table[row][col] = Integer.parseInt(columnData[col]);
            }
        }

        int maxSumTopLeftRow = -1;
        int maxSumTopLeftCol = -1;

        // FIXME: Is 0 a good enough starting value?
        int maxSum = 0;
        for (int row = 0; row < table.length - 1; row++) {
            for (int col = 0; col < table[row].length - 1; col++) {
                int currentSum = table[row][col] + table[row][col + 1]
                    + table[row + 1][col] + table[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxSumTopLeftRow = row;
                    maxSumTopLeftCol = col;
                }
            }
        }

        System.out.println(table[maxSumTopLeftRow][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);
    }
}
