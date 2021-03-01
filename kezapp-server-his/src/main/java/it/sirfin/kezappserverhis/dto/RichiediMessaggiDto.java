package it.sirfin.kezappserverhis.dto;

public class RichiediMessaggiDto {
    
    private String sessione;

    public RichiediMessaggiDto() {
    }

    public RichiediMessaggiDto(String sessione) {
        this.sessione = sessione;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "RichiediMessaggiDto{" + "sessione=" + sessione + '}';
    }
    
    
}
