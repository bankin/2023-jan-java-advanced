import java.util.Scanner;

public class _02_Snake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][];
        int snakeRow = -1, snakeCol = -1;
        int lairFirstRow = -1, lairFirstCol = -1,
            lairSecondRow = -1, lairSecondCol = -1;

        for (int i = 0; i < n; i++) {
            field[i] = scanner.nextLine().toCharArray();

            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 'S') {
                    snakeRow = i;
                    snakeCol = j;
                }

                if (field[i][j] == 'B') {
                    if (lairFirstRow == -1) {
                        lairFirstRow = i;
                        lairFirstCol = j;
                    } else {
                        lairSecondRow = i;
                        lairSecondCol = j;
                    }
                }
            }
        }

        int foodEaten = 0;
//        boolean isSnakeWithinLimits = true;
//        while (isSnakeWithinLimits && foodEaten < 10) {
        while (foodEaten < 10) {
            String command = scanner.nextLine();

            markVisited(field, snakeRow, snakeCol);
//            field[snakeRow][snakeCol] = '.';

            switch (command) {
                case "left": snakeCol--; break;
                case "right": snakeCol++; break;
                case "down": snakeRow++; break;
                case "up": snakeRow--; break;
            }

            if (snakeRow < 0 || snakeRow >= n ||
                snakeCol < 0 || snakeCol >= n) {
//                isSnakeWithinLimits = true;
//                continue;
                break;
            }

            if (field[snakeRow][snakeCol] == '*') {
                foodEaten++;
            }

            if (snakeRow == lairFirstRow && snakeCol == lairFirstCol) {
                markVisited(field, snakeRow, snakeCol);
//            field[snakeRow][snakeCol] = '.';

                snakeRow = lairSecondRow;
                snakeCol = lairSecondCol;
            } else if (snakeRow == lairSecondRow && snakeCol == lairSecondCol) {
                markVisited(field, snakeRow, snakeCol);
//            field[snakeRow][snakeCol] = '.';

                snakeRow = lairFirstRow;
                snakeCol = lairFirstCol;
            }


            field[snakeRow][snakeCol] = 'S';
        }

        if (foodEaten >= 10) {
            System.out.println("You won! You fed the snake.");
        } else {
            System.out.println("Game over!");
        }
        System.out.printf("Food eaten: %d\n", foodEaten);

        // field.length
        for (int i = 0; i < n; i++) {
            // field[i].length
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static void markVisited(char[][] field, int row, int col) {
        field[row][col] = '.';
    }
}
