package main.java.com.hotel.utils.cadastro;

import java.util.Scanner;

import main.java.com.hotel.Controle.App;
import main.java.com.hotel.modelos.Servico;

public class CadServico {
    Scanner sc = new Scanner(System.in);

    public void cadastrarServico() {
        Servico servico = new Servico();
        System.out.println("Qual o tipo de serviço ? ");
        servico.setNome(sc.nextLine());
        System.out.println("Descrição do serviço: ");
        servico.setDescricao(sc.nextLine());
        System.out.println("Qual o preço desse serviço ? ");
        servico.setValor(sc.nextFloat());
        App.servicos.add(servico);
        System.out.println("Serviço: " + servico.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
