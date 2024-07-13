package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.modelos.Aluno;
import main.java.com.biblioteca.Controle.App;;

public class CadAluno {
    Scanner sc = new Scanner(System.in);

    public void cadastrarAluno() {
        Aluno aluno = new Aluno();
        System.out.println("Qual o nome do aluno: ");
        aluno.setNomePessoa(sc.nextLine());
        System.out.println("Qual o sobrenome do aluno: ");
        aluno.setSobrenomePessoa(sc.nextLine());
        System.out.println("Qual o email do aluno: ");
        aluno.setEmail(sc.nextLine());
        System.out.println("Qual o código RA(Registro de Acadêmico) do aluno:  ");
        aluno.setcodigoAluno(sc.nextLine());
        App.alunos.add(aluno);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
