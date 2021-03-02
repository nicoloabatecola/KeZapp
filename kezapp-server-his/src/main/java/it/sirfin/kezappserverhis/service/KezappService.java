
package it.sirfin.kezappserverhis.service;

import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import java.util.List;

public interface KezappService {
    
    RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto);
    void inviaTutti();
    void inviaUno();
    List<Chat> aggiorna();
}
