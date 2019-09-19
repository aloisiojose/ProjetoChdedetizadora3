
package com.projetos.projetochdedetizadora.model;

public class Cliente {
    private Long id;
    private String descricao;
    private String endereco;
    private String cidade; //relaciomento
    private int cep;
    private int telefone1;
    private int telefone2;
    private int telefone3;
    private String email;
    private String tipoPessoa;
    private int cpf_cnpj;
    private String inscricaoEstatual;
    private char status;
    private String observacao;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public int getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(int telefone3) {
        this.telefone3 = telefone3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public int getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(int cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(String inscricaoEstatual) {
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}
