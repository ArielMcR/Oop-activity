package main.java.com.arvore.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.arvore.Controle.App;
import main.java.com.arvore.modelos.*;

public class Listar {
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void listarPessoa() {

        if (App.pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Pessoas cadastrados -----------|\n");
        for (int i = 0; i < App.pessoas.size(); i++) {
            Pessoa pessoaAtual = App.pessoas.get(i);
            System.out.println("Nome: " + pessoaAtual.getNome());
            System.out.println("Sobrenome: " + pessoaAtual.getSobrenome());
            System.out.println("CPF: " + pessoaAtual.getCPF());
            System.out.println("Endereço: " + pessoaAtual.getEndereco());
            System.out.println("\n");
        }
    }

    public void listarArvore() {

        if (App.arvores.isEmpty()) {
            System.out.println("Não há arvores cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Árvores cadastrados -----------|\n");
        for (int i = 0; i < App.arvores.size(); i++) {
            Arvore arvoreAtual = App.arvores.get(i);
            System.out.println("Espécie: " + arvoreAtual.getEspecie());
            System.out.println("Localização: " + arvoreAtual.getLocalizacao());
            System.out.println("Estado de saúde: " + arvoreAtual.getEstado_saude());
            System.out.println("Altura: " + arvoreAtual.getAltura());
            System.out.println("\n");
        }
    }

    public void listarEvento() {

        if (App.eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Eventos cadastrados -----------|\n");
        for (int i = 0; i < App.eventos.size(); i++) {
            Evento evento = App.eventos.get(i);
            System.out.println("Nome: " + evento.getNome());
            System.out.println("Descrição: " + evento.getDescricao());
            System.out.println("Local: " + evento.getLocal());
            System.out.println("Data e hora: " + evento.getData_evento().format(formatadorHora));

            System.out.println("\n");
        }
    }

    public void listarAdocao() {

        if (App.adocoes.isEmpty()) {
            System.out.println("Não há adoções cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de adoções Agendadas -----------|\n");
        for (int i = 0; i < App.adocoes.size(); i++) {
            Adocao adocaoAtual = App.adocoes.get(i);
            System.out.println("Árvore: " + adocaoAtual.getArvore().getEspecie());
            System.out.println("Usuário: " + adocaoAtual.getUsuario().getNome());
            System.out.println("Data: " + adocaoAtual.getData_adocao().format(formatador));
            System.out.println("\n");
        }
    }

    public void listarManuntecao() {
        if (App.manuntencaos.isEmpty()) {
            System.out.println("Não há manutenções cadastradas.");
            System.out.println("Voltando...");
            return;
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de manutenções Cadastradas -----------|\n");
        for (int i = 0; i < App.manuntencaos.size(); i++) {
            Manutencao manutencaoAtual = App.manuntencaos.get(i);
            System.out.println("Tipo de manutenção: " + manutencaoAtual.getTipo_manutencao());
            System.out.println("Data de manutenção: " + manutencaoAtual.getData_manutencao().format(formatador));
            System.out.println("Árvore:" + manutencaoAtual.getArvore().getEspecie());
            System.out.println("Usuário: " + manutencaoAtual.getUsuario().getNome());
            System.out.println("\n");

            System.out.println("\n");
        }
    }
}
