package com.lteixeira.factorymethod.padrao;

public class Produto {

    private Iphone iphone;

    public Produto(Iphone iphone) {
        this.iphone = iphone;
    }

    public Iphone getIphone() {
        return iphone;
    }
}
