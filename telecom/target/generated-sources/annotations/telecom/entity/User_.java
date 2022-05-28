package telecom.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import telecom.entity.Abonent;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-28T13:39:24", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> idUser;
    public static volatile SingularAttribute<User, Integer> number;
    public static volatile SingularAttribute<User, String> patronymic;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile CollectionAttribute<User, Abonent> abonentCollection;

}