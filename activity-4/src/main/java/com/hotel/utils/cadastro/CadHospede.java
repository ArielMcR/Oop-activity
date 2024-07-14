package main.java.com.hotel.utils.cadastro;

import java.util.Scanner;

import main.java.com.hotel.modelos.Hospede;
import main.java.com.hotel.Controle.App;

public class CadHospede {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarHospede() {
        Hospede hospede = new Hospede();
        System.out.println("Qual o nome do hospede ?  ");
        hospede.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do hospede ? ");
        hospede.setSobrenome(sc.nextLine());
        System.out.println("Qual o email do hospede ? ");
        hospede.setEmail(sc.nextLine());
        System.out.println("Qual o telefone do hospede ? ");
        hospede.setTelefone(sc.nextLine());
        App.hospedes.add(hospede);
        System.out.println("hospede " + hospede.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
