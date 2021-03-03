
package it.sirfin.kezappserverhis.repository;

import it.sirfin.kezappserverhis.model.Messaggio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessaggioRepository extends JpaRepository<Messaggio, Long>{
    List<Messaggio> findByAliasDestinatarioOrAliasDestinatario(String destinatario, String tutti);
}
