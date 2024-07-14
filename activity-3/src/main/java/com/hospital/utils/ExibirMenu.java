package main.java.com.hospital.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExibirMenu {
    public void menu() {
        CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
            System.out.println("|----- Bem Vindo(a) ao sistema de gestão de hospital ----|\n");
            // });
            // CompletableFuture.delayedExecutor(6, TimeUnit.SECONDS).execute(() -> {
            // System.out.println("\033[H\033[2J");
            System.out.print("##-- Menu --##\n\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Paciente             |\n");
            System.out.print("| Opção 2 - Cadastro Médico               |\n");
            System.out.print("| Opção 3 - Cadastro Exame                |\n");
            System.out.print("| Opção 4 - Gerar Agendamento de consulta |\n");
            System.out.print("| Opção 5 - Gerar Agendamento de Exame    |\n");
            System.out.print("| Opção 6 - Gerar Relatórios              |\n");
            System.out.print("| Opção 7 - Sair                          |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");
        });
    }

    public void MenuRelatorio() {
        System.out.println("\n\n");

        System.out.print("##-- Relatório --##\n\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("| Opção 1 - Relatório Paciente       |\n");
        System.out.print("| Opção 2 - Relatório Médico         |\n");
        System.out.print("| Opção 3 - Relatório Exame          |\n");
        System.out.print("| Opção 4 - Consultas Agendadas      |\n");
        System.out.print("| Opção 5 - Exames Agendados         |\n");
        System.out.print("| Opção 6 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

}
