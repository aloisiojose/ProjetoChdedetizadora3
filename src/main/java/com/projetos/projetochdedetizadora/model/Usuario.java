
package com.projetos.projetochdedetizadora.model;

public class Usuario {
    private Long id; //NÃO pode ser nulo
    private String login; //NÃO pode ser nulo
    private String senha; //NÃO pode ser nulo
    private String confirmarSenha; //NÃO VAI SER ENVIADO PRO BANCO DE DADOS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    
    
}
