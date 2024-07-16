package main.java.com.alienigena.utils.gerarRelatorio;

import java.util.Scanner;

import main.java.com.alienigena.utils.ExibirMenu;
import main.java.com.alienigena.utils.Roteador;

public class GerarRelatorio {
    public static void gerarRelatorio() {
        int opcaoRelatorio = 0;
        ExibirMenu menu = new ExibirMenu();
        Roteador roteador = new Roteador();
        Scanner sc = new Scanner(System.in);
        do {
            menu.MenuRelatorio();
            opcaoRelatorio = sc.nextInt();
            sc.nextLine();
            roteador.roteadorRelatorio(opcaoRelatorio);

        } while (opcaoRelatorio != 6);
    }
}
