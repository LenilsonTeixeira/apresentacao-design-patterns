package com.lteixeira.decorator.enumeration;

import java.math.BigDecimal;

public enum Recheio {
    BRIGADEIRO("Recheio de Brigadeiro", new BigDecimal("1")),
    NINHO("Recheio de Ninho", new BigDecimal("3"));

    private String descricao;
    private BigDecimal valor;

    Recheio(String descricao, BigDecimal valor) {
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
