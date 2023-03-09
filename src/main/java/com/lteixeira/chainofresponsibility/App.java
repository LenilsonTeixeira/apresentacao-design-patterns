package com.lteixeira.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER= LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        PassoConsultandoApiDePreAnalise passoConsultandoApiDePreAnalise = new PassoConsultandoApiDePreAnalise();
        PassoObterInformacoesDoCliente passoObterInformacoesDoCliente = new PassoObterInformacoesDoCliente(passoConsultandoApiDePreAnalise);
        PassoConsultarScoreSerasa passoConsultarScoreSerasa = new PassoConsultarScoreSerasa(passoObterInformacoesDoCliente);
        PassoConsultarReceitaFederal passoConsultarReceitaFederal = new PassoConsultarReceitaFederal(passoConsultarScoreSerasa);

        ProcessaPreAnalise processaPreAnalise = new ProcessaPreAnalise(passoConsultarReceitaFederal);

        ResultadoProposta resultadoProposta = processaPreAnalise.executar("09802929920");

        LOGGER.info("Resultado da Pré-Análise: {}", resultadoProposta);

    }
}
