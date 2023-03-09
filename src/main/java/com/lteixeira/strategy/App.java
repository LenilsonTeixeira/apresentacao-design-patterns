package com.lteixeira.strategy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        Orcamento orcamento = new Orcamento();
        orcamento.setValor(new BigDecimal(500));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("O resultado do calculo de ICMS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, icms));
        System.out.println("O resultado do calculo do ISS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, iss));
    }
}
