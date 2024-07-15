
package main.java.com.academia.utils.cadastro;

import java.time.LocalDateTime;
import java.util.Scanner;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.Aluno;

public class CadProfessor {

    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarProfessor() {
        Aluno aluno = new Aluno();

        System.out.println("Nome:");
        aluno.setNome(sc.nextLine());

        System.out.println("Sobrenome:");
        aluno.setSobrenome(sc.nextLine());

        System.out.println("CPF:");
        aluno.setCPF(sc.nextLine());

        System.out.println("Endereço:");
        aluno.setEndereco(sc.nextLine());

        System.out.println("Telefone:");
        aluno.setTelefone(sc.nextLine());

        System.out.println("E-mail:");
        aluno.setEmail(sc.nextLine());

        App.alunos.add(aluno);
        System.out
                .println("Usuário " + aluno.getNome() + " " + aluno.getSobrenome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
