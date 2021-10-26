package td3.visitorsImpl;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class PrintRapportCommandes implements Visitor {

    public Map<String,Integer> fac;
    private int prix_cumul = 0;
    private int cumul_client;
    private int cumul_commande;

    public PrintRapportCommandes() {
        fac = new HashMap<String,Integer>();
        prix_cumul = 0;

    }

    @Override
    public void visit(GroupeClient g) {
        System.out.println(String.format("Groupe de client %s",g.getName()));
    }

    @Override
    public void visit(Client c) {
        fac.put(c.getName(),prix_cumul);
        System.out.println(String.format("je visite un client %s",c.getName()));
        prix_cumul =0;
    }

    @Override
    public void visit(Commande commande) {
        fac.put(commande.getName(),cumul_commande);
        System.out.println(String.format("je visite une commande %s",commande.getName()));
        cumul_commande =0;
    }

    @Override
    public void visit(Ligne l){
        System.out.println(String.format("je visite une ligne %s",l.getName()));
        prix_cumul += l.getSum();

    }
}
