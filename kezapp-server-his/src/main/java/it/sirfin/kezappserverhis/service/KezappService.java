
package it.sirfin.kezappserverhis.service;

import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;

public interface KezappService {
    
    RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto);
    void inviaTutti();
    void inviaUno();
    void aggiorna();
}
