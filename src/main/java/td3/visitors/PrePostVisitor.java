package td3.visitors;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {

     void preVisit(GroupeClient g);
     void preVisit(Client c);
     void preVisit(Commande commande);
     void preVisit(Ligne l);
     void postVisit(GroupeClient g);
     void postVisit(Client c);
     void postVisit(Commande commande);
     void postVisit(Ligne l);


}
