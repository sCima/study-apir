package com.github.acnaweb.study_apir.dto.pedido;

import com.github.acnaweb.study_apir.model.Pedidos;

public class PedidoRequestCreate {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pedidos toModel() {
        Pedidos pedidos = new Pedidos();
        pedidos.setStatus(this.getStatus());
        return pedidos;
    }
}
