package main.java.com.academia.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.Comentario;
import main.java.com.academia.modelos.Grupo;
import main.java.com.academia.modelos.Mensagem;
import main.java.com.academia.modelos.Postagem;
import main.java.com.academia.modelos.Usuario;

public class Listar {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void listarUsuarios() {
        if (App.usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de usuários cadastrados -----------|");
        for (int i = 0; i < App.usuarios.size(); i++) {
            Usuario usuarioAtual = App.usuarios.get(i);
            System.out.println("Nome: " + usuarioAtual.getNome());
            System.out.println("Sobrenome: " + usuarioAtual.getSobrenome());
            System.out.println("Email: " + usuarioAtual.getEmail());
            System.out.println("Bio: " + usuarioAtual.getBio());
            System.out.println("\n");
        }
    }

    public void listarPostagens() {
        if (App.postagens.isEmpty()) {
            System.out.println("Não há postagens cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de postagens cadastradas -----------|");
        for (int i = 0; i < App.postagens.size(); i++) {
            Postagem postagemAtual = App.postagens.get(i);
            System.out.println("Conteúdo: " + postagemAtual.getConteudo());
            System.out.println("Data e hora: " + postagemAtual.getDataHora().format(formatadorHora));
            System.out.println(
                    "Autor: " + postagemAtual.getAutor().getNome() + " " + postagemAtual.getAutor().getSobrenome());
            System.out.println("Curtidas: " + postagemAtual.getCurtidas());
            System.out.println("\n");
        }
    }

    public void listarComentarios() {
        if (App.comentarios.isEmpty()) {
            System.out.println("Não há comentários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de comentários cadastrados -----------|");
        for (int i = 0; i < App.comentarios.size(); i++) {
            Comentario comentarioAtual = App.comentarios.get(i);
            System.out.println("Conteúdo: " + comentarioAtual.getConteudo());
            System.out.println("Data e hora: " + comentarioAtual.getDataHora().format(formatadorHora));
            System.out.println(
                    "Autor: " + comentarioAtual.getAutor().getNome() + " " + comentarioAtual.getAutor().getSobrenome());
            System.out.println("\n");
        }
    }

    public void listarMensagens() {
        if (App.mensagens.isEmpty()) {
            System.out.println("Não há mensagens cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de mensagens cadastradas -----------|");
        for (int i = 0; i < App.mensagens.size(); i++) {
            Mensagem mensagemAtual = App.mensagens.get(i);
            System.out.println("Conteúdo: " + mensagemAtual.getConteudo());
            System.out.println("Data e hora: " + mensagemAtual.getDataHora().format(formatadorHora));
            System.out.println("Remetente: " + mensagemAtual.getRemetente().getNome() + " "
                    + mensagemAtual.getRemetente().getSobrenome());

            System.out.println("\n");
        }
    }

    public void listarGrupos() {
        if (App.grupos.isEmpty()) {
            System.out.println("Não há grupos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de grupos cadastrados -----------|");
        for (int i = 0; i < App.grupos.size(); i++) {
            Grupo grupoAtual = App.grupos.get(i);
            System.out.println("Nome: " + grupoAtual.getNome());
            System.out.println("Descrição: " + grupoAtual.getDescricao());
            System.out.println("Membros: ");
            for (Usuario membro : grupoAtual.getMembros()) {
                System.out.println("- " + membro.getNome() + " " + membro.getSobrenome());
            }
        }
    }
}
