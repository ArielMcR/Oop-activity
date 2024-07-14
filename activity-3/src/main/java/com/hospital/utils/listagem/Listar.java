package main.java.com.hospital.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

public class Listar {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void listarPaciente() {

        if (App.pacientes.isEmpty()) {
            System.out.println("Não há pacientes cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Pacientes cadastrados -----------|\n");
        for (int i = 0; i < App.pacientes.size(); i++) {
            Paciente pacienteAtual = App.pacientes.get(i);
            System.out.println("Nome: " + pacienteAtual.getNome());
            System.out.println("Sobrenome: " + pacienteAtual.getSobrenome());
            System.out.println("CPF: " + pacienteAtual.getCPF());
            System.out.println("Endereço: " + pacienteAtual.getEndereco());
            System.out.println("Alergia: " + pacienteAtual.getAlergia());
            System.out.println("\n");
        }
    }

    public void listarMedico() {

        if (App.medicos.isEmpty()) {
            System.out.println("Não há medicos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Médicos cadastrados -----------|\n");
        for (int i = 0; i < App.medicos.size(); i++) {
            Medico medicoAtual = App.medicos.get(i);
            System.out.println("Nome: " + medicoAtual.getNome());
            System.out.println("Sobrenome: " + medicoAtual.getSobrenome());
            System.out.println("CPF: " + medicoAtual.getCPF());
            System.out.println("Endereço: " + medicoAtual.getEndereco());
            System.out.println("Alergia: " + medicoAtual.getCrm());
            System.out.println("\n");
        }
    }

    public void listarExames() {

        if (App.exames.isEmpty()) {
            System.out.println("Não há exames cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de exames cadastrados -----------|\n");
        for (int i = 0; i < App.exames.size(); i++) {
            Exame exameAtual = App.exames.get(i);
            System.out.println("Nome: " + exameAtual.getNome());
            System.out.println("Descrição: " + exameAtual.getDescricao());

            System.out.println("\n");
        }
    }

    public void listarAgendamento_consultas() {

        if (App.agendar_consultas.isEmpty()) {
            System.out.println("Não há consultas cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Consultas Agendadas -----------|\n");
        for (int i = 0; i < App.agendar_consultas.size(); i++) {
            Agendar_consulta consulta = App.agendar_consultas.get(i);
            System.out.println("Paciente: " + consulta.getPaciente().getNome());
            System.out.println("Médico: " + consulta.getMedico().getNome());
            System.out.println("Local: " + consulta.getLocal());
            System.out.println("Dia e hora marcados: " + consulta.getData_e_hora().format(formatador));
            System.out.println("\n");
        }
    }

    public void listarAgendamento_Exames() {
        if (App.agendar_exames.isEmpty()) {
            System.out.println("Não há agendamento de exames cadastrados.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de Exames Agendadas -----------|\n");
        for (int i = 0; i < App.agendar_exames.size(); i++) {
            Agendar_exame exame = App.agendar_exames.get(i);
            System.out.println("Paciente: " + exame.getPaciente().getNome());
            System.out.println("Médico: " + exame.getMedico().getNome());
            System.out.println("Exame:" + exame.getExame().getNome());
            System.out.println("Local: " + exame.getLocal());
            System.out.println("Dia e hora marcados: " + exame.getData_e_hora().format(formatador));
            System.out.println("\n");

            System.out.println("\n");
        }
    }
}
