package td2.filesystem;

import java.util.ArrayList;
import java.util.List;

public final class Repertoire extends ComposantImpl implements Composite<Composant>,Composant {
    private List<Composant> children;

    protected Repertoire(String name,Owner owner) {
        super(name, owner);
        children = new ArrayList<>();
    }

    @Override // correction du prof avec stream
    public void setOwner(Owner o, boolean rec) {
        super.setOwner(o, rec);
        if (rec){
            this.children.forEach(c->c.setOwner(o, rec));
        }
    }

    @Override
    public int getSize() {
      return  this.children.size();
    }

    @Override
    public String getContent() {

        StringBuilder sb = new StringBuilder();
        return null;
    }

    @Override
    public void appendContent(String name) {
        throw new UnsupportedOperationException("nop");

    }


    @Override
    public List<Composant> getChildren() {
        return new ArrayList<>(this.children);
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }


    @Override
    public void removeChild(Composant composant) {
        this.children.remove(composant);
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return false;
    }


    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return getContent();
    }
}
