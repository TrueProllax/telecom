package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Address;
import telecom.entity.Technicalsupport;
import telecom.entity.User;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T17:30:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Abonent.class)
public class Abonent_ { 

    public static volatile SingularAttribute<Abonent, User> idUser;
    public static volatile SingularAttribute<Abonent, Integer> idAbonent;
    public static volatile SingularAttribute<Abonent, Integer> personalAccount;
    public static volatile SingularAttribute<Abonent, Address> idAddress;
    public static volatile CollectionAttribute<Abonent, Technicalsupport> technicalsupportCollection;

}