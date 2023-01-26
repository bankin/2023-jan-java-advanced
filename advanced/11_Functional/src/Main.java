import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> test = x -> x * x; // f(x) = x^2
        BiFunction<String, String, Integer> biFunction = Main::sum;
        BiFunction<String, Double, String> format = (f, num) -> String.format(f, num); // Main::formatNumber;

        BiConsumer<String, Double> printFormat = Main::printFormatted;

        // f(x, y) = ...

        increment(5);
        test.apply(5);

        formatNumber("%.2f", 0.51314);
        formatNumber("%d", 0.51314);
        formatNumber("%.d", 0.51314);

        printFormatted("%.2f", 1.45);
    }

    private static void printFormatted(String format, double number) {
        System.out.printf(format, number);
    }

    private static String formatNumber(String format, double number) {
        return String.format(format, number);
    }

    private static int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    private static int increment(int num) {
        return num + 1;
    }
}