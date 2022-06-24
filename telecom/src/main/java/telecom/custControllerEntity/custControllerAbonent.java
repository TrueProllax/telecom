package telecom.custControllerEntity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import telecom.entity.Abonent;
import telecom.entity.Contract;
import telecom.entity.User;

public class custControllerAbonent {

    public custControllerAbonent() {
        
    }
    
    public List selectByAuth (String login, String password, EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root <User> root = cq.from(User.class);
        cq.select(root).where(
                cb.and(
                        cb.equal(root.get("number"),login), 
                        cb.equal(root.get("password"),password))
                );
        TypedQuery query = em.createQuery(cq);
        List<User> userLoginPassword = query.getResultList();
        return userLoginPassword;
    }
    
    
    public List selectByStatus (String status, EntityManager em) {
        
        List listContract = em.createNamedQuery("Contract.findByStatus")
                .setParameter("status", status)
                .getResultList();
        
        List  listAbonent  = new ArrayList();
        
        for (int i = 0; i < listContract.size(); i++) {
            Contract con = (Contract) listContract.get(i);
            List select = em.createNamedQuery("Abonent.findByContract")
                    .setParameter("contact", con)
                    .getResultList();
            listAbonent.add(select.get(0));
        }
        
        return listAbonent;
    }
}
