package it.sirfin.kezappserverhis.controller;

import it.sirfin.kezappserverhis.service1.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class KeZappController {
    
    @Autowired
    KezappService kezappservice;
}
