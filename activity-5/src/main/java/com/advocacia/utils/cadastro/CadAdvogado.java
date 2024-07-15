package main.java.com.advocacia.utils.cadastro;

import java.util.Scanner;

import main.java.com.advocacia.Controle.App;
import main.java.com.advocacia.modelos.Advogado;

/**
 * CadAdvogado
 */
public class CadAdvogado {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarAdvogado() {
        Advogado advogado = new Advogado();
        System.out.println("Qual o nome do advogado ?  ");
        advogado.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do advogado ? ");
        advogado.setSobrenome(sc.nextLine());
        System.out.println("Qual o email do advogado ? ");
        advogado.setEmail(sc.nextLine());
        System.out.println("Qual o oab do advogado ? ");
        advogado.setOab(sc.nextLine());
        System.out.println("Qual o telefone do advogado ? ");
        advogado.setTelefone(sc.nextLine());
        System.out.println("Horas trabalhadas do advogado ? ");
        advogado.setHorasTrabalhadas(sc.nextDouble());
        App.advogados.add(advogado);
        System.out.println("Advogado " + advogado.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}