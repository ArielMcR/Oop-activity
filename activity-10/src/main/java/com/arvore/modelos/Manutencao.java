package main.java.com.arvore.modelos;

import java.time.LocalDate;

public class Manutencao {
    private Pessoa usuario;
    private Arvore arvore;
    private String tipo_manutencao;
    private LocalDate data_manutencao;

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Arvore getArvore() {
        return arvore;
    }

    public void setArvore(Arvore arvore) {
        this.arvore = arvore;
    }

    public String getTipo_manutencao() {
        return tipo_manutencao;
    }

    public void setTipo_manutencao(String tipo_manutencao) {
        this.tipo_manutencao = tipo_manutencao;
    }

    public LocalDate getData_manutencao() {
        return data_manutencao;
    }

    public void setData_manutencao(LocalDate data_manutencao) {
        this.data_manutencao = data_manutencao;
    }
}
