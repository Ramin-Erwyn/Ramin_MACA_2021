package td4.Ampoule;

public class AmpouleEteinte implements AmpouleState {
    private static final AmpouleState INSTACE = new AmpouleEteinte;

    @Override
    public void allumer(Ampoule a) {
        if(a.usages()+1> Ampoule.MAX_USAGES){
            a.setState(AmpouleCassee.instace());
            System.out.println("->casser");
        }
        else{
            a.setState(AmpouleAllumer.instance());
            a.augmenteUsages();
            System.out.println("allumer");
        }
    }

    @Override
    public void eteinte(Ampoule a) {
        System.out.println("deja eteint");

    }

    @Override
    public void casser(Ampoule a) {

    }

    public void reparer(Ampoule a){
        a.razUsages();
    }
}
