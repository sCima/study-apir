package com.github.acnaweb.study_apir.service;

import com.github.acnaweb.study_apir.modelo.Produto;

import java.util.List;

public class ProductService {

    List<Produto> products = new List<Produto>();

    public void createProduct(int id, String nome) {
        Produto produto = new Produto(id, nome);
    };

    public void getProductById(Produto produto) {

    }

    public void updateProduct(Produto produto) {

    }

    public void deleteProduct(Produto produto) {

    }
}
