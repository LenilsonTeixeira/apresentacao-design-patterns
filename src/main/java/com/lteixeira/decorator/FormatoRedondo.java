package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Formato;

import java.math.BigDecimal;

public class FormatoRedondo extends FormatoBoloDecorator {
    public FormatoRedondo(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Formato.REDONDO.getDescricao() + " | ";
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Formato.REDONDO.getValor());
    }

}