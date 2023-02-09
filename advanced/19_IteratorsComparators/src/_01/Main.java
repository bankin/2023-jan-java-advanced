package _01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        display("Some");
        display("Message");

        displayMultiple();
        displayMultiple("a", "b", "c");

        displayArray(new String[]{"a", "b", "c"});
    }

    private static void display(String msg) {
        System.out.println(msg);
    }

    private static void displayMultiple(String... messages) {
        String element = messages[0];

        for (String message : messages) {
        }
    }

    private static void displayArray(String[] arr) {
    }
}