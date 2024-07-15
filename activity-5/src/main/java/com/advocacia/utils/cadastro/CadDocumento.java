package main.java.com.advocacia.utils.cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.advocacia.Controle.App;
import main.java.com.advocacia.modelos.*;

/**
 * Documento
 */
public class CadDocumento {
    public static Scanner sc = new Scanner(System.in);

    // - titulo: String
    // - descricao: String
    // - data_Criacao: Date
    // - advogado: Advogado

    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void cadastrarDocumento() {
        Documento documento = new Documento();
        System.out.println("Digite o titulo do Documento: ");
        documento.setTitulo(sc.nextLine());
        System.out.println("Digite a descrição do documento: ");
        documento.setDescricao(sc.nextLine());
        System.out.println("Digite a data de abertura do documento, no padrão (DD/MM/AAAA)");
        String data_abertura = sc.nextLine();
        LocalDate data_entrada = LocalDate.parse(data_abertura, formater);
        documento.setData_Criacao(data_entrada);
        System.out.println("Digite a data de fechamento do documento, no padrão (DD/MM/AAAA)");
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
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Advogado advogadoEscolhido = App.advogados.get(opcaoEscolhida);
        documento.setAdvogado(advogadoEscolhido);
        System.out.println("Deseja cadastrar o Documento ?(S ou N)");
        String confirmação = sc.nextLine();
        if (confirmação.equalsIgnoreCase("N")) {
            System.out.println("Cancelando documento....");
            System.out.println("Voltando para o menu.");
            return;
        }
        App.documentos.add(documento);
        System.out.println("Cadastro do Documento realizado com sucesso !!!");
        System.out.println("\n\n");

    }
}