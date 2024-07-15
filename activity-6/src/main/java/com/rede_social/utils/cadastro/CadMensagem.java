package main.java.com.rede_social.utils.cadastro;

import java.util.Scanner;

import main.java.com.rede_social.Controle.App;
import main.java.com.rede_social.modelos.Mensagem;
import main.java.com.rede_social.modelos.Usuario;

public class CadMensagem {
    // - conteudo: String
    // - dataHora: LocalDateTime
    // - remetente: Usuario
    // - destinatario: Usuario
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarMensagem() {
        Mensagem mensagem = new Mensagem();
        System.out.println("Conteúdo:");
        mensagem.setConteudo(sc.nextLine());

        System.out.println("Escolha o usuário remetente, nota-se que ele tem que ser cadastrado antes");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado, por favor cadastrar na primeira opção do meu");
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
        mensagem.setRemetente(usuarioEscolhido);

        System.out.println("Escolha o usuário destinatário, nota-se que ele tem que ser cadastrado antes");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado, por favor cadastrar na primeira opção do meu");
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
        opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Usuario usuarioEscolhidoDestinatario = App.usuarios.get(opcaoEscolhida);
        mensagem.setRemetente(usuarioEscolhidoDestinatario);

        App.mensagens.add(mensagem);
        System.out.println("Mensagem " + mensagem.getConteudo() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
