package org.com.matheus;

import org.com.matheus.Cargos.Arquivista;
import org.com.matheus.Cargos.Bibliotecaria;

public class Main {
    public static void main(String[] args){
        Bibliotecaria Beatriz = new Bibliotecaria();
        Beatriz.setMatricula("123456");
        Beatriz.setNome("Beatriz Cristina da Silva");
        Beatriz.setEmail("beatrizcristinadasilva@gmail.com");
        Beatriz.setSalario("1500");
        Beatriz.setTurno("Noite");
        Beatriz.setRamal(1515);
        Beatriz.ImpressaoBibliotecaria();
        System.out.println("====================================");
        Arquivista Maria = new Arquivista();
        Maria.setMatricula("123465");
        Maria.setNome("Catarina Cavalheiro");
        Maria.setEmail("catarinacavalheiro@gmail.com");
        Maria.setSalario("1500");
        Maria.setTurno("Noite");
        Maria.setRamal(1514);
        Maria.ImpressaoArquivista();

    }
}