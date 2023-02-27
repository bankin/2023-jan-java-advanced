package modifiers;

import modifiers.alternative.PrivateConstructor;
import modifiers.demo.Demo;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Demo demo = new Demo("pesho");
//        System.out.println(modifiers.demo.getName());

        ArrayDeque<Integer> ints = new ArrayDeque<>();
    }
}