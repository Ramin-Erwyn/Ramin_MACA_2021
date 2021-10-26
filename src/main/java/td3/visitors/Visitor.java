package td3.visitors;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient g);
    void visit(Client c);
    void visit(Commande commande);
    void visit(Ligne l);
}
