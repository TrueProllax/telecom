
package telecom.session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Session {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("telecomPU");
    public static final EntityManager em = emf.createEntityManager();

    public Session() {
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    
    public static EntityManager getEm() {
        return em;
    }
    
}
