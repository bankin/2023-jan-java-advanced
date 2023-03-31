package builder;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setId(7);
        user.setAge(10);
        user.setFirstName("First");
        user.setLastName("Last");

        System.out.println(user);

        User user1 = new User(
            10,
            "First",
            "Last",
            "Address",
            "utr.png",
            "bio",
            10,
            new ArrayList<>());

        UserBuilder userBuilder = new UserBuilder();
        User build = userBuilder
                .withId(7)
                .withAge(10)
                .withFirstName("First")
                .withLastName("Last")
                .build();

        Stream.of(1, 2, 3)
            .filter(num -> num % 2 == 0)
            .map(num -> num * 10)
            .sorted();

        System.out.println(build);

    }
}
