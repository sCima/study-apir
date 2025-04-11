package com.github.acnaweb.study_apir.dto.pedido;

import java.util.List;

import com.github.acnaweb.study_apir.dto.item.ItemResponse;

public class PedidoResponse {
    private Long id;
    private String status;
    private List<ItemResponse> items;
    
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

    public List<ItemResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemResponse> items) {
        this.items = items;
    }
}
