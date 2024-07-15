package main.java.com.advocacia.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.advocacia.Controle.App;
import main.java.com.advocacia.modelos.*;

public class Listar {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void listarCliente() {

        if (App.clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de clientes cadastrados -----------|\n");
        for (int i = 0; i < App.clientes.size(); i++) {
            Cliente clienteAtual = App.clientes.get(i);
            System.out.println("Nome: " + clienteAtual.getNome());
            System.out.println("Sobrenome: " + clienteAtual.getSobrenome());
            System.out.println("Email: " + clienteAtual.getEmail());
            System.out.println("Telefone: " + clienteAtual.getTelefone());
            System.out.println("\n");
        }
    }

    public void listarAdvogado() {

        if (App.advogados.isEmpty()) {
            System.out.println("Não há advogados cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Advogados cadastrados -----------|\n");
        for (int i = 0; i < App.advogados.size(); i++) {
            Advogado advogadoAtual = App.advogados.get(i);
            System.out.println("Nome: " + advogadoAtual.getNome());
            System.out.println("Sobrenome: " + advogadoAtual.getSobrenome());
            System.out.println("Email: " + advogadoAtual.getEmail());
            System.out.println("Telefone: " + advogadoAtual.getTelefone());
            System.out.println("O.A.B: " + advogadoAtual.getTelefone());
            System.out.println("Horas Trabalhadas " + advogadoAtual.getHorasTrabalhadas());
            System.out.println("\n");
        }
    }

    public void listarCompromisso() {

        if (App.compromissos.isEmpty()) {
            System.out.println("Não há compromissos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Compromissos cadastrados -----------|\n");
        for (int i = 0; i < App.compromissos.size(); i++) {
            Compromisso compromissoAtual = App.compromissos.get(i);
            System.out.println("Descrição: " + compromissoAtual.getDescricao());
            System.out.println("Local: " + compromissoAtual.getLocal());
            System.out.println("Data e hora: " + compromissoAtual.getData_hora().format(formatadorHora));
            System.out.println("Advogado: " + compromissoAtual.getAdvogado().getNome() + " " + compromissoAtual
                    .getAdvogado().getSobrenome());
            System.out.println("O.A.B: " + compromissoAtual.getAdvogado().getOab());
            System.out.println("Cliente: " + compromissoAtual.getCliente().getNome());

            System.out.println("\n");
        }
    }

    public void listarDocumentos() {

        if (App.documentos.isEmpty()) {
            System.out.println("Não há documentos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Documentos Agendadas -----------|\n");
        for (int i = 0; i < App.documentos.size(); i++) {
            Documento documentoAtual = App.documentos.get(i);
            System.out.println("Titulo do documento: " + documentoAtual.getTitulo());
            System.out.println("Descrição: " + documentoAtual.getDescricao());
            System.out.println("Advogado: " + documentoAtual.getAdvogado().getNome());
            System.out.println("Data de criação: " + documentoAtual.getData_Criacao().format(formatador));
            System.out.println("\n");
        }
    }

    public void listarProcessos() {
        if (App.processos.isEmpty()) {
            System.out.println("Não há processos cadastrados.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de Processos Agendadas -----------|\n");
        for (int i = 0; i < App.processos.size(); i++) {
            Processo processoAtual = App.processos.get(i);
            System.out.println("Número do processo: " + processoAtual.getNumero_Processo());
            System.out.println("Descrição do processo: " + processoAtual.getDescricao());
            System.out
                    .println("Advogado: " + processoAtual.getAdvogado().getNome() + " "
                            + processoAtual.getAdvogado().getSobrenome() + " "
                            + processoAtual.getAdvogado().getOab());
            System.out
                    .println("Cliente: " + processoAtual.getCliente().getNome() + " "
                            + processoAtual.getCliente().getSobrenome() + " Cpf: "
                            + processoAtual.getCliente().getCpf());
            System.out.println("Data de abertura do processo: " + processoAtual.getData_abertura().format(formatador));
            System.out
                    .println(
                            "Data de fechamento do processo: " + processoAtual.getData_fechamento().format(formatador));

            System.out.println("\n");

        }
    }
}
