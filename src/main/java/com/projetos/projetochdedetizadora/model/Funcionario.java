
package com.projetos.projetochdedetizadora.model;

public class Funcionario {
    private Long id; //NÃO pode ser nulo
    private String descricao; //NÃO pode ser nulo
    private String endereco; //NÃO pode ser nulo
    private int num; //NÃO pode ser nulo
    private String idCidade; //RELACIONAMENTO
    private Long telefone1; //NÃO pode ser nulo
    private String funcao; //NÃO pode ser nulo
    private String status; //NÃO pode ser nulo

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }

    public Long getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(Long telefone1) {
        this.telefone1 = telefone1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    } 
    
}
