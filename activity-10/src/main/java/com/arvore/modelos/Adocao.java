package main.java.com.arvore.modelos;

import java.time.LocalDate;

public class Adocao {
    private Pessoa usuario;
    private Arvore arvore;
    private LocalDate data_adocao;

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

    public LocalDate getData_adocao() {
        return data_adocao;
    }

    public void setData_adocao(LocalDate data_adocao) {
        this.data_adocao = data_adocao;
    }

}
