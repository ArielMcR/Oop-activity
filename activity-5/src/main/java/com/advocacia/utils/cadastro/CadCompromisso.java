package main.java.com.advocacia.utils.cadastro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.advocacia.Controle.App;
import main.java.com.advocacia.modelos.*;

/**
 * Documento
 */
public class CadCompromisso {
    public static Scanner sc = new Scanner(System.in);

    // - dataHora: LocalDateTime
    // - descricao: String
    // - cliente: Cliente
    // - advogado: Advogado
    // - local: String

    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public static void cadastrarCompromisso() {
        Compromisso compromisso = new Compromisso();
        System.out.println("Digite a descrição do compromisso: ");
        compromisso.setDescricao(sc.nextLine());
        System.out.println(
                "Digite a data e hora do compromisso, no padrão (Hora, minuto, dia, mês, ano) ex: 12:20 01/01/2025");
        String data = sc.nextLine();
        LocalDateTime data_entrada = LocalDateTime.parse(data, formater);
        compromisso.setData_hora(data_entrada);
        System.out.println("Digite o local do compromisso");
        compromisso.setLocal(sc.nextLine());

        System.out.println("Escolha o advogado do compromisso, nota-se que ele tem que ser cadastrado antes");
        if (App.clientes.size() == 0) {
            System.out.println("Nenhum advogado cadastrado, por favor cadastrar na primeira opção do meu");
            return;
        }
        for (int i = 0; i < App.clientes.size(); i++) {
            Advogado advogadoAtual = App.advogados.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + advogadoAtual.getNome() +
                            ", sobrenome: " + advogadoAtual.getSobrenome() +
                            ", telefone: "
                            + advogadoAtual.getTelefone() +
                            ", O.A.B: "
                            + advogadoAtual.getOab() +
                            "|");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Advogado advogadoEscolhido = App.advogados.get(opcaoEscolhida);
        compromisso.setAdvogado(advogadoEscolhido);

        System.out.println("Escolha o cliente do compromisso, nota-se que ele tem que ser cadastrado antes");
        if (App.clientes.size() == 0) {
            System.out.println("Nenhum cliente cadastrado, por favor cadastrar na primeira opção do meu");
            return;
        }
        for (int i = 0; i < App.clientes.size(); i++) {
            Cliente clienteAtual = App.clientes.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + clienteAtual.getNome() +
                            ", sobrenome: " + clienteAtual.getSobrenome() +
                            ", telefone: "
                            + clienteAtual.getTelefone() +
                            "|");
        }
        System.out.println("Escolha uma opção: ");
        opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Cliente clienteEscolhido = App.clientes.get(opcaoEscolhida);
        compromisso.setCliente(clienteEscolhido);
        System.out.println("Deseja realmente marcar o compromisso ?(S ou N)");
        String confirmação = sc.nextLine();
        if (confirmação.equalsIgnoreCase("N")) {
            System.out.println("Cancelando Compromisso....");
            System.out.println("Voltando para o menu.");
            return;
        }
        App.compromissos.add(compromisso);
        System.out.println("Cadastro do Documento realizado com sucesso !!!");
        System.out.println("\n\n");

    }
}