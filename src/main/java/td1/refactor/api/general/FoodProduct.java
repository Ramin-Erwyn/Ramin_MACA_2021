package td1.refactor.api.general;

public interface FoodProduct extends FoodConstituent, Product {
    default double calories() {

    }
}
