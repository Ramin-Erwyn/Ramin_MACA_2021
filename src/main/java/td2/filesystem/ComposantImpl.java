package td2.filesystem;

import java.util.Objects;

public abstract  class  ComposantImpl implements Composant {
    public final String name;

    protected ComposantImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Owner getOwner() {
        return null;
    }

    @Override
    public void setOwner() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposantImpl composant = (ComposantImpl) o;
        return Objects.equals(name, composant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
