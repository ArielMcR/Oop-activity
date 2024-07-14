package main.java.com.voos.utils.cadastro;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.voos.Controle.App;
import main.java.com.voos.modelos.Reserva_Voo;
import main.java.com.voos.modelos.Servico;
import main.java.com.voos.modelos.Usuario;
import main.java.com.voos.modelos.Voo;
import main.java.com.voos.modelos.Assento;

import main.java.com.voos.utils.ExibirMenu;;

public class CadReserva_Voo {
    Scanner sc = new Scanner(System.in);
    ExibirMenu menu = new ExibirMenu();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void cadastroReserva() {
        Reserva_Voo reserva = new Reserva_Voo();

        System.out.println("--- Escolha o voo ---");
        if (App.voos.size() == 0) {
            System.out.println("Nenhum voo cadastrado, voltado para o menu... \n\n");
            return;
        }
        for (int i = 0; i < App.voos.size(); i++) {
            Voo voosAtual = App.voos.get(i);
            System.out.println(
                    "| Opção " + (i) + " - " + voosAtual.getCodigo_do_Voo() +
                            ", cidade de saída: " + voosAtual.getCidade_saida() +
                            ", cidade de chegada: "
                            + voosAtual.getCidade_chegada() +
                            ", data de saída: "
                            + voosAtual.getHora_de_partida().format(formatador) +
                            "|");
        }
        int opcaoVoo = sc.nextInt();
        Voo vooEscolhido = App.voos.get(opcaoVoo);
        reserva.setVoo(vooEscolhido);
        System.out.println("--- Escolha o usuário ---");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado, voltado para o menu... \n\n");
            return;
        }
        for (int i = 0; i < App.usuarios.size(); i++) {
            Usuario usuarioAtual = App.usuarios.get(i);
            System.out.println(
                    "| Opção " + (i) + " - " + usuarioAtual.getNome() + " " + usuarioAtual.getSobrenome() + "|");
        }
        int opcaoUsuario = sc.nextInt();
        Usuario usuarioEscolhido = App.usuarios.get(opcaoUsuario);
        reserva.setUsuario(usuarioEscolhido);

        System.out.println("\n");
        System.out.println("--- Escolha o Assento ---");
        if (App.assentos.size() == 0) {
            System.out.println("Nenhum assento cadastrado, voltado para o menu... \n\n");
            return;
        }
        for (int i = 0; i < App.assentos.size(); i++) {
            Assento assentoAtual = App.assentos.get(i);
            System.out.println(
                    "| Opção " + (i) + " - " + assentoAtual.getNumero() + assentoAtual.getClasse() + "|");
        }
        int opcaoAssento = sc.nextInt();
        Assento assentoEscolhido = App.assentos.get(opcaoAssento);
        reserva.setAssento(assentoEscolhido);

        System.out.println("Deseja adicionar algum serviço ?(S ou N)");
        sc.nextLine();
        String confirmacaoServico = sc.nextLine();
        if (confirmacaoServico.equalsIgnoreCase("S")) {
            System.out.println("--- Escolha o Serviço ---");

            // Lista de serviços disponíveis
            if (App.servicos.size() == 0) {
                System.out.println("Nenhum serviço cadastrado, voltando para o menu... \n\n");
                return;
            }
            for (int i = 0; i < App.servicos.size(); i++) {
                Servico servicoAtual = App.servicos.get(i);
                System.out.println(
                        "| Opção " + (i) + " - " + servicoAtual.getTipo() + " (R$ " + servicoAtual.getPreco() + ") |");
            }
            int opcaoServico = sc.nextInt();
            Servico servicoEscolhido = App.servicos.get(opcaoServico);
            float novoPreco = reserva.adicionarServico(servicoEscolhido);
            vooEscolhido.setPreco_passagem(novoPreco);
            reserva.setVoo(vooEscolhido);
        }

        System.out.println("Deseja realmente realizar a reserva ?(S ou N)");
        sc.nextLine();
        String confirmação = sc.nextLine();
        if (confirmação.equalsIgnoreCase("N")) {
            reserva.setConfirmada(false);
            System.out.println("Cancelando reserva....");
            System.out.println("Voltando para o menu.");
            return;
        }
        reserva.setConfirmada(true);
        App.reserva_Voos.add(reserva);

        System.out.println("\n\n");
        System.out.println("Reserva cadastrada com sucesso!");

    }

}
