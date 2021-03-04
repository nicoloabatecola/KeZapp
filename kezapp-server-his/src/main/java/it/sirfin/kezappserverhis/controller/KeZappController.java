package it.sirfin.kezappserverhis.controller;

import it.sirfin.kezappserverhis.dto.CancellaMessaggioDto;
import it.sirfin.kezappserverhis.dto.InviaMessaggioDto;
import it.sirfin.kezappserverhis.dto.RegistrazioneDto;
import it.sirfin.kezappserverhis.dto.RichiediMessaggiDto;
import it.sirfin.kezappserverhis.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappserverhis.model.Chat;
import it.sirfin.kezappserverhis.model.Messaggio;
import it.sirfin.kezappserverhis.service.KezappService;
import java.util.List;
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
    public RegistrazioneDto registrazione(@RequestBody RichiediRegistrazioneDto reqDto) {
        return kezappservice.registrazione(reqDto);
    }

    @RequestMapping("/inviatutti")
    @ResponseBody
    public RegistrazioneDto inviaTutti(@RequestBody InviaMessaggioDto m) {
        return kezappservice.inviaTutti(m);
    }

    @RequestMapping("/inviauno")
    @ResponseBody
    public RegistrazioneDto inviaUno(@RequestBody InviaMessaggioDto m) {
        return kezappservice.inviaUno(m);
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RegistrazioneDto aggiorna(@RequestBody RichiediMessaggiDto r) {
        return kezappservice.aggiorna(r.getSessione());
    }

    @RequestMapping("/cancellaMessaggio")
    @ResponseBody
    public List<Messaggio> cancellaMessaggio(@RequestBody CancellaMessaggioDto r) {
        return kezappservice.cancellaMessaggio(r);
    }

    //metodo svuota db, serve solo a resettare il db in maniera più rapida senza
    //dover usare il client DB
    @RequestMapping("/svuotaDB")
    public void svuotaDB() {
        kezappservice.svuotaDB();
    }

}
