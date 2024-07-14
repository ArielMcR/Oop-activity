package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.Controle.App;
import main.java.com.biblioteca.modelos.Assento;

public class CadAssento {
    Scanner sc = new Scanner(System.in);

    public void cadastrarAssento() {
        Assento assento = new Assento();
        System.out.println("Qual o numero do assento: ");
        assento.setNumero(sc.nextInt());
        App.assentos.add(assento);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
