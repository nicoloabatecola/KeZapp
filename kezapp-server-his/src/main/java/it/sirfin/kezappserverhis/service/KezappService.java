
package it.sirfin.kezappserverhis.service;

import it.sirfin.kezappserverhis.dto.InviaMessaggioDto;
import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import it.sirfin.kezappserverhis.model.Messaggio;
import java.util.List;

public interface KezappService {
    
    RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto);
    RegistrazioneDto inviaTutti(InviaMessaggioDto inviaMessaggioDto);
    RegistrazioneDto inviaUno(InviaMessaggioDto inviaMessaggioDto);
    RegistrazioneDto aggiorna(String utenteInteressato);
    void svuotaDB();
    Messaggio allineaNickConSessione(List<Chat> contatti,InviaMessaggioDto inviaMessaggiDto);
}
