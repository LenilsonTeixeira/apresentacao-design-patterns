package com.lteixeira.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassoConsultarScoreSerasa implements PropostaChain {

    private static final Logger LOGGER= LoggerFactory.getLogger(PassoConsultarScoreSerasa.class);

    private PassoObterInformacoesDoCliente passoObterInformacoesDoCliente;

    public PassoConsultarScoreSerasa(PassoObterInformacoesDoCliente passoObterInformacoesDoCliente) {
        this.passoObterInformacoesDoCliente = passoObterInformacoesDoCliente;
    }

    @Override
    public ResultadoProposta executar(String cpf) {
        LOGGER.info("Realizando consulta de Score no Serasa");

        return proximo().executar(cpf);
    }

    @Override
    public PropostaChain proximo() {
        return this.passoObterInformacoesDoCliente;
    }
}
