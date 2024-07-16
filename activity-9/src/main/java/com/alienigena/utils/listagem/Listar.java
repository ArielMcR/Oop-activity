package main.java.com.alienigena.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.alienigena.Controle.App;
import main.java.com.alienigena.modelos.*;

public class Listar {
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void listarTurista() {

        if (App.turistas.isEmpty()) {
            System.out.println("Não há turistas cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de turistas cadastrados -----------|\n");
        for (int i = 0; i < App.turistas.size(); i++) {
            Turista turistaAtual = App.turistas.get(i);
            System.out.println("Nome: " + turistaAtual.getNome());
            System.out.println("Registro planetário: " + turistaAtual.getresgistroPlanetario());
            System.out.println("Especie: " + turistaAtual.getEspecie());
            System.out.println("\n");
        }
    }

    public void listarEspecie() {

        if (App.especies.isEmpty()) {
            System.out.println("Não há especies cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Espécies cadastradas -----------|\n");
        for (int i = 0; i < App.especies.size(); i++) {
            Especie especieAtual = App.especies.get(i);
            System.out.println("Nome: " + especieAtual.getNome());
            System.out.println("Descrição: " + especieAtual.getDescricao());

            System.out.println("\n");
        }
    }

    public void listarPontoTuristico() {

        if (App.pontoTuristicos.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de funcionários cadastrados -----------|\n");
        for (int i = 0; i < App.pontoTuristicos.size(); i++) {
            PontoTuristico pontoTuristicoAtual = App.pontoTuristicos.get(i);
            System.out.println("Nome: " + pontoTuristicoAtual.getNome());
            System.out.println("Local: " + pontoTuristicoAtual.getLocal());
            System.out.println("Url da Imagem: " + pontoTuristicoAtual.getImagem());

            System.out.println("\n");
        }
    }

    public void listarHotel() {

        if (App.hoteis.isEmpty()) {
            System.out.println("Não há hoteis cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Hoteis Cadastrados -----------|\n");
        for (int i = 0; i < App.hoteis.size(); i++) {
            Hotel hotelatual = App.hoteis.get(i);
            System.out.println("Nome: " + hotelatual.getNome());
            System.out.println("Descrição: " + hotelatual.getDescricao());
            System.out.println("Local: " + hotelatual.getLocal());
            System.out.println("Turistas: ");
            for (Turista turista : hotelatual.getTurista()) {
                System.out.println(turista.getNome());
            }
            System.out.println("\n");
        }
    }

    public void listarViagem() {
        if (App.viagens.isEmpty()) {
            System.out.println("Não há viagens cadastradas.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de Viagens cadastradas -----------|\n");
        for (int i = 0; i < App.viagens.size(); i++) {
            Viagem viagem = App.viagens.get(i);
            System.out.println("Check-in: " + viagem.getData_saida().format(formatadorHora));
            System.out.println("Check-out: " + viagem.getData_chegada().format(formatadorHora));
            System.out.println("Turista: " + viagem.getTurista().getNome());

            System.out.println("\n");
        }
    }
}
