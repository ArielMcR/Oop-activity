package main.java.com.arvore.utils.cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.arvore.Controle.App;
import main.java.com.arvore.modelos.*;

public class CadManuntecao {
    public static Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void cadastarManutencao() {
        Manutencao manutencao = new Manutencao();
        System.out.println("Digite a data de manutencao da árvore, no padrão (DD/MM/AAAA)");
        String data_abertura = sc.nextLine();
        LocalDate data_entrada = LocalDate.parse(data_abertura, formater);
        manutencao.setData_manutencao(data_entrada);

        System.out.println("Digite o tipo de manutenção dada na árvore:");
        manutencao.setTipo_manutencao(sc.nextLine());

        System.out.println("De qual é a pessoa da manutenção ? Ela precisa já estar cadastrada");
        if (App.pessoas.size() == 0) {
            System.out.println("Nenhum pessoa cadastrado voltado para o menu");
            return;
        }
        for (int i = 0; i < App.pessoas.size(); i++) {
            Pessoa pessoaAtual = App.pessoas.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + pessoaAtual.getNome() +
                            ", Sobrenome: " + pessoaAtual.getSobrenome() +
                            "|");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Pessoa pessoaEscolhido = App.pessoas.get(opcaoEscolhida);
        manutencao.setUsuario(pessoaEscolhido);

        System.out.println("De qual é a árvore da adoção ? Ela precisa já estar cadastrada");
        if (App.arvores.size() == 0) {
            System.out.println("Nenhum arvore cadastrado voltado para o menu");
            return;
        }
        for (int i = 0; i < App.arvores.size(); i++) {
            Arvore arvoreAtual = App.arvores.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Espécie: " + arvoreAtual.getEspecie() + "|");
        }
        System.out.println("Escolha uma opção: ");
        opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Arvore arvoreEscolhida = App.arvores.get(opcaoEscolhida);
        manutencao.setArvore(arvoreEscolhida);

        App.manuntencaos.add(manutencao);
        System.out.println("Manunteção cadastrada com sucesso!");
    }

}
