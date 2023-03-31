package builder;

public class UserBuilder {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

//    private User user;

    public UserBuilder() {
//        this.user = new User();
    }

    public User build() {
        return new User(
            id,
            firstName,
            lastName,
            null,
            null,
            null,
            age,
            null);
    }

    public UserBuilder withId(int id) {
//        this.user.setId(id);
        this.id = id;

        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;

        return this;
    }

    public UserBuilder withFirstName(String name) {
        this.firstName = name;

        return this;
    }

    public UserBuilder withLastName(String name) {
        this.lastName = name;

        return this;
    }
}
