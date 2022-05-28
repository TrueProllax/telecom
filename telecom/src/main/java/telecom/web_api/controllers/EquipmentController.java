
package telecom.web_api.controllers;


import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import telecom.entity.Equipment;
import telecom.session.Session;

@RestController
public class EquipmentController {
    
    
    @RequestMapping("/api/equipment/state")
    public Object route (@RequestParam(value="name", required=false, defaultValue="none") String name) {
        
        Session s = new Session();
        if (!"none".equals(name)) {
            try {
            List list = s.em.createNamedQuery("Equipment.findByName")
                    .setParameter("name", name)
                    .getResultList();
            Equipment route =  (Equipment) list.get(0);
            
            if ("true".equals(route.getState())) {
                return 1;
            } else {
                return 0;
            }
           
            } catch (Exception e) {
                return "нету такого";
            }
        } else {
            List list = s.em.createNamedQuery("Equipment.findAll").getResultList();
            Object o = list;
            return (Object) o;
        }
        
    }
    
}
