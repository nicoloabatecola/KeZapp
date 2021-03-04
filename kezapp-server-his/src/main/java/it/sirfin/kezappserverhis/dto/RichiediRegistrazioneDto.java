package it.sirfin.kezappserverhis.dto;

public class RichiediRegistrazioneDto {

    private String nickname;
    private String password;

    public RichiediRegistrazioneDto() {
    }

    public RichiediRegistrazioneDto(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "RichiediRegistrazioneDto{" + "nickname=" + nickname + ", password=" + password + '}';
    }



}
