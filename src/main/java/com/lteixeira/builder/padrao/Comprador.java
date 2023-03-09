package com.lteixeira.builder.padrao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Comprador {
    private final String nome;
    private final String cpf;
    private final String rg;
    private final String telefone;
    private final String email;
    private final LocalDate dataNascimento;
    private final Endereco endereco;

    Comprador(String nome, String cpf, String rg, String telefone, String email, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                '}';
    }

    public static class Builder {
        private String nome;
        private String cpf;
        private String rg;
        private String telefone;
        private String email;
        private LocalDate dataNascimento;
        private Endereco endereco;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder rg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dataNascimento(String dataNascimento) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
            return this;
        }

        public Builder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Comprador build() {
            return new Comprador(nome, cpf, rg, telefone, email, dataNascimento, endereco);
        }
    }
}
