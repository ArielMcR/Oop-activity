package main.java.com.loja.utils.cadastro;

import java.time.LocalDateTime;
import java.util.Scanner;

import main.java.com.loja.Controle.App;
import main.java.com.loja.modelos.Comentario;
import main.java.com.loja.modelos.Usuario;

public class CadComentario {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarComentario() {
        Comentario comentario = new Comentario();
        System.out.println("Conteúdo do Comentário:");
        comentario.setConteudo(sc.nextLine());
        comentario.setDataHora(LocalDateTime.now());

        System.out.println("Escolha o autor do comentário, nota-se que ele tem que ser cadastrado antes");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado, por favor cadastrar na primeira opção do menu");
            return;
        }
        for (int i = 0; i < App.usuarios.size(); i++) {
            Usuario usuarioAtual = App.usuarios.get(i);
            System.out.println("| Opção " + i + " - Nome: " + usuarioAtual.getNome() + ", sobrenome: "
                    + usuarioAtual.getSobrenome() + " |");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Usuario usuarioEscolhido = App.usuarios.get(opcaoEscolhida);
        comentario.setAutor(usuarioEscolhido);

        App.comentarios.add(comentario);
        System.out.println("Comentário " + comentario.getConteudo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
