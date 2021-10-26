package td3.commandes;

import td3.exceptions.MonException;
import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Client implements PrePostVisitable, Visitable {
    String name;
    private final Map<String, Commande> commandes;

    public Client(String name) {
        this.commandes = new HashMap< >();
        this.name= name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande ccommande){
        for(Commande c: commandes.values())
            c.accept(ccommande);
        //ccommande.posVisit(this);

    }


    @Override
    public void accept(Visitor visitor) {
       // for (Commende c: commandes.values())

    }
    public void addLigne(String lign, Ligne l) throws MonException {
       // Commande c =this.commande.get(cdename);
        if (c != null) { c.addLigne(l);
        }
        else throw new MonException("commande inconnue");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public void accept(PrePostVisitor visitor) {
        visitor.preVisit(this);
        for(Commande c: commandes.values())
            c.accept(visitor);
        visitor.postVisit(this);


    }
}
