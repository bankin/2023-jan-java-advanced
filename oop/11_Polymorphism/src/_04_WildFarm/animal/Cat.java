package _04_WildFarm.animal;

import _04_WildFarm.food.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String name, double weight, String region, String breed) {
        super(name, weight, region, AnimalType.Cat);

        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public boolean willEatFood(Food food) {
        return true;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        String formattedWeight = decimalFormat.format(this.getWeight());

        return String.format("%s [%s, %s, %s, %s, %d]",
                this.getType(), this.getName(), this.breed, formattedWeight, this.getLivingRegion(), this.getFoodEaten());
    }
}
