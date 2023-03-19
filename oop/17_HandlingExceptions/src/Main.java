import demo.Child;
import demo.Parent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        tryFinallyExample();
//        demo4();


        demo1();
    }

    private static void demo4() {
        RuntimeException exception = new RuntimeException("message");
        IllegalArgumentException argumentNotGood
                = new IllegalArgumentException("argument not good", exception);
        RuntimeException causedByALot = new RuntimeException("null", argumentNotGood);
        throw causedByALot;
    }

    static void tryFinallyExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Code executed before try-finally.");
        try {
            String str = scanner.nextLine();
            Integer.parseInt(str);
            System.out.println("Parsing was successful.");
            return; // Exit from the current method  executes the "finally" block
        } catch (NumberFormatException ex) {
            System.out.println("Parsing failed!");
        } finally {
            System.out.println("This cleanup code is always executed.");
        }
        System.out.println("This code is after the try-finally block.");
    }


    private static void demo3() {
        try {
            throw new RuntimeException();
//            System.out.println("No exception");
        } finally {
            System.out.println("Finally");
        }
    }

    private static void demo2() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getClass().getName());
        }
    }

    public static void singleArgument(Parent p) {

    }

    private static void demo1() {
        Parent parent = new Child();

        System.out.println(parent instanceof Child);
        System.out.println(parent instanceof Parent);
        System.out.println(parent instanceof Object);

        try {
            parent.method(6);
            System.out.println("No exception, YAY!");
        } catch (RuntimeException | FileNotFoundException e) {
            System.out.println("Sorry, problem :(\n" + e.getMessage());
            e.printStackTrace(System.out);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Sorry IOException happened :/\n" + e.getMessage());
        }


        System.out.println("Hello world!");
    }
}