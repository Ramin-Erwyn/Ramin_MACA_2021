package td1.refactor.api.bigburger;

import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;
import td1.refactor.api.general.MeatType;

public class BigBurgerRestaurant implements BurgerRestaurant {

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        return null;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return null;

    }

}
