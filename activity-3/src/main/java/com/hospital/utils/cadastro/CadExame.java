
package main.java.com.hospital.utils.cadastro;

import main.java.com.hospital.modelos.*;
import main.java.com.hospital.Controle.App;

import java.util.Scanner;

public class CadExame {

    public static void cadastrarExame() {
        Scanner sc = new Scanner(System.in);
        Exame exame = new Exame();
        System.out.println("Qual o nome do exame ?  ");
        exame.setNome(sc.nextLine());
        System.out.println("Descrição do exame:");
        exame.setDescricao(sc.nextLine());
        App.exames.add(exame);
        System.out.println("Exame " + exame.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
