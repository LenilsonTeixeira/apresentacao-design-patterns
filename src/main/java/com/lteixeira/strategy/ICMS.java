package com.lteixeira.strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
