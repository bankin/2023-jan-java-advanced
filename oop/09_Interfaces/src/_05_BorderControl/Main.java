package _05_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> inhabitants = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] parts = input.split(" ");

            Identifiable next;
            if (parts.length == 2) {
                next = new Robot(parts[1], parts[0]);
            } else {
                next = new Citizen(parts[2], parts[0], Integer.parseInt(parts[1]));
            }

            inhabitants.add(next);

            input = scanner.nextLine();
        }

        String badIdSuffix = scanner.nextLine();


        inhabitants
            .stream()
//            e -> e.getId();
            .map(Identifiable::getId)
            .filter(id -> id.endsWith(badIdSuffix))
//            e -> System.out.println(e);
            .forEach(System.out::println);
    }
}
