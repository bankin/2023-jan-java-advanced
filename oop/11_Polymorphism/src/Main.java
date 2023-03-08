import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();


        printCollection(set);
        printCollection(list);
    }

    private static void printCollection(Iterable<Integer> set) {
        set.forEach(System.out::println);
    }
}