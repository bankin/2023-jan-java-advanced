package stack;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List a = new ArrayList();

        StackOfStrings stackOfStrings = new StackOfStrings();

        System.out.println(stackOfStrings.isEmpty());

        stackOfStrings.push("asd1");
        stackOfStrings.push("asd2");
        stackOfStrings.push("asd3");
        System.out.println(stackOfStrings.pop());

        System.out.println(stackOfStrings.size());
        System.out.println(stackOfStrings.peek());

        System.out.println(stackOfStrings.isEmpty());
    }
}
