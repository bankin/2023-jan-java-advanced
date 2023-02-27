package actualSolutions._04_Teams;

import actualSolutions._01_Person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    Team(String name) {
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();

        setName(name);
    }

    private void setName(String name) {
        if (name.length() < 5) {
            throw new IllegalArgumentException("Team name must be at least 5 symbols");
        }

        this.name = name;
    }

    void addPlayer(Person player) {
        if (player.getAge() < 40) {
            this.firstTeam.add(player);
        } else {
            this.reserveTeam.add(player);
        }
    }

    List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}
