package td1.refactor.api.general;

import java.util.List;

public abstract class Burger implements FoodProduct {

    private String name;
    private List<FoodProduct> items;

    protected Burger(String name, List<FoodProduct> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public double calories_per_100g() {
        return calories() / weight() * 100;
    }


}
