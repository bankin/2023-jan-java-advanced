import java.util.Scanner;

public class _04_SumOfMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] data = new int[rows][cols];

        for (int row = 0; row < data.length; row++) {
            String[] columnData = scanner.nextLine().split(", ");

            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = Integer.parseInt(columnData[col]);
            }
        }

        int sum = 0;
        for (int[] row : data) {
            for (int cell : row) {
                sum += cell;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
