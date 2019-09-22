
package com.projetos.projetochdedetizadora.model;

public class Cidade {
    private Long id; //NÃO pode ser nulo
    private String descricao; //NÃO pode ser nulo
    private String uf; //NÃO pode ser nulo
    private Long cep; //NÃO pode ser nulo
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
