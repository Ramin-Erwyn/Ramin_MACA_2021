package td1.refactor.api.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerAdvisor {

    private static BurgerAdvisor instance = null;

    private static Map<Tariff, List<BurgerRestaurant>> registry = new HashMap<>();

    private BurgerAdvisor() {
    }

    public static BurgerAdvisor instance() {
        if (instance == null) {
            instance = new BurgerAdvisor();
        }
        return instance;
    }
    public BurgerRestaurant select(Tariff tariff) {
        return registry.get(tariff).get(0);
    }
    public static void register(Tariff tariff, BurgerRestaurant restaurant) {
        if (!registry.containsKey(tariff)) {
            registry.put(tariff, new ArrayList<>());
        }
        registry.get(tariff).add(restaurant);
    }


}
