package org.com.matheus.Geral;

import java.util.Date;

public class Impresso {

    private String Titulo;
    private String Subtitulo;
    private String Genero;
    private String Autor;
    private String Idioma;
    private Integer ISBN10;
    private Integer ISBN13;
    private Float altura;
    private Float largura;
    private Date Lancamento;
    private Integer Paginas;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }

    public Integer getISBN10() {
        return ISBN10;
    }

    public void setISBN10(Integer ISBN10) {
        this.ISBN10 = ISBN10;
    }

    public Integer getISBN13() {
        return ISBN13;
    }

    public void setISBN13(Integer ISBN13) {
        this.ISBN13 = ISBN13;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Date getLancamento() {
        return Lancamento;
    }

    public void setLancamento(Date lancamento) {
        Lancamento = lancamento;
    }

    public Integer getPaginas() {
        return Paginas;
    }

    public void setPaginas(Integer paginas) {
        Paginas = paginas;
    }
}
