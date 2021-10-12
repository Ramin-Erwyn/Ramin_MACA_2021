package td1.refactor.api.general;

public enum SauceType implements FoodConstituent {
    BURGER,BARBECUE,BEARNAISE,MAYO ;

    @Override
    public double calories_per_100g() {
       return 0;
    }
}
