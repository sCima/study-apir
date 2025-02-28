package com.github.acnaweb.study_apir.service;

import com.github.acnaweb.study_apir.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Produto> products = new ArrayList<Produto>();

    public void createProduct(int id, String nome) {
        Produto produto = new Produto(id, nome);
        products.add(produto);
    };

    public void getProductById(int id) {
        Produto produto = new Produto(id);
        for (Produto product : products) {
            if (product.getId() == id) {
                products.remove(produto);
            }
        }

    }

    public void updateProduct(int id, String nome) {
        Produto produto = new Produto(id, nome);
        for (Produto product : products) {
            if (product.getId() == id) {
                products.remove(produto);
                products.add(produto);
            }
        }
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
