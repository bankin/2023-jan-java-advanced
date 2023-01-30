import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // 0x1540a3d
        add5(numbers);
        System.out.println(numbers.size());

        int a = 0;
        changeTo5(a);
        System.out.println(a); // ???
    }

    private static void changeTo5(int a) {
        a = 5;
    }

    private static List<Integer> add5(List<Integer> list) {
        list.add(5);

        return list;
    }
}