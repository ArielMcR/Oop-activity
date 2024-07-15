package main.java.com.rede_social.modelos;

import java.time.LocalDateTime;

public class Postagem {
    private String conteudo;
    private LocalDateTime data_Hora = LocalDateTime.now();
    private Usuario autor;
    private int curtidas;

    // Getters e Setters
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataHora() {
        return data_Hora;
    }

    public void setDataHora(LocalDateTime data_Hora) {
        this.data_Hora = data_Hora;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}
