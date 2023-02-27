package modifiers.demo;

public class Demo {
    private String name;

    public Demo() {
        this.name = "";
    }

    public Demo(String name) {
        this();
        this.name = name;
    }

    private void formatName() {

    }

    protected String getName() {
        return this.name;
    }

    String getLastName() {
        return "last";
    }
}
