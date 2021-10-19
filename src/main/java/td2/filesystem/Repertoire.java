package td2.filesystem;

import java.util.List;

public class Repertoire extends ComposantImpl implements Composite,Composant {

    protected Repertoire(String name) {
        super(name);
    }

    @Override
    public void setOwner() {
        super.setOwner();
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
    public List<T> getChildren() {
        return null;
    }

    @Override
    public void addchild() {

    }

    @Override
    public boolean removeChild() {
        return false;
    }

    @Override
    public boolean removeChildren() {
        return false;
    }


    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
