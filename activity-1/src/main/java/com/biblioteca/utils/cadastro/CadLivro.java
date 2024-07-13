package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;

import main.java.com.biblioteca.modelos.Livro;
import main.java.com.biblioteca.Controle.App;;

public class CadLivro {
    Scanner sc = new Scanner(System.in);

    public void cadastrarLivro() {
        Livro livro = new Livro();
        System.out.println("Qual o nome do livro: ");
        livro.setNomeDoLivro(sc.nextLine());
        System.out.println("Qual o nome do autor: ");
        livro.setNomeDoAutor(sc.nextLine());
        System.out.println("Qual a categoria do livro: ");
        livro.setCategoria(sc.nextLine());
        System.out.println("Qual a editora do livro: ");
        livro.setEditora(sc.nextLine());
        App.livros.add(livro);
        System.out.println("Cadastrado com Sucesso!!!");
        System.out.println("\n\n");

    }
}
