/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappserverhis.dto;

import it.sirfin.kezappserverhis.model.Messaggio;


public class CancellaMessaggioDto {

private String sessione;
private Messaggio messaggioDaCancellare;

    public CancellaMessaggioDto() {
    }

    public CancellaMessaggioDto(String sessione, Messaggio messaggioDaCancellare) {
        this.sessione = sessione;
        this.messaggioDaCancellare = messaggioDaCancellare;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    public Messaggio getMessaggioDaCancellare() {
        return messaggioDaCancellare;
    }

    public void setMessaggioDaCancellare(Messaggio messaggioDaCancellare) {
        this.messaggioDaCancellare = messaggioDaCancellare;
    }

    @Override
    public String toString() {
        return "CancellaMessaggioDto{" + "sessione=" + sessione + ", messaggioDaCancellare=" + messaggioDaCancellare + '}';
    }


    
}
