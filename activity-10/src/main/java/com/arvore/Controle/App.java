package main.java.com.arvore.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.arvore.modelos.*;
import main.java.com.arvore.utils.*;

public class App {

    public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static ArrayList<Arvore> arvores = new ArrayList<Arvore>();
    public static ArrayList<Evento> eventos = new ArrayList<Evento>();
    public static ArrayList<Adocao> adocoes = new ArrayList<Adocao>();
    public static ArrayList<Manutencao> manuntencaos = new ArrayList<Manutencao>();

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
