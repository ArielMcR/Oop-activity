package main.java.com.alienigena.utils.cadastro;

import java.util.Scanner;

import main.java.com.alienigena.Controle.App;
import main.java.com.alienigena.modelos.PontoTuristico;

public class CadPontoTuristico {
    public static Scanner sc = new Scanner(System.in);

    public static void cadastrarPontoTuristico() {
        PontoTuristico ponto = new PontoTuristico();
        System.out.println("Qual o nome do ponto turístico ? ");
        ponto.setNome(sc.nextLine());
        System.out.println("Qual o local do ponto turístico ? ");
        ponto.setLocal(sc.nextLine());
        System.out.println("Qual o URL da imagem? ");
        ponto.setImagem(sc.nextLine());
        App.pontoTuristicos.add(ponto);
        System.out.println("Ponto turístico " + ponto.getNome() + " Cadastrado com Sucesso!!!");
    }
}
