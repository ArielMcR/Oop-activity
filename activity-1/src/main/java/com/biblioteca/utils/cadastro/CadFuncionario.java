package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.modelos.Funcionario;
import main.java.com.biblioteca.Controle.App;;

public class CadFuncionario {
    Scanner sc = new Scanner(System.in);

    public void cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        System.out.println("Qual o nome do funcionário ? ");
        funcionario.setNomePessoa(sc.nextLine());
        System.out.println("Qual o sobrenome do funcionário ? ");
        funcionario.setSobrenomePessoa(sc.nextLine());
        System.out.println("Qual o email do funcionário ? ");
        funcionario.setEmail(sc.nextLine());
        System.out.println("Qual o código RF(Registro de Funcionário) do funcionario:  ");
        funcionario.setCodigoFuncionario(sc.nextLine());
        App.funcionarios.add(funcionario);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
