package main.java.com.arvore.utils.cadastro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import main.java.com.arvore.Controle.App;
import main.java.com.arvore.modelos.*;

public class CadEvento {

    private static Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public static void cadastrarEvento() {
        Evento evento = new Evento();

        System.out.println("Nome do evento:");
        evento.setNome(sc.nextLine());

        System.out.println("Descrição do evento:");
        evento.setDescricao(sc.nextLine());

        System.out.println("Local do evento:");
        evento.setLocal(sc.nextLine());

        System.out.println("Digite a data e hora do evento, no padrão (HH:mm DD/MM/AAAA)");
        String data_evento = sc.nextLine();
        LocalDateTime data_entrada = LocalDateTime.parse(data_evento, formater);
        evento.setData_evento(data_entrada);

        App.eventos.add(evento);
        System.out
                .println("Evento: " + evento.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
