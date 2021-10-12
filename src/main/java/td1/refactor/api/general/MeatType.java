package td1.refactor.api.general;

public enum MeatType implements FoodConstituent {
    BEEF, FISH;

    public double price() {
        return price();
    }

    @Override
    public double calories_per_100g() {
        return 0;
    }
}