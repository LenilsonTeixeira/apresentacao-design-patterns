package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Cobertura;

import java.math.BigDecimal;

public class CoberturaDeFrutas extends CoberturaDecorator {

    public CoberturaDeFrutas(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Cobertura.FRUTAS.getDescricao() + " | ";
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Cobertura.FRUTAS.getValor());
    }

}
