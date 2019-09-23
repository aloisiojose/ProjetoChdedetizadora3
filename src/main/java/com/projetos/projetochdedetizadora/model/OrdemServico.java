
package com.projetos.projetochdedetizadora.model;

import java.time.LocalDate;

public class OrdemServico {
    private Long id; //NÃO pode ser nulo
    private String idCliente;  //RELACIONAMENTO
    private String idCidade; //RELACIONAMENTO
    private String idFuncionario;  //RELACIONAMENTO
    private LocalDate dataPedido; //NÃO pode ser nulo
    private LocalDate dataServico; //PODE ser nulo
    private String local; //NÃO pode ser nulo
    private String complemento; //PODE ser nulo
    private float area; //PODE ser nulo
    private String situacaoVisita; //NÃO pode ser nulo
    private String praga; //PODE ser nulo
    private String idProduto;  //RELACIONAMENTO
    private String modalidadeOrdemServico; //NÃO pode ser nulo
    private int tempoGarantia; //PODE ser nulo
    private double valor; //PODE ser nulo

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDate dataServico) {
        this.dataServico = dataServico;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getSituacaoVisita() {
        return situacaoVisita;
    }

    public void setSituacaoVisita(String situacaoVisita) {
        this.situacaoVisita = situacaoVisita;
    }

    public String getPraga() {
        return praga;
    }

    public void setPraga(String praga) {
        this.praga = praga;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getModalidadeOrdemServico() {
        return modalidadeOrdemServico;
    }

    public void setModalidadeOrdemServico(String modalidadeOrdemServico) {
        this.modalidadeOrdemServico = modalidadeOrdemServico;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(int tempoGarantia) {
        this.tempoGarantia = tempoGarantia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }
    
    
}
