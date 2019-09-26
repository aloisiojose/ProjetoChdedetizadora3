
package com.projetos.projetochdedetizadora.model;

<<<<<<< HEAD
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;
    
    @Column(name="login", length = 100, nullable = false)
    private String login;
    
    @Column(name="senha", length = 8, nullable = false)
    private String senha;
=======
public class Usuario {
    private Long id; //NÃO pode ser nulo
    private String login; //NÃO pode ser nulo
    private String senha; //NÃO pode ser nulo
    private String confirmarSenha; //NÃO VAI SER ENVIADO PRO BANCO DE DADOS
>>>>>>> parent of db85a7f... mapeamento_aloisio

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
    
    
}
