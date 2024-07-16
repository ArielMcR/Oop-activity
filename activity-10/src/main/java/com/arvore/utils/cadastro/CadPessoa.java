package main.java.com.arvore.utils.cadastro;

import java.util.Scanner;

import main.java.com.arvore.Controle.App;
import main.java.com.arvore.modelos.*;

public class CadPessoa {

    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarPessoa() {
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome:");
        pessoa.setNome(sc.nextLine());

        System.out.println("Sobrenome:");
        pessoa.setSobrenome(sc.nextLine());

        System.out.println("CPF:");
        pessoa.setCPF(sc.nextLine());

        System.out.println("Endereço:");
        pessoa.setEndereco(sc.nextLine());

        System.out.println("Telefone:");
        pessoa.setTelefone(sc.nextLine());

        System.out.println("E-mail:");
        pessoa.setEmail(sc.nextLine());

        App.pessoas.add(pessoa);
        System.out
                .println("Usuário " + pessoa.getNome() + " " + pessoa.getSobrenome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
