
package com.projetos.projetochdedetizadora.model;

public class ItensOs {
    private Long id;
    private Double valorUnit;
    private Double quantidade;
    private Long ordemServico;
    private Long produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Long getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(Long ordemServico) {
        this.ordemServico = ordemServico;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }
    
    
}
