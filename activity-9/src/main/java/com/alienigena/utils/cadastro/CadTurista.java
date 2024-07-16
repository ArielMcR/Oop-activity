package main.java.com.alienigena.utils.cadastro;

import java.util.Scanner;

import main.java.com.alienigena.modelos.*;
import main.java.com.alienigena.Controle.App;

public class CadTurista {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarHospede() {
        Turista turista = new Turista();
        System.out.println("Qual o nome do turista ?  ");
        turista.setNome(sc.nextLine());
        System.out.println("Qual o registro planetário do turista ? ");
        turista.setResgistroPlanetario(sc.nextLine());
        System.out.println("De qual espécie é o turista ? Ela precisa já estar cadastrada");
        if (App.especies.size() == 0) {
            System.out.println("Nenhum espécie cadastrada voltado para o menu");
            return;
        }
        for (int i = 0; i < App.especies.size(); i++) {
            Especie especieAtual = App.especies.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + especieAtual.getNome() +
                            ", Descrição: " + especieAtual.getDescricao() +
                            "|");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Especie especieEscolhida = App.especies.get(opcaoEscolhida);
        turista.setEspecie(especieEscolhida);
        App.turistas.add(turista);
        System.out.println("turista " + turista.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
