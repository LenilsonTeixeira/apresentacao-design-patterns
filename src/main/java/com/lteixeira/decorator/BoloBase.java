package com.lteixeira.decorator;

import java.math.BigDecimal;

public class BoloBase extends Bolo {


    @Override
    public String getComposicao() {
        return "";
    }

    @Override
    public BigDecimal getValor() {
        return BigDecimal.ZERO;
    }
}