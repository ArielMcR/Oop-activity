package main.java.com.voos.utils.cadastro;

import java.util.Scanner;

import main.java.com.voos.Controle.App;
import main.java.com.voos.modelos.Servico;

public class CadServico {
    Scanner sc = new Scanner(System.in);

    public void cadastrarServico() {
        Servico servico = new Servico();
        System.out.println("Qual o tipo de serviço ? ");
        servico.setTipo(sc.nextLine());
        System.out.println("Descrição do serviço: ");
        servico.setDescricao(sc.nextLine());
        System.out.println("Qual o preço desse serviço ? ");
        servico.setPreco(sc.nextFloat());
        App.servicos.add(servico);
        System.out.println("Serviço: " + servico.getTipo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
