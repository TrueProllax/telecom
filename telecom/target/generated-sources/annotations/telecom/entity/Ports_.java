package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Informationabouttheequipment;
import telecom.entity.Placement;
import telecom.entity.Portstype;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T17:30:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Ports.class)
public class Ports_ { 

    public static volatile SingularAttribute<Ports, String> iPAddress;
    public static volatile SingularAttribute<Ports, Informationabouttheequipment> idEquipment;
    public static volatile SingularAttribute<Ports, Portstype> portsType;
    public static volatile SingularAttribute<Ports, Placement> idPlacement;
    public static volatile SingularAttribute<Ports, Integer> idPort;
    public static volatile SingularAttribute<Ports, String> name;
    public static volatile SingularAttribute<Ports, String> mac;
    public static volatile SingularAttribute<Ports, String> status;

}