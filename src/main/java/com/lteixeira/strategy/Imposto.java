package com.lteixeira.strategy;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcularImposto(Orcamento orcamento);
}
