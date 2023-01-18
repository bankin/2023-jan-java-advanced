import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>();

        String[] numbers = scanner.nextLine().split(" ");

        for (String number : numbers) {
            double current = Double.parseDouble(number);

            if (occurrences.containsKey(current)) {
                Integer count = occurrences.get(current);
                occurrences.put(current, count + 1);
            } else {
                occurrences.put(current, 1);
            }
        }

        for (Double currentNumber : occurrences.keySet()) {
            System.out.printf("%.1f -> %d%n", currentNumber, occurrences.get(currentNumber));
        }
    }
}
