import java.util.*;

public class _01_ParkingLot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] parts = input.split(", ");
            String direction = parts[0];
            String carNumber = parts[1];

            if (direction.equals("IN")) {
                cars.add(carNumber);
            } else if (direction.equals("OUT")) {
                cars.remove(carNumber);
            } else {
                System.out.println("UNKNOWN DIRECTION");
            }

            input = scanner.nextLine();
        }

        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
