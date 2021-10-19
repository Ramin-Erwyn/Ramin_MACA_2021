package td2.filesystem;

public class FSFactory  {
    public final FSFactory INSTANCE = new FSFactory();

    public FSFactory getINSTANCE() {
        return INSTANCE;
    }
    public Composant createComposant(type: ComposantType, name: String, owner: Owner);
}
