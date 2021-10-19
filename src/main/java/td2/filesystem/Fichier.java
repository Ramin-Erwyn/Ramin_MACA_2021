package td2.filesystem;

public class Fichier extends ComposantImpl implements Composant {
    public StringBuilder content;
    protected Fichier(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent() {

    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return "Fichier{" +
                "content=" + content +
                '}';
    }
}
