
package com.projetos.projetochdedetizadora.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cidade")

public class Cidade implements Serializable  {
   
    @Id //chave primaria
    @GeneratedValue(strategy =GenerationType.IDENTITY)//auto icremente
    @Column(name="id", nullable = false)//coluna no banco de dados
    private Long id; //NÃO pode ser nulo
   
    @Column(name="descricao",length = 100, nullable = false)
    private String descricao; //NÃO pode ser nulo
   
    @Column(name="uf",length = 2, nullable = false)
    private String uf; //NÃO pode ser nulo
     
    @Column(name="cep",length = 8, nullable = false)
    private Long cep; //NÃO pode ser nulo
     
    @Column(name="status",length = 100, nullable = false)
    private String status; //NÃO pode ser nulo

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
