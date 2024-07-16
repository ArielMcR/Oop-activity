package main.java.com.academia.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExibirMenu {
    public void menu() {
        CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
            System.out.println("|----- Bem Vindo(a) ao sistema de gestão de Academia ----|\n");
            // });
            // CompletableFuture.delayedExecutor(6, TimeUnit.SECONDS).execute(() -> {
            // System.out.println("\033[H\033[2J");
            System.out.print("##-- Menu --##\n\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Aluno                |\n");
            System.out.print("| Opção 2 - Cadastro Professor            |\n");
            System.out.print("| Opção 3 - Cadastro Plano de Assinatura  |\n");
            System.out.print("| Opção 4 - Cadastro Aula                 |\n");
            System.out.print("| Opção 5 - Gerar Relatórios              |\n");
            System.out.print("| Opção 6 - Sair                          |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");
        });
    }

    public void MenuRelatorio() {
        System.out.println("\n\n");

        System.out.print("##-- Relatório --##\n\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("| Opção 1 - Relatório Aluno          |\n");
        System.out.print("| Opção 2 - Relatório Professor      |\n");
        System.out.print("| Opção 3 - Relatório Assinaturas    |\n");
        System.out.print("| Opção 4 - Relatório Aulas          |\n");
        System.out.print("| Opção 5 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

}
