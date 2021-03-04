
package it.sirfin.kezappserverhis.repository;

import it.sirfin.kezappserverhis.model.Chat;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatRepository extends JpaRepository<Chat, Long>{
    List<Chat> findByNickname(String nn);
    Chat findByNicknameAndPassword(String n,String p);
}
