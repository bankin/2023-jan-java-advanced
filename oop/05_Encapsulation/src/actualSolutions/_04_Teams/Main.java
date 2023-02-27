package actualSolutions._04_Teams;

import actualSolutions._01_Person.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        Team team = new Team("Starts");
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            Person person = null;
            try {
                person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (person != null) {
                team.addPlayer(person);
            }
        }

//        List<Person> firstTeam = team.getFirstTeam();
//        Person person = firstTeam.get(0);

//        person.increaseSalary();
//        System.out.println();

        System.out.printf("First team have %d players\n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players\n", team.getReserveTeam().size());
    }
}
