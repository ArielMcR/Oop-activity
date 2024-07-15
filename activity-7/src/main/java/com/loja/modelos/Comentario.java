package main.java.com.loja.modelos;

import java.time.LocalDateTime;

import main.java.com.rede_social.modelos.Usuario;

public class Comentario {
    private String conteudo;
    private LocalDateTime dataHora;
    private Usuario autor;

    // Getters e Setters
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
}
