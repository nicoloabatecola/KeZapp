package it.sirfin.kezappserverhis.service.impl;

import it.sirfin.kezappserverhis.repository.ChatRepository;
import it.sirfin.kezappserverhis.repository.MessaggioRepository;
import it.sirfin.kezappserverhis.service1.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository chatRepository;
    MessaggioRepository messaggioRepository;
    
    @Override
    public void registrazione() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void aggiorna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
