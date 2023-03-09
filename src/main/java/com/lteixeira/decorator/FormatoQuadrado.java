package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Formato;

import java.math.BigDecimal;

public class FormatoQuadrado extends FormatoBoloDecorator {
    public FormatoQuadrado(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Formato.QUADRADO.getDescricao() + " | ";
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Formato.QUADRADO.getValor());
    }

}
