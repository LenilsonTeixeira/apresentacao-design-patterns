package com.lteixeira.strategy;

import java.math.BigDecimal;

public class ISS implements Imposto {
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
