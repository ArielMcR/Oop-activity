package main.java.com.biblioteca.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.biblioteca.modelos.*;
import main.java.com.biblioteca.utils.*;

public class App {
    public static ArrayList<Professor> professores = new ArrayList<Professor>();
    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList<Livro> livros = new ArrayList<Livro>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public static void main(String[] args) throws Exception {
        int opc = 0;
        ExibirMenu menu = new ExibirMenu();
        Roteador roteador = new Roteador();
        Scanner sc = new Scanner(System.in);
        do {
            menu.menu();
            opc = sc.nextInt();
            sc.nextLine();
            roteador.roteadorGeral(opc);

        } while (opc != 7);
        sc.close();
    }
}
