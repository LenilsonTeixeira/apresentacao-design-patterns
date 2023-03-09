package com.lteixeira.decorator.enumeration;

import java.math.BigDecimal;

public enum Formato {
    QUADRADO("Forma Quadrada", new BigDecimal("1")),
    REDONDO("Forma Redonda", new BigDecimal("2"));
    private String descricao;
    private BigDecimal valor;

    Formato(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
