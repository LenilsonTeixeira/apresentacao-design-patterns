package com.lteixeira.factorymethod.padrao;

public class IphoneXSMax implements Iphone {

    @Override
    public void obterEspecificacoes() {
        System.out.println("Obtendo especificação do IphoneXSMax");
    }
}
