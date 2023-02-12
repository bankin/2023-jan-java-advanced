package christmas;

import java.util.*;
import java.util.stream.Collectors;

public class Bag {
    private String color;

    private int capacity;

    private List<Present> data;

//    private Map<String, Present> presentsByName;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
//        this.presentsByName = new HashMap<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return this.data.size();
    }

    public void add(Present present) {
        if (this.count() >= this.getCapacity()) {
            return;
        }

        this.data.add(present);
//        this.presentsByName.put(present.getName(), present);
    }

    public boolean remove(String name) {
//        Present result = this.presentsByName.get(name);
//
//        if (result == null) {
//            return false;
//        }
//
//        this.presentsByName.remove(name);
//        this.data.remove(result);

        return this.data.removeIf(p -> p.getName().equals(name));
    }

    public Present heaviestPresent() {
        Present heaviest = this.data.get(0);

//        for (int i = 1; i < this.data.size(); i++) {
//            if (this.data.get(i).getWeight() > heaviest.getWeight()) {
//                heaviest = this.data.get(i);
//            }
//        }

        for (Present present : data) {
            if (present.getWeight() > heaviest.getWeight()) {
                heaviest = present;
            }
        }

        return heaviest;

//        return this.data
//            .stream()
//            .sorted((l, r) -> Double.compare(r.getWeight(), l.getWeight()))
////            .findFirst()
////            .get();
//            .limit(1)
//            .collect(Collectors.toList())
//            .get(0);
    }

    public Present getPresent(String name) {
        for (Present present : data) {
            if (present.getName().equals(name)) {
                return present;
            }
        }

//        this.data
//            .stream()
//            .filter(p -> p.getName().equals(name))
//            .collect(Collectors.toList())
//            .get(0);

        return null;
    }

    public String report() {
        String presentsString = this.data
                .stream()
                .map(p -> p.toString())
                .collect(Collectors.joining("\n"));

        return String.format("%s bag contains:\n%s",
            this.color, presentsString);
    }
}
