
package telecom.repository;

import telecom.entity.Abonent;

import org.springframework.data.repository.CrudRepository;


public interface ReposetoryAbonent extends CrudRepository <Abonent, Long>  {
    // extends CrudRepository <Abonent, Long> 
    
    Abonent findByNumber(String number);
}
