package com.lteixeira.decorator;

abstract class RecheioDecorator extends Bolo {

    protected Bolo bolo;

    public RecheioDecorator(Bolo bolo) {
        this.bolo = bolo;
    }
}
