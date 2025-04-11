package com.github.acnaweb.study_apir.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Itens {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Pedidos pedido_id;

    @ManyToOne
    private Product produto_id;

    private Integer quantidade;
    private BigDecimal valor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedidos getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedidos pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Product getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Product produto_id) {
        this.produto_id = produto_id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
