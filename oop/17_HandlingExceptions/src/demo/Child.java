package demo;

import java.io.IOException;

public class Child extends Parent {

    @Override
    public void method(int num) throws IOException {
        if (num % 2 == 0) {
            throw new RuntimeException("Hey, Runtime here!");
        }

        throw new IOException("IO message here");
    }
}
