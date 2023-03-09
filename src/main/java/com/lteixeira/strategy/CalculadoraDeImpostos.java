package com.lteixeira.strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal realizarCalculo(Orcamento orcamento, Imposto imposto) {
        return imposto.calcularImposto(orcamento);
    }
}
