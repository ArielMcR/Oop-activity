package main.java.com.voos.utils.listagem;

import main.java.com.voos.modelos.*;

import java.time.format.DateTimeFormatter;

import main.java.com.voos.Controle.App;

public class Listar {

    public void listarUsuario() {

        if (App.usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Usuários -----------|\n");
        for (int i = 0; i < App.usuarios.size(); i++) {
            Usuario usuarioAtual = App.usuarios.get(i);
            System.out.println("Nome: " + usuarioAtual.getNome());
            System.out.println("Sobrenome: " + usuarioAtual.getSobrenome());
            System.out.println("Passaporte: " + usuarioAtual.getPassaporte());
            System.out.println("Email: " + usuarioAtual.getEmail());
            System.out.println("\n");
        }
    }

    public void listarServico() {

        if (App.servicos.isEmpty()) {
            System.out.println("Não há servicos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Serviços -----------|\n");
        for (int i = 0; i < App.servicos.size(); i++) {
            Servico servicoAtual = App.servicos.get(i);
            System.out.println("Tipo: " + servicoAtual.getTipo());
            System.out.println("Descrição: " + servicoAtual.getDescricao());
            System.out.println("Valor adicional: " + servicoAtual.getPreco());
            System.out.println("\n");
        }
    }

    public void listarVoo() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

        if (App.voos.isEmpty()) {
            System.out.println("Não há Voos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Voos -----------|\n");
        for (int i = 0; i < App.voos.size(); i++) {
            Voo vooAtual = App.voos.get(i);
            System.out.println("Código do Voo: " + vooAtual.getCodigo_do_Voo());
            System.out.println("Companhia Área: " + vooAtual.getCompanhia_aerea());
            System.out.println("Preço da Passagem: " + vooAtual.getPreco_passagem());
            System.out.println("Hora de partida: " + vooAtual.getHora_de_partida().format(formatador));
            System.out.println("Hora de chegada: " + vooAtual.getHora_de_chegada().format(formatador));
            System.out.println("\n");
        }
    }

    public void listarAssento() {

        if (App.assentos.isEmpty()) {
            System.out.println("Não há assentos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de assentos -----------|\n");
        for (int i = 0; i < App.assentos.size(); i++) {
            Assento assentoAtual = App.assentos.get(i);
            System.out.println("Número do Assento: " + assentoAtual.getNumero());
            System.out.println("\n");
        }
    }

    public void listarReserva_voo() {
        if (App.reserva_Voos.isEmpty()) {
            System.out.println("Não há reservas cadastradas.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Reservas -----------|\n");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        for (int i = 0; i < App.reserva_Voos.size(); i++) {
            Reserva_Voo reservaAtual = App.reserva_Voos.get(i);
            System.out.println("Voo " + i);
            System.out.println("Código do voo: " + reservaAtual.getVoo().getCodigo_do_Voo());
            System.out.println("Cidade de saida: " + reservaAtual.getVoo().getCidade_saida());
            System.out.println("Cidade de Chegada: " + reservaAtual.getVoo().getCidade_chegada());
            System.out.println("Hora de saida: " + reservaAtual.getVoo().getHora_de_partida().format(formatador));
            System.out.println("Hora de chegada: " + reservaAtual.getVoo().getHora_de_chegada().format(formatador));
            System.out.println("Usuário: " + reservaAtual.getUsuario().getNome());
            System.out.println("Preço da Passagem: " + reservaAtual.getVoo().getPreco_passagem());

            System.out.println("\n");
        }
    }
}
