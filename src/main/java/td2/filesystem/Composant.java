package td2.filesystem;


public interface Composant {

    public abstract String getName();
    public abstract Owner getOwner();
    public abstract void setOwner(owner:Owner,recursive:bool);

    public abstract int getSize();
    public abstract String getContent();
    public abstract void appendContent(name: string);

    public abstract boolean isComposite();

}
