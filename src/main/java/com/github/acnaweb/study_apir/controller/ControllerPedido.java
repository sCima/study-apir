package com.github.acnaweb.study_apir.controller;

import java.util.List;

import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.acnaweb.study_apir.dto.pedido.PedidoRequestCreate;
import com.github.acnaweb.study_apir.dto.pedido.PedidoResponse;

@RestController
@RequestMapping("pedidos")
public class ControllerPedido {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoResponse> create(
                                @RequestBody PedidoRequestCreate dto) {                                            
        Pedido pedido = pedidoService.create(dto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<PedidoResponse> findById(@PathVariable Long id){
	    return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<PedidoResponse>> listAll(){
	    return ResponseEntity.noContent().build();
    }
}
