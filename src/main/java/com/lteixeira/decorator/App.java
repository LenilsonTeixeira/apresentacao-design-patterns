package com.lteixeira.decorator;

import com.lteixeira.decorator.enumeration.Cobertura;
import com.lteixeira.decorator.enumeration.Formato;
import com.lteixeira.decorator.enumeration.Recheio;

public class App {
    public static void main(String[] args) {
        System.out.println("Tabela de valores");

        System.out.println("Coberturas");
        System.out.println(Cobertura.FRUTAS.getDescricao() + " - "+  " R$ " + Cobertura.FRUTAS.getValor());
        System.out.println(Cobertura.CHANTILLY.getDescricao() + " - "+  " R$ " + Cobertura.CHANTILLY.getValor());

        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Formatos");
        System.out.println(Formato.QUADRADO.getDescricao() + " - "+  " R$ " + Formato.QUADRADO.getValor());
        System.out.println(Formato.REDONDO.getDescricao() + " - "+  " R$ " + Formato.REDONDO.getValor());

        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Recheios");
        System.out.println(Recheio.NINHO.getDescricao() + " - "+  " R$ " + Recheio.NINHO.getValor());
        System.out.println(Recheio.BRIGADEIRO.getDescricao() + " - "+  " R$ " + Recheio.BRIGADEIRO.getValor());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        BoloBase boloBase = new BoloBase();
        Bolo b1 = new RecheioDeBrigradeiro(new CoberturaDeFrutas(new FormatoQuadrado(boloBase)));

        System.out.println("Composição: "+ b1.getComposicao());
        System.out.println("Valor: "+ b1.getValor());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        Bolo b2 = new RecheioDeNinho(new CoberturaDeChantilly(new FormatoRedondo(boloBase)));
        System.out.println("Composição: "+ b2.getComposicao());
        System.out.println("Valor: "+ b2.getValor());


    }
}
