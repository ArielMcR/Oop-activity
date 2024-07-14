package main.java.com.hotel.utils.cadastro;

import java.util.Scanner;

import main.java.com.hotel.modelos.Funcionario;
import main.java.com.hotel.Controle.App;

public class CadFuncionario {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        System.out.println("Qual o nome do funcionario ?  ");
        funcionario.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do funcionario ? ");
        funcionario.setSobrenome(sc.nextLine());
        System.out.println("Qual o cpf do funcionario ? ");
        funcionario.setCPF(sc.nextLine());
        System.out.println("Qual o endereço do funcionario ? ");
        funcionario.setEndereco(sc.nextLine());
        App.funcionarios.add(funcionario);
        System.out.println("funcionario " + funcionario.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
