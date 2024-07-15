package main.java.com.advocacia.modelos;

import java.time.LocalDate;

public class Documento {
    private String titulo;
    private String descricao;
    private LocalDate data_Criacao;
    private Advogado advogado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_Criacao() {
        return data_Criacao;
    }

    public void setData_Criacao(LocalDate data_Criacao) {
        this.data_Criacao = data_Criacao;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }
}
