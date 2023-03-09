package com.lteixeira.chainofresponsibility;

public class ResultadoProposta {

    private String cpf;
    private String numeroProposta;
    private StatusProposta status;

    public ResultadoProposta(String cpf) {
        this.cpf = cpf;
    }

    public ResultadoProposta(String cpf, String numeroProposta) {
        this.cpf = cpf;
        this.numeroProposta = numeroProposta;
    }

    public ResultadoProposta(String cpf, String numeroProposta, StatusProposta status) {
        this.cpf = cpf;
        this.numeroProposta = numeroProposta;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroProposta() {
        return numeroProposta;
    }

    public void setNumeroProposta(String numeroProposta) {
        this.numeroProposta = numeroProposta;
    }

    public StatusProposta getStatus() {
        return status;
    }

    public void setStatus(StatusProposta status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultadoProposta{" +
                "cpf='" + cpf + '\'' +
                ", numeroProposta='" + numeroProposta + '\'' +
                ", status=" + status +
                '}';
    }
}
