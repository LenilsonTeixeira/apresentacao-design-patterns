package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Cobertura;

import java.math.BigDecimal;

public class CoberturaDeChantilly extends CoberturaDecorator {

    public CoberturaDeChantilly(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Cobertura.CHANTILLY.getDescricao() + " | ";
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Cobertura.CHANTILLY.getValor());
    }
}