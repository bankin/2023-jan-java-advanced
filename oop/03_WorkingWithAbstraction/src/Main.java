import java.util.Arrays;
import java.util.List;

class MonthC {
    private String name;
    private int order;

    public MonthC(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public void setName(String name) {
        if (!name.equals("January"))
            this.name = name;
    }
}

enum Month {
    Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
}

enum Planets {
    Earth("Planet Earth", 650000, 65000, Arrays.asList("some", "second")),
    Mars("Planet Earth", 650000, 65000, Arrays.asList("some", "second"));

    private String name;
    private int weight;
    private int diameter;
    private List<String> friendPlanets;

    Planets(String name, int weight, int diameter, List<String> other) {
        this.name = name;
        this.weight = weight;
        this.diameter = diameter;
        this.friendPlanets = other;
    }

    public String getName() {
        return name;
    }

    public double weightToDiameterRatio() {
        return weight / diameter;
    }
}

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Planets earth = Planets.Earth;

        System.out.println(earth.getName());
        System.out.println(earth.name());


        Month month = Month.Feb;

        Month mar = Month.valueOf("Mar");
        Month june = Month.valueOf("Jun");

        Month[] values = Month.values();

        System.out.println(mar);

        System.out.println(month.name());
    }
}

