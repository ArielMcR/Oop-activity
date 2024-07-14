package main.java.com.hotel.modelos;

import java.time.LocalDate;

public class Reserva_quarto {
    private Quarto quarto;
    private Hospede hospede;
    private LocalDate dataReservaEntrada;
    private LocalDate dataReservaSaida;

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public LocalDate getDataReservaEntrada() {
        return dataReservaEntrada;
    }

    public void setDataReservaEntrada(LocalDate dataReservaEntrada) {
        this.dataReservaEntrada = dataReservaEntrada;
    }

    public LocalDate getDataReservaSaida() {
        return dataReservaSaida;
    }

    public void setDataReservaSaida(LocalDate dataReservaSaida) {
        this.dataReservaSaida = dataReservaSaida;
    }

    public float adicionarServico(Servico servico) {
        float valor_atualizado = quarto.getPrecoQuarto() + servico.getValor();
        return valor_atualizado;
    }
}
