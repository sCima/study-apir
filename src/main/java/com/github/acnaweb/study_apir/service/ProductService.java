package com.github.acnaweb.study_apir.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    private Long sequence = 1L;

    public Product createProduct(Product product) {
        product.setId(sequence++);
        products.add(product);
        return product;
    }
    public Product getProductById(Long id) {
        return null;
    }
    public Optional<Product> updateProduct(Long id, Product product) {
        
        Optional<Product> opt = products.stream()
                .filter(e -> e.getId().equals(id)).findFirst();
        if (opt.isPresent()) {
            Product retorno = opt.get();
            retorno.setNome(product.getNome());
            return retorno;
        }

        return null;
    }
    public void deleteProduct(Long id) {

    }
}
