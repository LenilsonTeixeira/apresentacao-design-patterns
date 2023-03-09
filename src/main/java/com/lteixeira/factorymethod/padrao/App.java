package com.lteixeira.factorymethod.padrao;

public class App {
    public static void main(String[] args) {

        Iphone iphoneX = IphoneFactory.obterIphone(IphoneType.X);

        iphoneX.obterEspecificacoes();

        Produto produto = new Produto(iphoneX);

        produto.getIphone().obterEspecificacoes();

    }
}
