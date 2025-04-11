package com.github.acnaweb.study_apir.service;

import com.github.acnaweb.study_apir.dto.pedido.PedidoRequestCreate;
import com.github.acnaweb.study_apir.dto.pedido.PedidoRequestUpdate;
import com.github.acnaweb.study_apir.model.Pedidos;
import com.github.acnaweb.study_apir.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public Pedidos createPedido(PedidoRequestCreate dto) {
        return pedidosRepository.save(dto.toModel());
    }

    public boolean deletePedido(Long id) {
        if (pedidosRepository.existsById(id)) {
            pedidosRepository.deleteById(id);
            return true;
        } else return false;
    }

    public Optional<Pedidos> updatePedido(Long id, PedidoRequestUpdate dto) {
        return pedidosRepository.findById(id)
                .map(p -> pedidosRepository.save(dto.toModel(p)));
    }

    public Optional<Pedidos> getPedidoById(Long id) {
        return pedidosRepository.findById(id);
    }

    public List<Pedidos> getAll() {
        return pedidosRepository.findAll();
    }
}
