package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Recheio;

import java.math.BigDecimal;

public class RecheioDeBrigradeiro extends RecheioDecorator {
    public RecheioDeBrigradeiro(Bolo bolo) {
        super(bolo);
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Recheio.BRIGADEIRO.getDescricao() + " | ";
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Recheio.BRIGADEIRO.getValor());
    }

}
