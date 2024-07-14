package main.java.com.hospital.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.utils.*;

public class App {

    public static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    public static ArrayList<Medico> medicos = new ArrayList<Medico>();
    public static ArrayList<Agendar_consulta> agendar_consultas = new ArrayList<Agendar_consulta>();
    public static ArrayList<Agendar_exame> agendar_exames = new ArrayList<Agendar_exame>();
    public static ArrayList<Exame> exames = new ArrayList<Exame>();

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
