package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Equipment;
import telecom.entity.Ports;
import telecom.entity.Typesofequipment;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T17:30:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Informationabouttheequipment.class)
public class Informationabouttheequipment_ { 

    public static volatile SingularAttribute<Informationabouttheequipment, Integer> idInformationAboutTheEquipment;
    public static volatile SingularAttribute<Informationabouttheequipment, String> note;
    public static volatile SingularAttribute<Informationabouttheequipment, Integer> serialNumber;
    public static volatile SingularAttribute<Informationabouttheequipment, String> noteAboutInstatlation;
    public static volatile CollectionAttribute<Informationabouttheequipment, Ports> portsCollection;
    public static volatile SingularAttribute<Informationabouttheequipment, Integer> oSInventoryNumber;
    public static volatile SingularAttribute<Informationabouttheequipment, String> noteAboutPlace;
    public static volatile CollectionAttribute<Informationabouttheequipment, Equipment> equipmentCollection;
    public static volatile SingularAttribute<Informationabouttheequipment, Typesofequipment> type;

}