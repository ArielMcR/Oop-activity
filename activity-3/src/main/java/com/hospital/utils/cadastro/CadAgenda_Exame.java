package main.java.com.hospital.utils.cadastro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

public class CadAgenda_Exame {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void cadastrarExame() {
        Agendar_exame exame = new Agendar_exame();

        System.out.println("Qual o exame ?");
        if (App.exames.size() == 0) {
            System.out.println("Nenhum exame cadastrado, voltando para o menu...");
            return;
        }
        for (int i = 0; i < App.exames.size(); i++) {
            Exame exameAtual = App.exames.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + exameAtual.getNome() +
                            ", descrição: " + exameAtual.getDescricao() +
                            "|");
        }
        System.out.println("Escolha uma opção:");
        int opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Exame ExameEscolhido = App.exames.get(opcaoSelecionado);
        exame.setExame(ExameEscolhido);

        System.out.println("Qual o paciente do exame");
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
        opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Paciente pacienteEscolhido = App.pacientes.get(opcaoSelecionado);
        exame.setPaciente(pacienteEscolhido);

        System.out.println("Qual o médico do exame ? ");

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
        opcaoSelecionado = sc.nextInt();
        Medico medicoSelecionado = App.medicos.get(opcaoSelecionado);
        exame.setMedico(medicoSelecionado);

        System.out.println("Qual o local de exame  ? ");
        exame.setLocal(sc.nextLine());
        sc.nextLine();
        System.out.println("Qual a data e hora da exame ?(HH:MM DD/MM/YYYY)");
        String data_consulta = sc.nextLine();
        try {
            LocalDateTime hora_e_data = LocalDateTime.parse(data_consulta, formatter);
            exame.setData_e_hora(hora_e_data);
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("Erro:");
            System.out.println("Digite uma data válida, ex: 14:20 20/06/2004");
            System.out.println("\n");
            // N é a melhor forma de fazer isso !!!
            System.out.println("Qual a data e hora do exame ?(HH:MM DD/MM/YYYY)");
            sc.nextLine();
            data_consulta = sc.nextLine();
            LocalDateTime hora_e_data = LocalDateTime.parse(data_consulta, formatter);
            exame.setData_e_hora(hora_e_data);
        }

        App.agendar_exames.add(exame);
        System.out.println("Exame cadastrada com Sucesso!!!");
        System.out.println("\n\n");

    }
}
