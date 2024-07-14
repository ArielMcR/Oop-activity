package main.java.com.biblioteca.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.biblioteca.modelos.*;
import main.java.com.biblioteca.utils.*;

public class App {

    public static ArrayList<Voo> voos = new ArrayList<Voo>();
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<Servico> servicos = new ArrayList<Servico>();
    public static ArrayList<Assento> assentos = new ArrayList<Assento>();
    public static ArrayList<Reserva_Voo> reserva_Voos = new ArrayList<Reserva_Voo>();

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
