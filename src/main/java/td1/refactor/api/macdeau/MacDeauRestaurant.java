package td1.refactor.api.macdeau;

import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;
import td1.refactor.api.general.MeatType;
import td1.refactor.api.general.SauceType;

public class MacDeauRestaurant implements BurgerRestaurant {

    private static MacDeauRestaurant instance = null;

    private MacDeauRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        return null;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return 0;
    }

}
