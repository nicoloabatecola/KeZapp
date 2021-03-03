package it.sirfin.kezappserverhis.service.impl;

import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import it.sirfin.kezappserverhis.repository.ChatRepository;
import it.sirfin.kezappserverhis.repository.MessaggioRepository;
import it.sirfin.kezappserverhis.service.KezappService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository chatRepository;
    MessaggioRepository messaggioRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto) {
        //controllo nel DB se il nickname già esiste. Nel caso non esista la query
        //tornerà una lista con dimensione 0 per cui posso accettare il nickname
        //e creare il nuovo record nella tabella chat
        if (chatRepository.findByNickname(reqDto.getNickname()).isEmpty()) {
            Chat chat = new Chat(reqDto.getNickname());
            chat = chatRepository.save(chat);
            chat.setSessione(chat.getId().toString());
            //Da implemenare restituzione di messaggi che corrispondono solo
            //alla sessione
            return new RegistrazioneDto(chatRepository.findAll(), null, chat.getSessione());
        }
        return new RegistrazioneDto();
    }

    @Override
    public void inviaTutti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inviaUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chat> aggiorna() {
        return chatRepository.findAll();
    }

}
