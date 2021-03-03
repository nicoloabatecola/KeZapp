
package it.sirfin.kezappserverhis.service;

import it.sirfin.kezappserverhis.dto.InviaMessaggioDto;
import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import java.util.List;

public interface KezappService {
    
    RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto);
    RegistrazioneDto inviaTutti(InviaMessaggioDto inviaMessaggioDto);
    void inviaUno();
    List<Chat> aggiorna();
    void svuotaDB();
}
