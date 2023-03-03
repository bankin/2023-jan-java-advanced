package _02_CarExtended;

public class Audi extends CarImpl implements Rentable {
    private double pricePerDay;
    private int minRentDays;

    public Audi(String model, String color, int horsePower, String countryProduced, int minDays, double pricePerDay) {
        super(model, color, horsePower, countryProduced);

        this.minRentDays = minDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return minRentDays;
    }

    @Override
    public String toString() {
        return String.format("%s\nMinimum rental period of %d days. Price per day %f",
            super.toString(), getMinRentDay(), getPricePerDay());
    }
}
