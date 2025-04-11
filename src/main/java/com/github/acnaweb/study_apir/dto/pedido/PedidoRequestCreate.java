package com.github.acnaweb.study_apir.dto.pedido;

import java.util.List;

import com.github.acnaweb.study_apir.dto.item.ItemRequestCreate;

public class PedidoRequestCreate {    
    
    private List<ItemRequestCreate> items;
   
    public List<ItemRequestCreate> getItems() {
        return items;
    }

    public void setItems(List<ItemRequestCreate> items) {
        this.items = items;
    }

}
