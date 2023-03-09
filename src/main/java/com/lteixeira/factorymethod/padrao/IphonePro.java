package com.lteixeira.factorymethod.padrao;

public class IphonePro implements Iphone {

    @Override
    public void obterEspecificacoes() {
        System.out.println("Obtendo especificação do Iphone Pro");
    }
}
