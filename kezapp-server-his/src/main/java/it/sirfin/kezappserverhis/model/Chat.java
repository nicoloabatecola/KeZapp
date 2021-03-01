package it.sirfin.kezappserverhis.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String nickname;
    
    @Column
    private String sessione;

    public Chat() {
    }

    public Chat(Long id, String nickname, String sessione) {
        this.id = id;
        this.nickname = nickname;
        this.sessione = sessione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", nickname=" + nickname + ", sessione=" + sessione + '}';
    }
    
    
    
    
    
    
}
