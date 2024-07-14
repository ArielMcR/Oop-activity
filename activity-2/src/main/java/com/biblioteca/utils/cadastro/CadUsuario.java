package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.modelos.Usuario;
import main.java.com.biblioteca.Controle.App;;

public class CadUsuario {
    Scanner sc = new Scanner(System.in);

    public void cadastrarUsuario() {
        Usuario usuario = new Usuario();
        System.out.println("Qual o nome do usuario: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Qual o sobrenome do usuario: ");
        usuario.setSobrenome(sc.nextLine());
        System.out.println("Qual o passaporte do usuario: ");
        usuario.setPassaporte(sc.nextLine());
        System.out.println("Qual o email do usuario: ");
        usuario.setEmail(sc.nextLine());
        App.usuarios.add(usuario);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
