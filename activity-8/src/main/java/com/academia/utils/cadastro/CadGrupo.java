package main.java.com.academia.utils.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.Grupo;
import main.java.com.academia.modelos.Usuario;

public class CadGrupo {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarGrupo() {
        Grupo grupo = new Grupo();
        System.out.println("Nome do Grupo:");
        grupo.setNome(sc.nextLine());

        System.out.println("Descrição do Grupo:");
        grupo.setDescricao(sc.nextLine());

        List<Usuario> membros = new ArrayList<>();
        System.out.println("Escolha os membros do grupo, nota-se que eles têm que ser cadastrados antes");
        if (App.usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado, por favor cadastrar na primeira opção do menu");
            return;
        }

        while (true) {
            for (int i = 0; i < App.usuarios.size(); i++) {
                Usuario usuarioAtual = App.usuarios.get(i);
                System.out.println("| Opção " + i + " - Nome: " + usuarioAtual.getNome() + ", sobrenome: "
                        + usuarioAtual.getSobrenome() + " |");
            }
            System.out.println("Escolha uma opção (ou -1 para finalizar): ");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida == -1) {
                break;
            }
            Usuario usuarioEscolhido = App.usuarios.get(opcaoEscolhida);
            membros.add(usuarioEscolhido);
        }

        grupo.setMembros(membros);
        App.grupos.add(grupo);
        System.out.println("Grupo " + grupo.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
