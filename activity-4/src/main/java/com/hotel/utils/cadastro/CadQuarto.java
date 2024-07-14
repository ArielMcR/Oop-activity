package main.java.com.hotel.utils.cadastro;

import java.util.Scanner;

import main.java.com.hotel.modelos.Quarto;
import main.java.com.hotel.Controle.App;

public class CadQuarto {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarQuarto() {
        Quarto quarto = new Quarto();
        System.out.println("Qual o número do Quarto ?  ");
        quarto.setNumeroDoQuarto(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o tipo do quarto ?  ");
        quarto.setTipo(sc.nextLine());
        System.out.println("Qual o andar do quarto ? ");
        quarto.setAndar(sc.nextInt());
        System.out.println("Quantas camas o quarto tem ? ");
        quarto.setQuantidadeCamas(sc.nextInt());
        System.out.println("Qual o preço do quarto ? ");
        quarto.setPrecoQuarto(sc.nextFloat());
        sc.nextLine();
        System.out.println("O quarto está disponível ?(S ou N)");
        String escolha = sc.nextLine();
        if (escolha.equalsIgnoreCase("s")) {
            quarto.setDisponivel(true);
        } else {
            quarto.setDisponivel(false);
        }
        App.quartos.add(quarto);
        System.out.println("quarto " + quarto.getTipo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
