package main.java.com.academia.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.academia.modelos.*;
import main.java.com.academia.utils.*;

public class App {

    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList<Professor> professores = new ArrayList<Professor>();
    public static ArrayList<PlanoAssinatura> assinaturas = new ArrayList<PlanoAssinatura>();
    public static ArrayList<Aula> aulas = new ArrayList<Aula>();

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

        } while (opc != 6);
        sc.close();
    }
}
