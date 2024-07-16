package main.java.com.alienigena.modelos;

import java.util.List;

public class Hotel {
    private String nome;
    private String descricao;
    private String local;
    private List<Turista> turista;

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Turista> getTurista() {
        return turista;
    }

    public void setTurista(List<Turista> turista) {
        this.turista = turista;
    }
}
