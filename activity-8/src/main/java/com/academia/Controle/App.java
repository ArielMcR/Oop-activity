package main.java.com.academia.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.academia.modelos.*;
import main.java.com.academia.utils.*;
import main.java.com.rede_social.modelos.Comentario;
import main.java.com.rede_social.modelos.Grupo;
import main.java.com.rede_social.modelos.Mensagem;
import main.java.com.rede_social.modelos.Postagem;
import main.java.com.rede_social.modelos.Usuario;
import main.java.com.rede_social.utils.ExibirMenu;
import main.java.com.rede_social.utils.Roteador;

public class App {

    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    public static ArrayList<Professor> professores = new ArrayList<Professor>();
    public static ArrayList<PlanoAssinatura> assinaturas = new ArrayList<PlanoAssinatura>();
    public static ArrayList<Aula> aluas = new ArrayList<Aula>();

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
