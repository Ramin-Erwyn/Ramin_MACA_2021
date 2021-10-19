package td2.filesystem;

import java.util.Objects;

public abstract  class  ComposantImpl implements Composant {
    public final String name;
    private Owner owner;

    protected ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner= this.owner;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Owner getOwner() {
        return this.owner;
    }


    @Override
    public void setOwner(Owner owner, boolean rec){this.owner =owner;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composant fichier = (Composant) o;
        return Objects.equals(this.getName(), fichier.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
}
