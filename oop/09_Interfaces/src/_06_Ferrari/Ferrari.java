package _06_Ferrari;

public class Ferrari implements Car {
    private final String model = "488-Spider";
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }


    @Override
    public String breaks() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
            model, breaks(), gas(), driverName);
    }
}
