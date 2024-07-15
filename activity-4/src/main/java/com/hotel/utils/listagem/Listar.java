package main.java.com.hotel.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.hotel.Controle.App;
import main.java.com.hotel.modelos.*;

public class Listar {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void listarHospede() {

        if (App.hospedes.isEmpty()) {
            System.out.println("Não há hospedes cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de hospedes cadastrados -----------|\n");
        for (int i = 0; i < App.hospedes.size(); i++) {
            Hospede hospedeAtual = App.hospedes.get(i);
            System.out.println("Nome: " + hospedeAtual.getNome());
            System.out.println("Sobrenome: " + hospedeAtual.getSobrenome());
            System.out.println("Email: " + hospedeAtual.getEmail());
            System.out.println("Telefone: " + hospedeAtual.getTelefone());
            System.out.println("\n");
        }
    }

    public void listarQuarto() {

        if (App.quartos.isEmpty()) {
            System.out.println("Não há quartos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Quartos cadastrados -----------|\n");
        for (int i = 0; i < App.quartos.size(); i++) {
            Quarto quartoAtual = App.quartos.get(i);
            System.out.println("Tipo: " + quartoAtual.getTipo());
            System.out.println("Quantida de camas: " + quartoAtual.getQuantidadeCamas());
            System.out.println("Andar do Hotel: " + quartoAtual.getAndar());
            System.out.println("Preço do quarto: " + quartoAtual.getPrecoQuarto());
            System.out.println("Disponibilidade: " + quartoAtual.getDisponivel());
            System.out.println("\n");
        }
    }

    public void listarFuncionarios() {

        if (App.funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de funcionários cadastrados -----------|\n");
        for (int i = 0; i < App.funcionarios.size(); i++) {
            Funcionario funcionarioAtual = App.funcionarios.get(i);
            System.out.println("Nome: " + funcionarioAtual.getNome());
            System.out.println("Sobrenome: " + funcionarioAtual.getSobrenome());
            System.out.println("Cpf: " + funcionarioAtual.getCPF());
            System.out.println("Endereço: " + funcionarioAtual.getEndereco());

            System.out.println("\n");
        }
    }

    public void listarServico() {

        if (App.servicos.isEmpty()) {
            System.out.println("Não há serviços cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Serviços Agendadas -----------|\n");
        for (int i = 0; i < App.servicos.size(); i++) {
            Servico servicoAtual = App.servicos.get(i);
            System.out.println("Nome do serviço: " + servicoAtual.getNome());
            System.out.println("Descrição: " + servicoAtual.getDescricao());
            System.out.println("Valor do serviço: " + servicoAtual.getValor());
            System.out.println("\n");
        }
    }

    public void listarReservas_de_Quarto() {
        if (App.reserva_Quartos.isEmpty()) {
            System.out.println("Não há reservas de quartos cadastrados.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de Reservas Agendadas -----------|\n");
        for (int i = 0; i < App.reserva_Quartos.size(); i++) {
            Reserva_quarto quartos = App.reserva_Quartos.get(i);
            System.out.println("Número do Quarto: " + quartos.getQuarto().getNumeroDoQuarto());
            System.out.println("Preço do quarto: R$" + quartos.getQuarto().getPrecoQuarto());
            System.out
                    .println("Hóspede: " + quartos.getHospede().getNome() + " " + quartos.getHospede().getSobrenome());
            System.out.println("Telefone do Hóspede: " + quartos.getHospede().getTelefone());
            System.out.println("Check-in: " + quartos.getDataReservaEntrada().format(formatador));
            System.out.println("Check-out: " + quartos.getDataReservaSaida().format(formatador));
            System.out.println("\n");

            System.out.println("\n");
        }
    }
}
