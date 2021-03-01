
package it.sirfin.kezappserverhis.repository;

import it.sirfin.kezappserverhis.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatRepository extends JpaRepository<Chat, Long>{
    
}
