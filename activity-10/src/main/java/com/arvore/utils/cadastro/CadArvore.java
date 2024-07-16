package main.java.com.arvore.utils.cadastro;

import java.util.Scanner;

import main.java.com.arvore.Controle.App;
import main.java.com.arvore.modelos.*;

public class CadArvore {

    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarArvore() {
        Arvore arvore = new Arvore();

        System.out.println("Especie da árvore:");
        arvore.setEspecie(sc.nextLine());

        System.out.println("Localização da árvore:");
        arvore.setLocalizacao(sc.nextLine());

        System.out.println("Digite o estado de saúde da árvore:");
        arvore.setEstado_saude(sc.nextLine());

        System.out.println("Digite a altura da árvore:");
        arvore.setAltura(sc.nextFloat());

        App.arvores.add(arvore);
        System.out
                .println("Árvore " + arvore.getEspecie() + " Cadastrada com Sucesso!!!");
        System.out.println("\n\n");
    }
}
