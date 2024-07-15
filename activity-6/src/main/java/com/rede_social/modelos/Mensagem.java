package main.java.com.rede_social.modelos;

import java.time.LocalDateTime;

/**
 * Mensagem
 */
public class Mensagem {
    private String conteudo;
    private LocalDateTime dataHora = LocalDateTime.now();
    private Usuario remetente;
    private Usuario destinatario;

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

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
}