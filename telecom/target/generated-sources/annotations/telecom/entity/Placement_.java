package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Ports;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T17:30:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Placement.class)
public class Placement_ { 

    public static volatile SingularAttribute<Placement, String> address;
    public static volatile CollectionAttribute<Placement, Ports> portsCollection;
    public static volatile SingularAttribute<Placement, Integer> idPlacement;
    public static volatile SingularAttribute<Placement, String> coordinates;
    public static volatile SingularAttribute<Placement, String> connectionPoint;

}