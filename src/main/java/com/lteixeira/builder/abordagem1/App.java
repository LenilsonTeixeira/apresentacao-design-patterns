package com.lteixeira.builder.abordagem1;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Comprador comprador = new Comprador();
        comprador.setNome("Guilherme");
        comprador.setCpf("000.000.000-00");
        comprador.setRg("11.111.111");
        comprador.setEmail("guilherme@email.com");
        comprador.setDataNascimento(LocalDate.of(2012, 1, 16));
        comprador.setTelefone("(19)99999-9999");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Avenida dos Estudantes");
        endereco.setBairro("Centro");
        endereco.setCep("10000000");
        endereco.setNumero("100");
        endereco.setCidade("Campinas");
        endereco.setEstado("São Paulo");
        endereco.setComplemento("Ao lado da Praça Capital");
        comprador.setEndereco(endereco);

        System.out.println(comprador);

        /**
         *  Problemas apresentados com essa abordagem
         *
         *  - Construção trabalhosa
         *  - As instâncias podem ter seu estado alterado
         *
         * */

    }
}
