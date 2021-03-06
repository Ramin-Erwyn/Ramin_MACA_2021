package td1.refactor.api.general;

public class Tomato implements FoodProduct {

    private static double BASE_PRICE = 0.5;
    private double weight;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
