package com.lteixeira.factorymethod.abordagem1;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();

        Iphone iphone = produto.consultarManual(IphoneType.XS_MAX);

        iphone.obterEspecificacoes();
    }
}
