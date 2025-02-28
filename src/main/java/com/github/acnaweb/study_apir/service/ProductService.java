package com.github.acnaweb.study_apir.service;

import com.github.acnaweb.study_apir.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Produto> products = new ArrayList<Produto>();

    public Produto createProduct(Produto produto) {
        products.add(produto);
        return null;
    };

    public Produto getProductById(int id) {
        Produto produto = new Produto(id);
        for (Produto product : products) {
            if (product.getId() == id) {
                products.remove(produto);
            }
        }
        return produto;
    }

    public Produto updateProduct(int id, String nome) {
        Produto produto = new Produto(id, nome);
        for (Produto product : products) {
            if (product.getId() == id) {
                products.remove(produto);
                products.add(produto);
            }
        }
        return produto;
    }

    public void deleteProduct(int id) {
        Produto produto = new Produto(id);
        for (Produto product : products) {
            if (product.getId() == id) {
                products.remove(produto);
            }
        }
    }
}
