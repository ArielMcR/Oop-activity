package main.java.com.advocacia.utils.cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.advocacia.modelos.*;
import main.java.com.advocacia.Controle.App;;

// - numero_Processo: String
// - descricao: String
// - data_Abertura: Date
// - data_Fechamento: Date
// - cliente: Cliente
// - advogado: Advogado

public class CadProcesso {
    public static Scanner sc = new Scanner(System.in);

    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void cadastrarProcesso() {
        Processo processo = new Processo();
        System.out.println("Digite o número do processo: ");
        processo.setNumero_Processo(sc.nextLine());
        System.out.println("Digite a descrição do processo: ");
        processo.setDescricao(sc.nextLine());
        System.out.println("Digite a data de abertura do processo, no padrão (DD/MM/AAAA)");
        String data_abertura = sc.nextLine();
        LocalDate data_entrada = LocalDate.parse(data_abertura, formater);
        processo.setData_abertura(data_entrada);
        System.out.println("Digite a data de fechamento do processo, no padrão (DD/MM/AAAA)");
        String data_fechamento = sc.nextLine();
        LocalDate data_saida = LocalDate.parse(data_fechamento, formater);
        processo.setData_fechamento(data_saida);

        System.out.println("Escolha o cliente do processo, nota-se que ele tem que ser cadastrado antes");
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
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Cliente clienteEscolhido = App.clientes.get(opcaoEscolhida);
        processo.setCliente(clienteEscolhido);

        System.out.println("Escolha o advogado do processo, nota-se que ele tem que ser cadastrado antes");
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
        opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Advogado advogadoEscolhido = App.advogados.get(opcaoEscolhida);
        processo.setAdvogado(advogadoEscolhido);

        System.out.println("Deseja realmente cadastrar o processo  ?(S ou N)");
        String confirmação = sc.nextLine();
        if (confirmação.equalsIgnoreCase("N")) {
            System.out.println("Cancelando Processo....");
            System.out.println("Voltando para o menu.");
            return;
        }
        App.processos.add(processo);
        System.out.println("Cadastro de Processo realizado com sucesso !!!");
        System.out.println("\n\n");

    }
}
