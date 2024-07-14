package main.java.com.voos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Voo {
    private String codigo_do_Voo;
    private String companhia_aerea;
    private LocalDateTime hora_de_partida;
    private LocalDateTime hora_de_chegada;
    private Float preco_passagem;
    private String cidade_saida;
    private String cidade_chegada;

    public String getCodigo_do_Voo() {
        return codigo_do_Voo;
    }

    public void setCodigo_do_Voo(String codigo_do_Voo) {
        this.codigo_do_Voo = codigo_do_Voo;
    }

    public String getCompanhia_aerea() {
        return companhia_aerea;
    }

    public void setCompanhia_aerea(String companhia_aerea) {
        this.companhia_aerea = companhia_aerea;
    }

    public LocalDateTime getHora_de_partida() {
        return hora_de_partida;
    }

    public void setHora_de_partida(LocalDateTime hora_de_partida) {
        this.hora_de_partida = hora_de_partida;
    }

    public LocalDateTime getHora_de_chegada() {
        return hora_de_chegada;
    }

    public void setHora_de_chegada(LocalDateTime hora_de_chegada) {
        this.hora_de_chegada = hora_de_chegada;
    }

    public Float getPreco_passagem() {
        return preco_passagem;
    }

    public void setPreco_passagem(Float preco_passagem) {
        this.preco_passagem = preco_passagem;
    }

    public String getCidade_saida() {
        return cidade_saida;
    }

    public void setCidade_saida(String cidade_saida) {
        this.cidade_saida = cidade_saida;
    }

    public String getCidade_chegada() {
        return cidade_chegada;
    }

    public void setCidade_chegada(String cidade_chegada) {
        this.cidade_chegada = cidade_chegada;
    }

}
