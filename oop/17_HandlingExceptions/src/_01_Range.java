import java.util.Scanner;

public class _01_Range {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");

        int lowerBound = Integer.parseInt(parts[0]);
        int upperBound = Integer.parseInt(parts[1]);
        System.out.printf("Range: [%d...%d]\n", lowerBound, upperBound);

        boolean validNumber = false;
        int num = 0;
        while (!validNumber) {
            String input = scanner.nextLine();

//            if (!isNumber()) {
//                System.out.printf("Invalid number: %s\n", input);
//            } else if (!inRange()) {
//                System.out.printf("Invalid number: %s\n", input);
//            } else {
//                break;
//            }

            try {
                num = parseNumberInRange(input, lowerBound, upperBound);
                validNumber = true;
            } catch (RuntimeException e) {
                System.out.printf("Invalid number: %s\n", input);
            }
        }

        System.out.printf("Valid number: %d", num);
    }

    private static int parseNumberInRange(String input, int lowerBound, int upperBound) {
        int num = Integer.parseInt(input);

        if (num < lowerBound || num > upperBound) {
            throw new RuntimeException("Number outside of bounds");
        }

        return num;
    }
}
