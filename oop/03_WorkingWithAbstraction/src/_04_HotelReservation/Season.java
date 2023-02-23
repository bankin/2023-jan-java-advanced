package _04_HotelReservation;

public enum Season {
    Spring(2), Summer(4), Autumn(1), Winter(3);

    private final int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
