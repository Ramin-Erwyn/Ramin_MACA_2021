package td3.commandes;

import td3.visitable.PrePostVisitable;
import td3.visitable.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Commande implements PrePostVisitable, Visitable {
    private String name;
    private Map<String,Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<String,Ligne>();
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne l){

    }

    @Override
    public void accept(PrePostVisitor visitor){

    }

    @Override
    public void accept(Visitor visitor){

    }
}
