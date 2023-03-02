package animal.animals;

public class Animal {
    private String name;
    public int age;

    public final void eat() {
        System.out.println("eating...");
    }

    protected void walk() {
        System.out.println("walking...");
    }

    void sleep() {
        System.out.println("sleeping...");
    }
}
