package main.java.com.rede_social.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.rede_social.modelos.*;
import main.java.com.rede_social.utils.*;

public class App {

    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<Postagem> postagens = new ArrayList<Postagem>();
    public static ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
    public static ArrayList<Grupo> grupos = new ArrayList<Grupo>();
    public static ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

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
