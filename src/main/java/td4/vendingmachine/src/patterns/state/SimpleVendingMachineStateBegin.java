package td4.vendingmachine.src.patterns.state;

import td4.Ampoule.AmpouleEteinte;
import td4.Ampoule.AmpouleState;

public class SimpleVendingMachineStateBegin implements SimpleVendingMachineState{

    private static final SimpleVendingMachineState INSTACE = new SimpleVendingMachineStateBegin;

    public static SimpleVendingMachineState getINSTACE() {
        return INSTACE;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {

    }
}
