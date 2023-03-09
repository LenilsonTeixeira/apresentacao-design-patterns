package com.lteixeira.decorator;

abstract class CoberturaDecorator extends Bolo {
    protected Bolo bolo;

    public CoberturaDecorator(Bolo bolo) {
        this.bolo = bolo;
    }
}
