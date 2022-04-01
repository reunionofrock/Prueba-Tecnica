package com.josemar.backend.Entities;

public class Registro {
    private String nombreUser;
    private String emailUser;
    private String nickNameUser;
    private String passwordUser;

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNickNameUser() {
        return nickNameUser;
    }

    public void setNickNameUser(String nickNameUser) {
        this.nickNameUser = nickNameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
}
