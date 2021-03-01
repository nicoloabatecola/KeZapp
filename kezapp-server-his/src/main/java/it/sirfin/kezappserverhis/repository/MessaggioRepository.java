
package it.sirfin.kezappserverhis.repository;

import it.sirfin.kezappserverhis.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessaggioRepository extends JpaRepository<Messaggio, Long>{
    
}
