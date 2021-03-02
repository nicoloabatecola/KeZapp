package it.sirfin.kezappserverhis.controller;

import it.sirfin.kezappserverhis.dto.InviaMessaggioDto;
import it.sirfin.kezappserverhis.dto.RichiediMessaggiDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Messaggio;
import it.sirfin.kezappserverhis.service1.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class KeZappController {

    @Autowired
    KezappService kezappservice;

    @RequestMapping("/registrazione")
    @ResponseBody
    public RichiediRegistrazioneDto registrazione() {
        return new RichiediRegistrazioneDto();
    }

    @RequestMapping("/inviatutti")
    @ResponseBody
    public RichiediMessaggiDto inviaTutti() {
        return new RichiediMessaggiDto();
    }

    @RequestMapping("/inviauno")
    @ResponseBody
    public InviaMessaggioDto inviaUno() {
        return new InviaMessaggioDto();
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RichiediMessaggiDto aggiorna() {
        return new RichiediMessaggiDto();
    }
}
