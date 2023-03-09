package com.lteixeira.decorator;

abstract class FormatoBoloDecorator extends Bolo {
    protected Bolo bolo;

    public FormatoBoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }
}
