package main.java.com.hospital.modelos;

import java.time.LocalDateTime;

public class Agendar_exame {
    private Exame exame;
    private String descricao;
    private LocalDateTime data_e_hora;
    private String local;
    private Paciente paciente;
    private Medico medico;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_e_hora() {
        return data_e_hora;
    }

    public void setData_e_hora(LocalDateTime data_e_hora) {
        this.data_e_hora = data_e_hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
}
