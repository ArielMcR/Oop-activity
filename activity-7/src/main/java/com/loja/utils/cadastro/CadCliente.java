package main.java.com.loja.utils.cadastro;

import java.util.Scanner;

import main.java.com.loja.Controle.App;
import main.java.com.loja.modelos.Cliente;

public class CadCliente {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Cadastro de Cliente");
        System.out.println("===================");

        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());

        System.out.print("Sobrenome: ");
        cliente.setSobrenome(sc.nextLine());

        System.out.print("CPF: ");
        cliente.setCPF(sc.nextLine());

        System.out.print("Endereço: ");
        cliente.setEndereco(sc.nextLine());

        System.out.print("Telefone: ");
        cliente.setSobrenome(sc.nextLine());

        System.out.print("Email: ");
        cliente.setEmail(sc.nextLine());

        App.clientes.add(cliente);

        System.out.println("\nCliente cadastrado com sucesso!");
        System.out.println("===============================");
        System.out.println();
    }
}
