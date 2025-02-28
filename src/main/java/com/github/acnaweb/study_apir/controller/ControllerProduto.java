package com.github.acnaweb.study_apir.controller;

import com.github.acnaweb.study_apir.modelo.Produto;
import com.github.acnaweb.study_apir.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> create(Produto produto) {
        productService.createProduct(produto);
        return ResponseEntity.status(201).body("Produto cadastrado");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(int id) {
        productService.deleteProduct(id);
        return ResponseEntity.status(204).build();

    }

    @PutMapping
    public ResponseEntity<String> update(int id, String nome) {
        productService.updateProduct(id, nome);
        return ResponseEntity.status(200).body("Produto atualizado");        
    }

    @GetMapping
    public ResponseEntity<String> find(int id) {
        productService.getProductById(id);
        return ResponseEntity.status(200).body("Maça");        

    }
}
