package org.com.matheus.Geral;

import java.util.Date;

public abstract class Pessoa {
    private String Nome;
    private String Endereco;
    private Integer Casa;
    private String Complemento;
    private Date DataNascimento;
    private String CPF;
    private String RG;
    private String TituloEleitor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public Integer getCasa() {
        return Casa;
    }

    public void setCasa(Integer casa) {
        Casa = casa;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTituloEleitor() {
        return TituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        TituloEleitor = tituloEleitor;
    }
}
