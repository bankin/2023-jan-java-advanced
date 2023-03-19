import exceptions.NumbersException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Numbers {

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int lowerBound = 1;
        int upperBound = 100;

        while (numbers.size() < 10) {
            try {
                lowerBound = readNumber(lowerBound, upperBound);

                numbers.add(lowerBound);
            } catch (NumbersException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }

    private static int readNumber(int lowerBound, int upperBound) {
        String input = scanner.nextLine();
        int num;

        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumbersException("Invalid Number!", e);
        }

        if (num <= lowerBound || num >= upperBound) {
            String message = String.format("Your number is not in range %d - %d!",
                    lowerBound, upperBound);
            throw new NumbersException(message);
        }

        return num;
    }
}
