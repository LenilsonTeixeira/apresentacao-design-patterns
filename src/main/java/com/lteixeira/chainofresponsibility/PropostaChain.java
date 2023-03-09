package com.lteixeira.chainofresponsibility;

public interface PropostaChain {

    ResultadoProposta executar(String cpf);
    PropostaChain proximo();

    default ResultadoProposta resultado(String cpf, String numeroProposta, StatusProposta status) {
        return new ResultadoProposta(cpf, numeroProposta, status);
    }

}
