package main.java.com.arvore.modelos;

import java.time.LocalDateTime;

public class Evento {
    private String nome;
    private String descricao;
    private LocalDateTime data_evento;
    private String local;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDateTime data_evento) {
        this.data_evento = data_evento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
