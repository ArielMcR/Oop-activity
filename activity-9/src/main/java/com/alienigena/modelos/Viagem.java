package main.java.com.alienigena.modelos;

import java.time.LocalDateTime;

public class Viagem {
    private LocalDateTime data_saida;
    private LocalDateTime data_chegada;
    private Turista turista;

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public LocalDateTime getData_saida() {
        return data_saida;
    }

    public void setData_saida(LocalDateTime data_saida) {
        this.data_saida = data_saida;
    }

    public LocalDateTime getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(LocalDateTime data_chegada) {
        this.data_chegada = data_chegada;
    }

}
