package main.java.com.arvore.utils;

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
            System.out.print("| Opção 1 - Cadastro Pessoa               |\n");
            System.out.print("| Opção 2 - Cadastro Árvore               |\n");
            System.out.print("| Opção 3 - Cadastro Evento               |\n");
            System.out.print("| Opção 4 - Gerar Adoção                  |\n");
            System.out.print("| Opção 5 - Gerar Manutenção              |\n");
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
        System.out.print("| Opção 1 - Relatório Pessoa         |\n");
        System.out.print("| Opção 2 - Relatório Árvore         |\n");
        System.out.print("| Opção 3 - Relatório Evento         |\n");
        System.out.print("| Opção 4 - Adoções cadastradas      |\n");
        System.out.print("| Opção 5 - Manutenções cadastradas  |\n");
        System.out.print("| Opção 6 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

}
