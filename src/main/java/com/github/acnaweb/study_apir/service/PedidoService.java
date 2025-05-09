package com.github.acnaweb.study_apir.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.dto.pedido.PedidoRequestCreate;
import com.github.acnaweb.study_apir.dto.pedido.PedidoRequestUpdate;
import com.github.acnaweb.study_apir.model.Item;
import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.model.Produto;
import com.github.acnaweb.study_apir.repository.ItemRepository;
import com.github.acnaweb.study_apir.repository.PedidoRepository;
import com.github.acnaweb.study_apir.repository.ProdutoRepository;

@Service
public class PedidoService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido create(PedidoRequestCreate dto) {
        Pedido pedido = new Pedido();
        pedido.setStatus("Aberto");
        List<Item> itens = dto.getItems().stream()
                .map(i -> {
                    Item item = new Item();
                    Produto produto = produtoRepository.findById(i.getProduto_id())
                            .orElseThrow(() -> new RuntimeException(
                                    "Produto inexistente: " + i.getProduto_id())
                            );
                    item.setProduto(produto);
                    item.setValor(i.getValor());
                    item.setQuantidade(i.getQuantidade());
                    item.setPedido(pedido);
                    return item;
                })
                .collect(Collectors.toList());

        pedido.setItems(itens);
        return pedidoRepository.save(pedido);
    }

    //     Pedido pedido = dto.toModel();

    //     List<Item> items = dto.getItems().stream()
    //         .map(i -> {
    //              Produto produto = produtoRepository.findById(i.getProdutoId())
    //                  .orElseThrow(() -> new RuntimeException("Produtonão encontrado"));
    //             return i.toModel(pedido, produto);                
    //         })
    //         .collect(Collectors.toList());

    //     pedido.setItems(items);

    //     return pedidoRepository.save(pedido);
    // }
    // public boolean delete(Long id) {
    //     return false;
    // }
    // public Optional<Pedido> update(Long id, PedidoRequestUpdate dto) {
    //     return pedidoRepository.findById(id)
    //         .map(p -> pedidoRepository.save(p));

    // }
    // public Optional<Pedido> getById(Long id) {
    //     return pedidoRepository.findById(id);
    // }

    // public List<Pedido> getAll() {
    //     return pedidoRepository.findAll();
    // }    
}
