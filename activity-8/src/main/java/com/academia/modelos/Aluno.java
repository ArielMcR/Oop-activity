package main.java.com.academia.modelos;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private PlanoAssinatura planoAssinatura;
    private LocalDate dataDeInscrição = LocalDate.now();
    private LocalDate dataVencimento = LocalDate.now().plusMonths(3);
    private String status;

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public LocalDate getDataDeInscrição() {
        return dataDeInscrição;
    }

    public void setDataDeInscrição(LocalDate dataDeInscrição) {
        this.dataDeInscrição = dataDeInscrição;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
