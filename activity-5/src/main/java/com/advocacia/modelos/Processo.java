package main.java.com.advocacia.modelos;

import java.time.LocalDate;

public class Processo {

    private String numero_Processo;
    private String descricao;
    private LocalDate data_abertura;
    private LocalDate data_fechamento;
    private Cliente cliente;
    private Advogado advogado;

    public String getNumero_Processo() {
        return numero_Processo;
    }

    public void setNumero_Processo(String numero_Processo) {
        this.numero_Processo = numero_Processo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(LocalDate data_abertura) {
        this.data_abertura = data_abertura;
    }

    public LocalDate getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(LocalDate data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

}
