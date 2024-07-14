package main.java.com.biblioteca.utils.cadastro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.biblioteca.Controle.App;
import main.java.com.biblioteca.modelos.Voo;

public class CadVoo {
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void cadastrarVoo() {
        Voo voo = new Voo();
        System.out.println("Qual o código do voo ?  ");
        voo.setCodigo_do_Voo(sc.nextLine());
        System.out.println("Qual a companhia area ? ");
        voo.setCompanhia_aerea(sc.nextLine());
        System.out.println("Qual o valor da passagem: ");
        voo.setPreco_passagem(sc.nextFloat());
        System.out.println("Qual a data e hora de saida ?(HH:MM DD/MM/YYYY)");
        sc.nextLine();
        String data_saida = sc.nextLine();
        try {
            LocalDateTime hora_de_partida = LocalDateTime.parse(data_saida, formatter);
            voo.setHora_de_partida(hora_de_partida);
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("Erro:");
            System.out.println("Digite uma data válida, ex: 14:20 20/06/2004");
            System.out.println("\n");
            // N é a melhor forma de fazer isso !!!
            System.out.println("Qual a data e hora de saida ?(HH:MM DD/MM/YYYY)");
            sc.nextLine();
            data_saida = sc.nextLine();
            LocalDateTime hora_de_partida = LocalDateTime.parse(data_saida, formatter);
            voo.setHora_de_partida(hora_de_partida);
        }

        System.out.println("Qual a data e hora de chegada ?(HH:MM DD/MM/YYYY)");
        String data_chegada = sc.nextLine();

        LocalDateTime hora_de_chegada = LocalDateTime.parse(data_chegada, formatter);
        voo.setHora_de_chegada(hora_de_chegada);

        System.out.println("Digite a cidade de saída: ");
        voo.setCidade_saida(sc.nextLine());

        System.out.println("Digite a cidade de chegada: ");
        voo.setCidade_chegada(sc.nextLine());

        App.voos.add(voo);
        System.out.println("Voo: " + voo.getCodigo_do_Voo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
