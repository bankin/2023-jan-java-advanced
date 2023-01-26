import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class _06_EvenOddInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filterCondition =
            oddOrEven.equals("odd") ?
                (x -> x % 2 != 0) :
                (x -> x % 2 == 0);

        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));

//        Equal to the ternary operator above
//        Predicate<Integer> other;
//        if (oddOrEven.equals("odd")) {
//            other = x -> x % 2 != 0;
//        } else {
//            other = x -> x % 2 == 0;
//        }
//
//        Predicate<Integer> third = x -> x % 2 == 0;
//        if (oddOrEven.equals("odd")) {
//            third = x -> x % 2 != 0;
//        }
    }
}
