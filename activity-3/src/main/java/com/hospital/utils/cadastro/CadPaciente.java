package main.java.com.hospital.utils.cadastro;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

import java.util.Scanner;

public class CadPaciente {

    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarPaciente() {
        Paciente paciente = new Paciente();
        System.out.println("Qual o nome do paciente ?  ");
        paciente.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do paciente ? ");
        paciente.setSobrenome(sc.nextLine());
        System.out.println("Qual o cpf do paciente ? ");
        paciente.setCPF(sc.nextLine());
        System.out.println("Qual o endereço do paciente ? ");
        paciente.setEndereco(sc.nextLine());
        System.out.println("Qual a alergia do paciente ?(Em caso de não ocorrência, colocar nenhuma!) ");
        paciente.setAlergia(sc.nextLine());
        App.pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
