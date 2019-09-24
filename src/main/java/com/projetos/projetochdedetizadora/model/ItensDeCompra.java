
package com.projetos.projetochdedetizadora.model;

public class ItensDeCompra {
    private Long id;
    private Double valorUnit;
    private Double quantidade;
    private Long compra;
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

    public Long getCompra() {
        return compra;
    }

    public void setCompra(Long compra) {
        this.compra = compra;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }
    
    
}
