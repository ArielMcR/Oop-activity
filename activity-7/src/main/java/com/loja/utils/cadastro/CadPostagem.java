package main.java.com.loja.utils.cadastro;

import java.util.Scanner;

import main.java.com.loja.Controle.App;
import main.java.com.loja.modelos.Postagem;
import main.java.com.loja.modelos.Usuario;

// - conteudo: String
// - dataHora: LocalDateTime
// - autor: Usuario
// - curtidas: int
public class CadPostagem {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarPostagem() {
        Postagem postagem = new Postagem();
        System.out.println("Conteúdo:");
        postagem.setConteudo(sc.nextLine());
        System.out.println("Quantidade de curtida: ");
        postagem.setCurtidas(sc.nextInt());

        System.out.println("Escolha o usuário da postagem, nota-se que ele tem que ser cadastrado antes");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuarios cadastrado, por favor cadastrar na primeira opção do meu");
            return;
        }
        for (int i = 0; i < App.usuarios.size(); i++) {
            Usuario usuarioAtual = App.usuarios.get(i);
            System.out.println(
                    "| Opção " + (i) + " - Nome: " + usuarioAtual.getNome() +
                            ", sobrenome: " + usuarioAtual.getSobrenome() +

                            "|");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Usuario usuarioEscolhido = App.usuarios.get(opcaoEscolhida);
        postagem.setAutor(usuarioEscolhido);

        App.postagens.add(postagem);
        System.out.println("Postagem " + postagem.getConteudo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
