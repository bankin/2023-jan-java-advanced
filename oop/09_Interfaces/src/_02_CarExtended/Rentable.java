package _02_CarExtended;

public interface Rentable extends Car  {
    int getMinRentDay();

    double getPricePerDay();

    default double getPriceForDays(int numberOfDays) {
        if (numberOfDays < getMinRentDay()) {
            String message = String.format("Cannot rent %s for less than %d days",
                    getModel(), getMinRentDay());
            throw new IllegalArgumentException(message);
        }

        return numberOfDays * getPricePerDay();
    }
}
