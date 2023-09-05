package org.com.matheus.Cargos;

import org.com.matheus.Geral.Pessoa;

public class Arquivista extends Pessoa {

    private String Matricula;
    private String Setor;
    private String Salario;
    private Integer Ramal;
    private String Turno;
    private String Email;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }

    public Integer getRamal() {
        return Ramal;
    }

    public void setRamal(Integer ramal) {
        Ramal = ramal;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void ImpressaoArquivista(){
        System.out.println(
                "Matrícula: " + getMatricula() + " \n" +
                        "Nome: " + getNome() + " \n" +
                        "Data Nascimento: " + getDataNascimento() + " \n" +
                        "Email: " + getEmail() + " \n" +
                        "Salário: " + getSalario() + " \n" +
                        "Turno: " + getTurno() + " \n" +
                        "Ramal: " + getRamal() + " \n"
        );
    }
}
