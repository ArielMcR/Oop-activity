package main.java.com.hotel.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExibirMenu {
    public void menu() {
        CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
            System.out.println("|----- Bem Vindo(a) ao sistema de gestão de hotel ----|\n");
            // });
            // CompletableFuture.delayedExecutor(6, TimeUnit.SECONDS).execute(() -> {
            // System.out.println("\033[H\033[2J");
            System.out.print("##-- Menu --##\n\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Hospede              |\n");
            System.out.print("| Opção 2 - Cadastro Quarto               |\n");
            System.out.print("| Opção 3 - Cadastro Serviço              |\n");
            System.out.print("| Opção 4 - Cadastro Funcionário          |\n");
            System.out.print("| Opção 5 - Gerar Reserva de Quarto       |\n");
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
        System.out.print("| Opção 1 - Relatório Hospede        |\n");
        System.out.print("| Opção 2 - Relatório Quarto         |\n");
        System.out.print("| Opção 3 - Relatório Serviço        |\n");
        System.out.print("| Opção 4 - Relatório Funcionário    |\n");
        System.out.print("| Opção 5 - Quartos reservados       |\n");
        System.out.print("| Opção 6 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

}
