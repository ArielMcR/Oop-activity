package main.java.com.hospital.utils.cadastro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

public class CadAgenda_consulta {
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void cadastrarConsulta() {
        Agendar_consulta consulta = new Agendar_consulta();
        System.out.println("Qual o paciente da consulta");
        if (App.pacientes.size() == 0) {
            System.out.println("Nenhum paciente cadastrado, voltando para o menu...");
            return;
        }
        for (int i = 0; i < App.pacientes.size(); i++) {
            Paciente pacienteAtual = App.pacientes.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + pacienteAtual.getNome() +
                            ", sobrenome: " + pacienteAtual.getSobrenome() +
                            ", CPF: "
                            + pacienteAtual.getCPF() +
                            "|");
        }
        System.out.println("Escolha uma opção:");

        int opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Paciente pacienteEscolhido = App.pacientes.get(opcaoSelecionado);
        consulta.setPaciente(pacienteEscolhido);
        System.out.println("Qual o medico da consulta ? ");

        if (App.medicos.size() == 0) {
            System.out.println("Nenhum médico cadastro, voltado para o menu");
            return;
        }
        for (int i = 0; i < App.medicos.size(); i++) {
            Medico medicoAtual = App.medicos.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + medicoAtual.getNome() +
                            ", sobrenome: " + medicoAtual.getSobrenome() +
                            ", CPF: "
                            + medicoAtual.getCPF() +
                            ", CRM: " + medicoAtual.getCrm() +
                            "|");
        }
        System.out.println("Escolha uma opção:");
        opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Medico medicoSelecionado = App.medicos.get(opcaoSelecionado);
        consulta.setMedico(medicoSelecionado);

        System.out.println("Qual o local de consulta ? ");
        consulta.setLocal(sc.nextLine());
        System.out.println("Qual a data e hora da consulta ?(HH:MM DD/MM/YYYY)");
        String data_consulta = sc.nextLine();
        try {
            LocalDateTime hora_e_data = LocalDateTime.parse(data_consulta, formatter);
            consulta.setData_e_hora(hora_e_data);
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("Erro:");
            System.out.println("Digite uma data válida, ex: 14:20 20/06/2004");
            System.out.println("\n");
            // N é a melhor forma de fazer isso !!!
            System.out.println("Qual a data e hora de saida ?(HH:MM DD/MM/YYYY)");
            sc.nextLine();
            data_consulta = sc.nextLine();
            LocalDateTime hora_e_data = LocalDateTime.parse(data_consulta, formatter);
            consulta.setData_e_hora(hora_e_data);
        }

        App.agendar_consultas.add(consulta);
        System.out.println("Consulta cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
