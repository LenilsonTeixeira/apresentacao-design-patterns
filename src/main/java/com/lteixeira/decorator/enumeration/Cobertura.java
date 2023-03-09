package com.lteixeira.decorator.enumeration;

import java.math.BigDecimal;

public enum Cobertura {
    CHANTILLY("Cobertura de Chantilly", new BigDecimal("3")),
    FRUTAS("Cobertura de Frutas Picadas", new BigDecimal("2"));

    private String descricao;
    private BigDecimal valor;

    Cobertura(String descricao, BigDecimal valor) {
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
