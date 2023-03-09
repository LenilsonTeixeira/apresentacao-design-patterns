package com.lteixeira.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassoObterInformacoesDoCliente implements PropostaChain {

    private static final Logger LOGGER= LoggerFactory.getLogger(PassoObterInformacoesDoCliente.class);

    private PassoConsultandoApiDePreAnalise passoConsultandoApiDePreAnalise;

    public PassoObterInformacoesDoCliente(PassoConsultandoApiDePreAnalise passoConsultandoApiDePreAnalise) {
        this.passoConsultandoApiDePreAnalise = passoConsultandoApiDePreAnalise;
    }

    @Override
    public ResultadoProposta executar(String cpf) {
        LOGGER.info("Realizando consulta de informações do cliente");
        return proximo().executar(cpf);
    }

    @Override
    public PropostaChain proximo() {
        return this.passoConsultandoApiDePreAnalise;
    }
}
