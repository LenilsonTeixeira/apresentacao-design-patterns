package com.lteixeira.factorymethod.padrao;

public class IphoneX implements Iphone {

    @Override
    public void obterEspecificacoes() {
        System.out.println("Obtendo especificação do IphoneX");
    }
}
