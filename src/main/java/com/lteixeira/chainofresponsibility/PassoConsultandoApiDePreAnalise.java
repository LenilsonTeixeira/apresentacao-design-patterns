package com.lteixeira.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PassoConsultandoApiDePreAnalise implements PropostaChain {

    private static final Logger LOGGER= LoggerFactory.getLogger(PassoConsultandoApiDePreAnalise.class);

    @Override
    public ResultadoProposta executar(String cpf) {
        LOGGER.info("Consultando API de prè-análise");
        return resultado(cpf, "1222112", StatusProposta.APROVADA);
    }

    @Override
    public PropostaChain proximo() {
        throw  new UnsupportedOperationException("Final da cadeia de proposta");
    }
}
