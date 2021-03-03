package it.sirfin.kezappserverhis.service.impl;

import it.sirfin.kezappserverhis.dto.InviaMessaggioDto;
import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import it.sirfin.kezappserverhis.model.Messaggio;
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

    @Autowired
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
            chatRepository.save(chat);
            //Da implemenare restituzione di messaggi che corrispondono solo
            //alla sessione
            return new RegistrazioneDto(chatRepository.findAll(), messaggioRepository.findAll(), chat.getSessione());
        }
        return new RegistrazioneDto();
    }

    @Override
    public RegistrazioneDto inviaTutti(InviaMessaggioDto inviaMessaggioDto) {
        //Crea un oggetto messaggio recuperando le informazioni da inviaMessaggioDto
        //originariamente spedito da client e lo salva su DB
        Messaggio messaggio = new Messaggio();
        messaggio.setAliasDestinatario(inviaMessaggioDto.getDestinatario());
        messaggio.setAliasMittente(inviaMessaggioDto.getSessione());
        messaggio.setTesto(inviaMessaggioDto.getMessaggio());
        System.out.println(messaggio);
        messaggioRepository.save(messaggio);
        return aggiorna(inviaMessaggioDto.getSessione());
    }

    @Override
    public RegistrazioneDto inviaUno(InviaMessaggioDto inviaMessaggioDto) {
        System.out.println("*********************************************test***************");
        System.out.println(inviaMessaggioDto);
        System.out.println("*********************************************test***************");
        Messaggio messaggio = new Messaggio();
        messaggio.setAliasDestinatario(inviaMessaggioDto.getDestinatario());
        messaggio.setAliasMittente(inviaMessaggioDto.getSessione());
        messaggio.setTesto(inviaMessaggioDto.getMessaggio());
        System.out.println(messaggio);
        messaggioRepository.save(messaggio);
        List<Messaggio> listaTest = messaggioRepository.findByAliasDestinatarioOrAliasDestinatario(inviaMessaggioDto.getSessione(), "tutti");
        System.out.println("*********************************************test***************");
        listaTest.forEach(x -> System.out.println(x));
        System.out.println("*********************************************test***************");
        return aggiorna(inviaMessaggioDto.getSessione());
    }

    @Override
    public RegistrazioneDto aggiorna(String utenteInteressato) {
        System.out.println("utente interessato: " + utenteInteressato);
        RegistrazioneDto regDto = new RegistrazioneDto();
        regDto.setContatti(chatRepository.findAll());
        regDto.setMessaggi(messaggioRepository.findByAliasDestinatarioOrAliasDestinatario(utenteInteressato, "tutti"));
        messaggioRepository.findByAliasDestinatarioOrAliasDestinatario(utenteInteressato, "tutti").forEach(a -> System.out.println(a));

        return regDto;
    }

    @Override
    public void svuotaDB() {
        chatRepository.deleteAllInBatch();
        messaggioRepository.deleteAllInBatch();
    }

}
