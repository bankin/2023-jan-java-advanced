package _01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        readCarsMain();
        test();
    }

    private static void readCarsMain() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carParts = scanner.nextLine().split(" ");

            Car car;
            if (carParts.length > 1) {
                int hp = Integer.parseInt(carParts[2]);

                car = new Car(carParts[0], carParts[1], hp);
            } else {
                car = new Car(carParts[0]);
            }

            System.out.println(car.carInfo());
        }
    }

    public static void test() {
        Car firstCar = new Car();
        Car secondCar = new Car();

        firstCar.setBrand("Opel");
        firstCar.setModel("Astra");
        firstCar.setHorsepower(90);

        secondCar.setBrand("Skoda");

        String firstFormat = String.format("The car is: %s %s - %d HP",
                firstCar.getBrand(), firstCar.getModel(), firstCar.getHorsepower());

//        System.out.println(firstCar);
//        System.out.println(firstFormat);
        System.out.println(firstCar.carInfo());

//        System.out.println(firstCar.equals(secondCar));
    }

    public static void test2() {
        Car car = new Car();
        System.out.println(Car.factoryName);
    }
}
