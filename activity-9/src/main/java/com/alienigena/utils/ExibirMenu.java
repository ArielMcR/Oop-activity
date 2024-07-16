package main.java.com.alienigena.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExibirMenu {
    public void menu() {
        // CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
        System.out.println("|----- Bem Vindo(a) ao sistema de gestão de viagens intergaláticas ----|\n");
        // });
        // CompletableFuture.delayedExecutor(6, TimeUnit.SECONDS).execute(() -> {
        // System.out.println("\033[H\033[2J");
        System.out.print("##-- Menu --##\n\n");
        System.out.print("|-----------------------------------------|\n");
        System.out.print("| Opção 1 - Cadastro Turista              |\n");
        System.out.print("| Opção 2 - Cadastro Espécie              |\n");
        System.out.print("| Opção 3 - Cadastro Ponto turistico      |\n");
        System.out.print("| Opção 4 - Cadastro Hotel                |\n");
        System.out.print("| Opção 5 - Cadastro de Viagem            |\n");
        System.out.print("| Opção 6 - Gerar Relatórios              |\n");
        System.out.print("| Opção 7 - Sair                          |\n");
        System.out.print("|-----------------------------------------|\n");
        System.out.print("Digite uma opção: ");
        // });
    }

    public void MenuRelatorio() {
        System.out.println("\n\n");

        System.out.print("##-- Relatório --##\n\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("| Opção 1 - Relatório Turista        |\n");
        System.out.print("| Opção 2 - Relatório Espécie        |\n");
        System.out.print("| Opção 3 - Relatório Ponto turistico|\n");
        System.out.print("| Opção 4 - Relatório Hotel          |\n");
        System.out.print("| Opção 5 - Viagem cadastradas       |\n");
        System.out.print("| Opção 6 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

}
