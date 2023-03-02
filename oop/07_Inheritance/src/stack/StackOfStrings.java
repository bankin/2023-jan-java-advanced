package stack;

import java.util.*;

public class StackOfStrings {
    private final List<String> data;
    // private final String[] data;
    // private final Deque<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        int index = this.size() - 1;

        return this.data.remove(index);
    }

    public String peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        int index = this.size() - 1;

        return this.data.get(index);
    }

    public int size() {
        return this.data.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
