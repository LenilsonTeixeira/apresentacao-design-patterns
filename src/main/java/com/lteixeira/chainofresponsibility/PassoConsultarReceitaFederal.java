package com.lteixeira.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassoConsultarReceitaFederal implements PropostaChain {

    private static final Logger LOGGER= LoggerFactory.getLogger(PassoConsultarReceitaFederal.class);
    private PassoConsultarScoreSerasa passoConsultarScoreSerasa;

    public PassoConsultarReceitaFederal(PassoConsultarScoreSerasa passoConsultarScoreSerasa) {
        this.passoConsultarScoreSerasa = passoConsultarScoreSerasa;
    }

    @Override
    public ResultadoProposta executar(String cpf) {
        LOGGER.info("Realizando consulta na Receita Federal");
        return proximo().executar(cpf);
    }

    @Override
    public PropostaChain proximo() {
        return this.passoConsultarScoreSerasa;
    }
}
