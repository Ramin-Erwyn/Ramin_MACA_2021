package td4.vendingmachine.src.patterns.state;

import td4.Ampoule.AmpouleEteinte;
import td4.Ampoule.AmpouleState;

public class SimpleVendingMachineStateBegin   {

    private static final SimpleVendingMachineState INSTANCE = new SimpleVendingMachineStateBegin;

    public static SimpleVendingMachineState getInstance() {
        return INSTANCE;
    }


}
