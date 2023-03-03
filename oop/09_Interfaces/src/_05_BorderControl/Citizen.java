package _05_BorderControl;

public class Citizen implements Identifiable {
    private String id;
    private String name;
    private int age;

    public Citizen(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getId() {
        return id;
    }
}
