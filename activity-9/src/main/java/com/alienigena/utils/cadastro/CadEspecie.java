package main.java.com.alienigena.utils.cadastro;

import java.util.Scanner;

import main.java.com.alienigena.Controle.App;
import main.java.com.alienigena.modelos.Especie;

public class CadEspecie {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarEspecie() {
        Especie especie = new Especie();
        System.out.println("Qual o nome da especie ?  ");
        especie.setNome(sc.nextLine());
        System.out.println("Qual a descrição da ? ");
        especie.setDescricao(sc.nextLine());

        App.especies.add(especie);
        System.out.println("Especie " + especie.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
