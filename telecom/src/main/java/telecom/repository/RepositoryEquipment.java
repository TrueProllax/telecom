
package telecom.repository;

import org.springframework.data.repository.CrudRepository;
import telecom.entity.Equipment;


public interface RepositoryEquipment extends CrudRepository <Equipment, Long> {
    
}
