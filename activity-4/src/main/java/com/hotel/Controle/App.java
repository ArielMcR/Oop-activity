package main.java.com.hotel.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.hotel.modelos.*;
import main.java.com.hotel.utils.*;

public class App {
    public static ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
    public static ArrayList<Quarto> quartos = new ArrayList<Quarto>();
    public static ArrayList<Reserva_quarto> reserva_Quartos = new ArrayList<Reserva_quarto>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static ArrayList<Servico> servicos = new ArrayList<Servico>();

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
