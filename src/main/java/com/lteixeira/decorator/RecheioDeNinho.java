package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Recheio;

import java.math.BigDecimal;

public class RecheioDeNinho extends RecheioDecorator {
    public RecheioDeNinho(Bolo bolo) {
        super(bolo);
    }

    @Override
    public BigDecimal getValor() {
        return bolo.getValor().add(Recheio.NINHO.getValor());
    }

    @Override
    public String getComposicao() {
        return bolo.getComposicao() + " | " + Recheio.NINHO.getDescricao() + " | ";
    }
}
