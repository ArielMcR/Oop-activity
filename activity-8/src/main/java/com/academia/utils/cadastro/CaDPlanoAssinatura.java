package main.java.com.academia.utils.cadastro;
import java.util.Scanner;

import main.java.com.academia.modelos.PlanoAssinatura;
import main.java.com.academia.Controle.App;

public class CaDPlanoAssinatura {
    public static Scanner sc = new Scanner(System.in);
    public static void cadastrarPlano(){
        PlanoAssinatura plano = new PlanoAssinatura();
        System.out.println("Qual o tipo do plano  ?  ");
        plano.setTipo(sc.nextLine());
        System.out.println("Qual o descrição do plano ? ");
        plano.setDescricao(sc.nextLine());
        System.out.println("Qual o valor do plano ? ");
        plano.setValor(sc.nextFloat());
       
        App.assinaturas.add(plano);
        System.out.println("Assinatura " + plano.getTipo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
