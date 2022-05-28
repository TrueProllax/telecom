
package telecom.session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Session {
    
    public EntityManager em;
    EntityManagerFactory emf;

    public Session(){
        emf = Persistence.createEntityManagerFactory("telecomPU");
        em = emf.createEntityManager();
    }
}
