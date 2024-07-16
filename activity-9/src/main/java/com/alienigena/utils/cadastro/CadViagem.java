package main.java.com.alienigena.utils.cadastro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.alienigena.Controle.App;
import main.java.com.alienigena.modelos.Turista;
import main.java.com.alienigena.modelos.Viagem;

public class CadViagem {
    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    public static Scanner sc = new Scanner(System.in);

    public static void cadastrarViagem() {
        Viagem viagem = new Viagem();
        System.out.println("Digite a data de saida da viagem, no padrão (HH:mm DD/MM/AAAA)");
        String data_abertura = sc.nextLine();
        LocalDateTime data_entrada = LocalDateTime.parse(data_abertura, formater);
        viagem.setData_saida(data_entrada);
        System.out.println("Digite a data de chegada da viagem, no padrão (HH:mm DD/MM/AAAA)");
        String data_fechamento = sc.nextLine();
        LocalDateTime data_saida = LocalDateTime.parse(data_fechamento, formater);
        viagem.setData_chegada(data_saida);

        System.out.println("De qual é o turista da viagem ? Ela precisa já estar cadastrada");
        if (App.turistas.size() == 0) {
            System.out.println("Nenhum turista cadastrado voltado para o menu");
            return;
        }
        for (int i = 0; i < App.turistas.size(); i++) {
            Turista turistaAtual = App.turistas.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + turistaAtual.getNome() +
                            ", Espécie: " + turistaAtual.getEspecie() +
                            "|");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Turista turistaEscolhido = App.turistas.get(opcaoEscolhida);
        viagem.setTurista(turistaEscolhido);
        App.viagens.add(viagem);
        System.out.println("Viagem cadastrada com Sucesso!!!");
    }
}
