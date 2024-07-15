package main.java.com.advocacia.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.advocacia.modelos.*;
import main.java.com.advocacia.utils.*;

public class App {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Advogado> advogados = new ArrayList<Advogado>();
    public static ArrayList<Processo> processos = new ArrayList<Processo>();
    public static ArrayList<Documento> documentos = new ArrayList<Documento>();
    public static ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();

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
