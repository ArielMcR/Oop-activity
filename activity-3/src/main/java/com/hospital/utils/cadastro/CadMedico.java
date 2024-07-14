
package main.java.com.hospital.utils.cadastro;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

import java.util.Scanner;

public class CadMedico {

    public static void cadastrarMedico() {
        Scanner sc = new Scanner(System.in);
        Medico medico = new Medico();
        System.out.println("Qual o nome do médico ?  ");
        medico.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do médico ? ");
        medico.setSobrenome(sc.nextLine());
        System.out.println("Qual o cpf do médico ? ");
        medico.setCPF(sc.nextLine());
        System.out.println("Qual o endereço do médico ? ");
        medico.setEndereco(sc.nextLine());
        System.out.println("Qual CRM do médico ?");
        medico.setCrm(sc.nextLine());
        App.medicos.add(medico);
        System.out.println("Médico " + medico.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
