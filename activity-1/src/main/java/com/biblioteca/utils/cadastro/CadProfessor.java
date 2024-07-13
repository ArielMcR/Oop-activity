package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.modelos.Professor;
import main.java.com.biblioteca.Controle.App;;

public class CadProfessor {
    Scanner sc = new Scanner(System.in);

    public void cadastrarProfessor() {
        Professor professor = new Professor();
        System.out.println("Qual o nome do professor: ");
        professor.setNomePessoa(sc.nextLine());
        System.out.println("Qual o sobrenome do professor: ");
        professor.setSobrenomePessoa(sc.nextLine());
        System.out.println("Qual o email do professor: ");
        professor.setEmail(sc.nextLine());
        System.out.println("Qual o código RD(Registro de Docente) do professor:  ");
        professor.setcodigoProfessor(sc.nextLine());
        App.professores.add(professor);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
