import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class _02_1_SumBiFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int sum = 0;
        BiFunction<Integer, String, Integer> parseAndAdd =
                (acc, curr) -> acc + Integer.parseInt(curr);

        for (String number : numbers) {
            sum = parseAndAdd.apply(sum, number);
        }

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);


        Integer reducedSum = Arrays.stream(scanner.nextLine().split(", "))
                .map(str -> Integer.parseInt(str))
                .reduce(0, (acc, curr) -> acc + curr);

        System.out.println("Reduced sum = " + reducedSum);

    }
}
