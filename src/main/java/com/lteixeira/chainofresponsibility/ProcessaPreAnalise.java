package com.lteixeira.chainofresponsibility;


public class ProcessaPreAnalise {

    private PassoConsultarReceitaFederal passoConsultarReceitaFederal;

    public ProcessaPreAnalise(PassoConsultarReceitaFederal passoConsultarReceitaFederal) {
        this.passoConsultarReceitaFederal = passoConsultarReceitaFederal;
    }

    public ResultadoProposta executar(String cpf) {
        return this.passoConsultarReceitaFederal.executar(cpf);
    }
}
