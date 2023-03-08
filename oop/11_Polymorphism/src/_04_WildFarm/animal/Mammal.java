package _04_WildFarm.animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String name, double weight, String region, AnimalType type) {
        super(name, weight, type);

        this.livingRegion = region;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        String formattedWeight = decimalFormat.format(this.getWeight());

        return String.format("%s [%s, %s, %s, %d]",
                this.getType(), this.getName(), formattedWeight, this.livingRegion, this.getFoodEaten());
    }
}
