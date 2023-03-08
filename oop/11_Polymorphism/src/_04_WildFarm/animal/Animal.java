package _04_WildFarm.animal;

import _04_WildFarm.food.Food;

public abstract class Animal {
    private String name;
    private AnimalType type;
    private Double weight;
    private int foodEaten;

    public Animal(String name, double weight, AnimalType type) {
        this.name = name;
        this.weight = weight;
        this.type = type;

        this.foodEaten = 0;
    }

    protected String getName() {
        return name;
    }

    protected AnimalType getType() {
        return type;
    }

    protected Double getWeight() {
        return weight;
    }

    protected int getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public abstract boolean willEatFood(Food food);

    public void eat(Food food) {
        if (!willEatFood(food)) {
            System.out.printf("%s are not eating this type of food!\n", this.type.name());
            return;
        }

        this.foodEaten += food.getQuantity();
    }
}
