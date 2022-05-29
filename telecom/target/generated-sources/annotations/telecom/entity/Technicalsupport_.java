package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Abonent;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T17:30:09", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Technicalsupport.class)
public class Technicalsupport_ { 

    public static volatile SingularAttribute<Technicalsupport, Integer> idTechnicalSupport;
    public static volatile SingularAttribute<Technicalsupport, Abonent> idAbonent;
    public static volatile SingularAttribute<Technicalsupport, String> appeal;

}