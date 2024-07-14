package main.java.com.hotel.utils.cadastro;

import java.time.LocalDate;

/**
 * CadReserva_Quarto
 */

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

import main.java.com.hotel.modelos.*;

import main.java.com.hotel.Controle.App;

public class CadReserva_Quarto {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void cadastrarReservaDeQuarto() {
        Reserva_quarto reserva_quarto = new Reserva_quarto();
        System.out.println("Qual o Hospede ?");
        if (App.hospedes.size() == 0) {
            System.out.println("Nenhum hospede cadastrado, voltando para o menu...");
            return;
        }
        for (int i = 0; i < App.hospedes.size(); i++) {
            Hospede hospedeAtual = App.hospedes.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + hospedeAtual.getNome() +
                            ", sobrenome: " + hospedeAtual.getSobrenome() +
                            ", telefone: "
                            + hospedeAtual.getTelefone() +
                            "|");
        }
        System.out.println("Escolha uma opção:");

        int opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Hospede hospedeEscolhido = App.hospedes.get(opcaoSelecionado);
        reserva_quarto.setHospede(hospedeEscolhido);

        System.out.println("Escolha o quarto");
        if (App.quartos.size() == 0) {
            System.out.println("Nenhum quarto cadastro, voltado para o menu");
            return;
        }
        for (int i = 0; i < App.quartos.size(); i++) {
            Quarto quartoAtual = App.quartos.get(i);
            if (quartoAtual.getDisponivel() == true) {
                System.out.println(
                        "| Opção " + (i) + " - Tipo: " + quartoAtual.getTipo() +
                                ", valor: " + quartoAtual.getPrecoQuarto() +
                                ", andar: "
                                + quartoAtual.getAndar() +
                                ", Quantidade de camas : " + quartoAtual.getQuantidadeCamas() +
                                "|");
            }
        }
        System.out.println("Escolha uma opção:");
        opcaoSelecionado = sc.nextInt();
        sc.nextLine();
        Quarto quartoSelecionado = App.quartos.get(opcaoSelecionado);
        reserva_quarto.setQuarto(quartoSelecionado);

        System.out.println("Qual a check-in ?(DD/MM/AAAA)");
        String data_consulta = sc.nextLine();
        LocalDate data_entrada = LocalDate.parse(data_consulta, formatter);
        reserva_quarto.setDataReservaEntrada(data_entrada);

        System.out.println("Qual a check-out ?(DD/MM/AAAA)");
        String data = sc.nextLine();
        LocalDate data_saida = LocalDate.parse(data, formatter);
        reserva_quarto.setDataReservaSaida(data_saida);

        System.out.println("Deseja adicionar algum serviço ?(S ou N)");
        String confirmacaoServico = sc.nextLine();
        if (confirmacaoServico.equalsIgnoreCase("S")) {
            System.out.println("--- Escolha o Serviço ---");

            if (App.servicos.size() == 0) {
                System.out.println("Nenhum serviço cadastrado, voltando para o menu... \n\n");
                return;
            }
            for (int i = 0; i < App.servicos.size(); i++) {
                Servico servicoAtual = App.servicos.get(i);
                System.out.println(
                        "| Opção " + (i) + " - " + servicoAtual.getNome() + " (R$ " + servicoAtual.getValor() + ") |");
            }
            int opcaoServico = sc.nextInt();
            sc.nextLine();
            Servico servicoEscolhido = App.servicos.get(opcaoServico);
            float novoPreco = reserva_quarto.adicionarServico(servicoEscolhido);
            quartoSelecionado.setPrecoQuarto(novoPreco);
            reserva_quarto.setQuarto(quartoSelecionado);
        }
        System.out.println("Deseja realmente realizar a reserva ?(S ou N)");
        String confirmação = sc.nextLine();
        if (confirmação.equalsIgnoreCase("N")) {
            System.out.println("Cancelando reserva....");
            System.out.println("Voltando para o menu.");
            return;
        }
        reserva_quarto.getQuarto().setDisponivel(false);
        App.reserva_Quartos.add(reserva_quarto);
        System.out.println("Reserva cadastrada com Sucesso!!!");
        System.out.println("\n\n");

    }
}
