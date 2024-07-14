package main.java.com.voos.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExibirMenu {
    public void menu() {
        CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS).execute(() -> {
            System.out.println("|----- Bem Vindo(a) ao sistema de gestão de Voos ----|\n");
            // });
            // CompletableFuture.delayedExecutor(6, TimeUnit.SECONDS).execute(() -> {
            // System.out.println("\033[H\033[2J");
            System.out.print("##-- Menu --##\n\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro Usuário     |\n");
            System.out.print("| Opção 2 - Cadastro Voo         |\n");
            System.out.print("| Opção 3 - Cadastro Serviço     |\n");
            System.out.print("| Opção 4 - Cadastro Assento     |\n");
            System.out.print("| Opção 5 - Gerar Reserva de Voo |\n");
            System.out.print("| Opção 6 - Gerar Relatórios     |\n");
            System.out.print("| Opção 7 - Sair                 |\n");
            System.out.print("|--------------------------------|\n");
            System.out.print("Digite uma opção: ");
        });
    }

    public void MenuRelatorio() {
        System.out.println("\n\n");

        System.out.print("##-- Relatório --##\n\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("| Opção 1 - Relatório Usuário        |\n");
        System.out.print("| Opção 2 - Relatório Voo            |\n");
        System.out.print("| Opção 3 - Relatório Serviço        |\n");
        System.out.print("| Opção 4 - Relatório Assento        |\n");
        System.out.print("| Opção 5 - Relatório Reserva de Voo |\n");
        System.out.print("| Opção 6 - Voltar para o menu       |\n");
        System.out.print("|------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }

    public void MenuEmprestimo() {
        System.out.print("##-- Menu --##\n\n");
        System.out.print("|---------------------------------------|\n");
        System.out.print("| Opção 1 - Empréstimo para Professor   |\n");
        System.out.print("| Opção 2 - Empréstimo para Aluno       |\n");
        System.out.print("| Opção 3 - Empréstimo para Funcionário |\n");
        System.out.print("|---------------------------------------|\n");

    }
}
