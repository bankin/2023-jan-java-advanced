package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String profilePictureUrl;
    private String shortBio;
    private int age;
    private List<User> friends;

    public User() {
        this.friends = new ArrayList<>();
    }

        public User(int id, String firstName, String lastName, String address, String profilePictureUrl, String shortBio, int age, List<User> friends) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.profilePictureUrl = profilePictureUrl;
        this.shortBio = shortBio;
        this.age = age;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<User> getFriends() {
        return Collections.unmodifiableList(this.friends);
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", profilePictureUrl='" + profilePictureUrl + '\'' +
                ", shortBio='" + shortBio + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
