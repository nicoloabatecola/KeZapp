package it.sirfin.kezappserverhis.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nickname;

    @Column
    private String sessione;

    @Column
    private String password;

    public Chat() {
    }

    public Chat(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
//        this.sessione = String.valueOf(Math.random()) + nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSessione() {
        return sessione;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", nickname=" + nickname + ", sessione=" + sessione + ", password=" + password + '}';
    }

}
