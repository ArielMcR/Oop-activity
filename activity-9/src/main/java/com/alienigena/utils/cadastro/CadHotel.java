package main.java.com.alienigena.utils.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.com.alienigena.modelos.Hotel;
import main.java.com.alienigena.modelos.Turista;
import main.java.com.alienigena.Controle.App;

public class CadHotel {
    public static Scanner sc = new Scanner(System.in);

    public static void cadastrarHotel() {
        Hotel hotel = new Hotel();
        System.out.println("Nome do Hotel:");
        hotel.setNome(sc.nextLine());
        System.out.println("Endereço do Hotel:");
        hotel.setLocal(sc.nextLine());
        System.out.println("Descrição do hotel");
        hotel.setDescricao(sc.nextLine());

        List<Turista> turistasCadastrado = new ArrayList<>();
        System.out.println("Escolha os turistas do hotel, nota-se que eles têm que ser cadastrados antes");
        if (App.turistas.size() == 0) {
            System.out.println("Nenhum turista cadastrado, por favor cadastrar na primeira opção do menu");
            return;
        }

        while (true) {
            for (int i = 0; i < App.turistas.size(); i++) {
                Turista turistaAtual = App.turistas.get(i);
                System.out.println("| Opção " + i + " - Nome: " + turistaAtual.getNome() + ", espécie: "
                        + turistaAtual.getEspecie() + " |");
            }
            System.out.println("Escolha uma opção (ou -1 para finalizar): ");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida == -1) {
                break;
            }
            Turista turistaEscolhido = App.turistas.get(opcaoEscolhida);
            turistasCadastrado.add(turistaEscolhido);
        }
        hotel.setTurista(turistasCadastrado);
        App.hoteis.add(hotel);
        System.out.println("Hotel cadastrado com sucesso!");
    }

}
