package bean;

import bean.Client;
import bean.CommandeItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-17T15:44:01")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Double> total;
    public static volatile ListAttribute<Commande, Client> clients;
    public static volatile SingularAttribute<Commande, Long> id;
    public static volatile ListAttribute<Commande, CommandeItem> commandeItems;

}