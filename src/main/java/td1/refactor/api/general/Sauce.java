package td1.refactor.api.general;

public class Sauce implements FoodProduct {

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories_per_100g() {

        return 0;
    }

    @Override
    public String toString() {
    }
}
