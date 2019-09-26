
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
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "cliente_ordemServico", length = 100, nullable = false)
    private String cliente;  //relaciomento
    
    @Column(name = "cidade_ordemServico", length = 100, nullable = false)
    private String cidade; //relaciomento
    
    @Column(name = "funcionario_ordemServico", length = 100, nullable = false)
    private String funcionario;  //relaciomento
    
    @Column(name = "data_Pedido_ordemServico", length = 100, nullable = false)
    private LocalDate dataPedido;
    
    @Column(name = "dataServico_ordemServico", length = 100, nullable = false)
    private LocalDate dataServico;
    
    @Column(name = "local_ordemServico", length = 100, nullable = false)
    private String local;
    
    @Column(name = "complemento_ordemServico", length = 100, nullable = false)
    private String complemento;
    
    @Column(name = "area_ordemServico", precision = 10, scale = 2, nullable = false)
    private float area;
    
    @Column(name = "situacao_ordemServico", length = 100, nullable = false)
    private String situacao;
    
    @Column(name = "praga_ordemServico", length = 100, nullable = false)
    private String praga;
    
    @Column(name = "produto_ordemServico", length = 100, nullable = false)
    private String produto;  //relaciomento
    
    @Column(name = "modalidade_ordemServico", length = 100, nullable = false)
    private String modalidade;
    
    @Column(name = "tempoGarantia_ordemServico", length = 100, nullable = false)
    private int tempoGarantia;
    
    @Column(name = "valor_custo_ordemServico", precision = 10, scale = 2, nullable = false)
    private double valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getPraga() {
        return praga;
    }

    public void setPraga(String praga) {
        this.praga = praga;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
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
