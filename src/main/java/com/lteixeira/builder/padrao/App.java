package com.lteixeira.builder.padrao;

public class App {

    public static void main(String[] args) {
        Endereco endereco = new Endereco.Builder()
                .cep("10000000")
                .logradouro("Avenida dos Estudantes")
                .numero("100")
                .bairro("Centro")
                .complemento("Ao lado da Praça Capital")
                .cidade("Campinas")
                .estado("São Paulo")
                .build();

        Comprador comprador1 = new Comprador.Builder()
                .nome("Guilherme")
                .cpf("000.000.000-00")
                .rg("11.111.111")
                .email("guilherme@email.com")
                .telefone("(19)99999-9999")
                .dataNascimento("16/01/2012")
                .endereco(endereco)
                .build();


        System.out.println(comprador1);

        System.out.println("--------------------------------------------------------------------------");

        Comprador comprador2 = new Comprador.Builder()
                .nome("Eder")
                .build();

        System.out.println(comprador2);

        System.out.println("--------------------------------------------------------------------------");

        Comprador comprador3 = new Comprador.Builder()
                .nome("Jessica")
                .cpf("88.888.888-88")
                .build();

        System.out.println(comprador3);

        System.out.println("--------------------------------------------------------------------------");

        Comprador comprador4 = new Comprador.Builder()
                .nome("Lilian")
                .rg("55.555.555-5")
                .build();

        System.out.println(comprador4);

    }
}
