package td3.visitorsImpl;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitable.PrePostVisitable;
import td3.visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override
    public void preVisit(GroupeClient g) {
        System.out.println("le groupe");
    }

    @Override
    public void postVisit(GroupeClient g) {
        System.out.println("le groupe");
    }

    @Override
    public void preVisit(Client c) {
        System.out.println("le nom du client est"+c.getName());
    }

    @Override
    public void postVisit(Client c) {
        System.out.println("le client");
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("la commande est"+commande.getName());
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("la commande");
    }

    @Override
    public void preVisit(Ligne l) {
        System.out.println("la ligne est"+l.getName()+ "et le sum="+l.getSum());
    }

    @Override
    public void postVisit(Ligne l) {
    }
}
