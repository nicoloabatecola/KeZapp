
package it.sirfin.kezappserverhis.dto;

public class LoginDto {
    private String nickname;
    private String password;

    public LoginDto() {
    }

    public LoginDto(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDto{" + "nickname=" + nickname + ", password=" + password + '}';
    }
    
    
}
