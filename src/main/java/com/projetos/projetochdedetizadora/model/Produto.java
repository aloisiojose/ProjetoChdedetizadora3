
package com.projetos.projetochdedetizadora.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    private Long id; //NÃO pode ser nulo
    
    @Column(name = "descricao_produto", length = 100, nullable = true)
    private String descricao; //NÃO pode ser nulo
    
    @Column(name = "quantidade_produto", precision = 10, scale = 2, nullable = true)    
    private float quantidade; //NÃO pode ser nulo
    
    @Column(name = "unidade_produto", length = 100, nullable = true)
    private String unidade; //NÃO pode ser nulo
    
    @Column(name = "valorCusto_produto", precision = 10, scale = 2, nullable = true)
    private Double valorCusto; //NÃO pode ser nulo
    
   
    private String idFornecedor; //RELACIONAMENTO
    
    @Column(name = "observacao_produto", length = 100, nullable = true)
    private String observacao; //PODE ser nulo
    
    @Column(name = "status_produto", length = 100, nullable = true)
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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(String idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
