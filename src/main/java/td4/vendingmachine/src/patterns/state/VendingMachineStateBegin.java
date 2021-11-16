package td4.vendingmachine.src.patterns.state;

public class VendingMachineStateBegin {

    private static final VendingMachineState INSTANCE = new VendingMachineStateBegin;

    public static VendingMachineState getInstance() {
        return INSTANCE;
    }
}
