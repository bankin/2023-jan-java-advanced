import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _03_UppercaseWordsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUppercase = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> print = str -> System.out.println(str);

        List<String> uppercaseWords = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> startsWithUppercase.test(w))
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());

        uppercaseWords.forEach(elem -> print.accept(elem));

        Predicate<String> test = s -> s.length() > 5;

    }
}
