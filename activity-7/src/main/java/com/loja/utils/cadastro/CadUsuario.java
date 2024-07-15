package main.java.com.loja.utils.cadastro;

import java.util.Scanner;

import main.java.com.loja.Controle.App;
import main.java.com.loja.modelos.Usuario;;

// - nome: String
// - sobrenome: String
// - email: String
// - senha: String
// - bio: String

public class CadUsuario {
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarUsuario() {
        Usuario usuario = new Usuario();
        System.out.println("Qual o nome do usuário ?  ");
        usuario.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do usuario ? ");
        usuario.setSobrenome(sc.nextLine());
        System.out.println("Qual o email do usuario ? ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Qual o senha do usuario ? ");
        usuario.setSenha(sc.nextLine());
        System.out.println("Qual o bio do usuario ? ");
        usuario.setBio(sc.nextLine());
        App.usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
