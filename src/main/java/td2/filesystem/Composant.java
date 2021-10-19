package td2.filesystem;


public interface Composant {

    public abstract String getName();
    public abstract Owner getOwner();
    public abstract void setOwner(Owner owner, boolean recursive);

    public abstract int getSize();
    public abstract String getContent();
    public abstract void appendContent(String name);

    public abstract boolean isComposite();

}
