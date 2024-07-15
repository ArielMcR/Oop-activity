package main.java.com.advocacia.utils.cadastro;

import java.util.Scanner;

import main.java.com.advocacia.Controle.App;
import main.java.com.advocacia.modelos.*;

public class CadCliente {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Qual o nome do cliente ?  ");
        cliente.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do cliente ? ");
        cliente.setSobrenome(sc.nextLine());
        System.out.println("Qual o cpf do cliente ? ");
        cliente.setCpf(sc.nextLine());
        System.out.println("Qual o endereço do cliente ? ");
        cliente.setEndereco(sc.nextLine());
        System.out.println("Qual o telefone do cliente ? ");
        cliente.setTelefone(sc.nextLine());
        System.out.println("Qual o email do cliente ? ");
        cliente.setEmail(sc.nextLine());
        App.clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
