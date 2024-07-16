package main.java.com.alienigena.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.alienigena.modelos.*;
import main.java.com.alienigena.utils.*;

public class App {
    public static ArrayList<Turista> turistas = new ArrayList<Turista>();
    public static ArrayList<Viagem> viagens = new ArrayList<Viagem>();
    public static ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
    public static ArrayList<Especie> especies = new ArrayList<Especie>();
    public static ArrayList<PontoTuristico> pontoTuristicos = new ArrayList<PontoTuristico>();

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
