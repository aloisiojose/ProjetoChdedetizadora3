
package com.projetos.projetochdedetizadora.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordemServico")
public class OrdemServico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    private Long id; //NÃO pode ser nulo
   
    
    private String idCliente;  //RELACIONAMENTO
  
    private String idFuncionario;  //RELACIONAMENTO
    
    @Column(name = "dataPedito_ordemServico", columnDefinition = "DATE")
    private LocalDate dataPedido; //NÃO pode ser nulo
    
    @Column(name = "dataServico_ordemServico", columnDefinition = "DATE")
    private LocalDate dataServico; //PODE ser nulo
    
    @Column(name = "local_ordemServico", length = 100, nullable = true)
    private String local; //NÃO pode ser nulo
    
    @Column(name = "complemento_ordemServico", length = 100, nullable = true)
    private String complemento; //PODE ser nulo
    
    @Column(name = "area_ordemServico", length = 100, nullable = true)
    private float area; //PODE ser nulo
    
    @Column(name = "situacaoVisita_ordemServico", length = 100, nullable = true)
    private String situacaoVisita; //NÃO pode ser nulo
    
    @Column(name = "praga_ordemServico", length = 100, nullable = true)
    private String praga; //PODE ser nulo
    
    
    private String idProduto;  //RELACIONAMENTO
    
    @Column(name = "modalidadeOrdemServico_ordemServico", length = 100, nullable = true)
    private String modalidadeOrdemServico; //NÃO pode ser nulo
    
    @Column(name = "tempoGarantia_ordemServico", length = 100, nullable = true)
    private int tempoGarantia; //PODE ser nulo
    
    @Column(name = "valorCusto_ordemServico", precision = 10, scale = 2, nullable = true)
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
}
