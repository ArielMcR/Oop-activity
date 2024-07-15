package main.java.com.loja.modelos;

import java.util.List;

import main.java.com.rede_social.modelos.Usuario;

public class Grupo {
    private String nome;
    private String descricao;
    private List<Usuario> membros;

    // Getters e Setters
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

    public List<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(List<Usuario> membros) {
        this.membros = membros;
    }

}
