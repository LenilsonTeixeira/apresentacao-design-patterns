package com.lteixeira.builder.abordagem2;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Comprador comprador1 = new Comprador(
                "Guilherme",
                "000.000.000-00",
                "11.111.111",
                "(19)99999-9999",
                "guilherme@email.com",
                LocalDate.of(2012, 1, 16),
                new Endereco("10000000",
                        "Avenida dos Estudantes",
                        "100",
                        "Centro",
                        "Ao lado da Praça Capital",
                        "Campinas",
                        "São Paulo")
                );

        System.out.println(comprador1);

        System.out.println("--------------------------------------------------------------------------");

        Comprador comprador2 = new Comprador("Amanda", "111.111.111-00", "22.222.222-2");

        System.out.println(comprador2);

        System.out.println("--------------------------------------------------------------------------");

        Comprador comprador3 = new Comprador("Paulo");

        System.out.println(comprador3);

        System.out.println("--------------------------------------------------------------------------");



        /**
         *  Problemas apresentados com essa abordagem
         *
         *  - Número excessivo de argumentos via construtor,
         *  - Legibilidade
         *  - Extensibilidade limitada por conta de que não é possível criar multiplos construtores com
         *    a mesma assinatura. Exemplo: Não é possível criar um novo construtor para
         *    cadastrar somente o CPF de um comprador.
         *
         * */
    }
}
