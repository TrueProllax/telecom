package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Abonent;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T13:39:24", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile CollectionAttribute<Address, Abonent> abonentCollection;
    public static volatile SingularAttribute<Address, Integer> entrance;
    public static volatile SingularAttribute<Address, String> house;
    public static volatile SingularAttribute<Address, Integer> idAddress;
    public static volatile SingularAttribute<Address, Integer> apartment;

}