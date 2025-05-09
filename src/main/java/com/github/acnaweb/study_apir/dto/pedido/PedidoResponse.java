package com.github.acnaweb.study_apir.dto.pedido;

import java.util.List;
import java.util.stream.Collectors;

import com.github.acnaweb.study_apir.dto.item.ItemResponse;
import com.github.acnaweb.study_apir.model.Pedido;

public class PedidoResponse {
    private Long id;
    private String status;
    private List<ItemResponse> items;

    public PedidoResponse toDto(Pedido pedido) {
        this.setId(pedido.getId());
        this.setStatus(pedido.getStatus());
        List<ItemResponse> itensResponse = pedido.getItems()
                .stream().map(i -> new ItemResponse().toDto(i)).toList();
        this.setItems(itensResponse);
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

    public List<ItemResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemResponse> items) {
        this.items = items;
    }
}
