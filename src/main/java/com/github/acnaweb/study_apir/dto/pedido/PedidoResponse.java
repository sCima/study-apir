package com.github.acnaweb.study_apir.dto.pedido;

import com.github.acnaweb.study_apir.model.Pedidos;

public class PedidoResponse {
    private Long id;
    private String status;

    public PedidoResponse toDto(Pedidos pedido) {
        this.setId(pedido.getId());
        this.setStatus(pedido.getStatus());
        return this;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
