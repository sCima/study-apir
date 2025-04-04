package com.github.acnaweb.study_apir.dto;

import com.github.acnaweb.study_apir.model.Product;

import java.math.BigDecimal;

public class ProductRequestCreate {
    private String nome;


    public Product toModel() {
        final BigDecimal VALOR_PADRAO
                = new BigDecimal(2000);
        Product product = new Product();
        product.setNome(this.getNome());
        product.setValor(VALOR_PADRAO);
        return product;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
