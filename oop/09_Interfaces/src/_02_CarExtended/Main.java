package _02_CarExtended;

public class Main {

    public static void main(String[] args) {
//        CarImpl car = new CarImpl("asd", "asd", 3, "asd");

        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);

//        System.out.println(audi.getPriceForDays(2));
        System.out.println(audi.getPriceForDays(10));
        System.out.println(Car.a());
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }

}
