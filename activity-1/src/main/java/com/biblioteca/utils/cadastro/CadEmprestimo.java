package main.java.com.biblioteca.utils.cadastro;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import main.java.com.biblioteca.modelos.*;
import main.java.com.biblioteca.utils.ExibirMenu;
import main.java.com.biblioteca.Controle.App;;

public class CadEmprestimo {
    Scanner sc = new Scanner(System.in);
    ExibirMenu menu = new ExibirMenu();

    public void cadastroEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();

        System.out.println("--- Escolha o livro para empréstimo ---");
        if (App.livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado, voltado para o menu... \n\n");
            return;
        }
        for (int i = 0; i < App.livros.size(); i++) {
            Livro livroAtual = App.livros.get(i);
            System.out.println("| Opção " + i + " - " + livroAtual.getNomeDoLivro() + " |");
        }
        // Simulação de escolha do livro (substitua com entrada do usuário real)
        int opcaoLivro = sc.nextInt(); // supondo que o usuário escolha uma opção válida
        Livro livroEscolhido = App.livros.get(opcaoLivro);
        emprestimo.setLivro(livroEscolhido);

        // Não sei pq fiz assim, era mais fácil ter feito por pessoa mas é tarde demais
        menu.MenuEmprestimo();
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n\n");
                System.out.println("--- Escolha o professor para o empréstimo ---");
                for (int i = 0; i < App.professores.size(); i++) {
                    Professor professorAtual = App.professores.get(i);
                    System.out.println("| Opção " + i + " - " + professorAtual.getNomePessoa() + " |");
                }

                int opcaoProfessor = sc.nextInt();
                Professor professorEscolhido = App.professores.get(opcaoProfessor);

                emprestimo.setPessoa(professorEscolhido);
                break;
            case 2:
                System.out.println("\n\n");

                System.out.println("--- Escolha o aluno para o empréstimo ---");
                for (int i = 0; i < App.alunos.size(); i++) {
                    Aluno alunoAtual = App.alunos.get(i);
                    System.out.println("| Opção " + i + " - " + alunoAtual.getNomePessoa() + " |");
                }

                int opcaoAluno = sc.nextInt();
                Aluno alunoEscolhido = App.alunos.get(opcaoAluno);

                emprestimo.setPessoa(alunoEscolhido);
                break;
            case 3:
                System.out.println("\n\n");

                System.out.println("--- Escolha o funcionário para o empréstimo ---");
                for (int i = 0; i < App.funcionarios.size(); i++) {
                    Funcionario funcionarioAtual = App.funcionarios.get(i);
                    System.out.println("| Opção " + i + " - " + funcionarioAtual.getNomePessoa() + " |");
                }

                int opcaoFuncionario = sc.nextInt();
                Funcionario funcionarioEscolhido = App.funcionarios.get(opcaoFuncionario);

                emprestimo.setPessoa(funcionarioEscolhido);
                break;
            default:
                System.out.println("\n\n");

                System.out.println(
                        "Opção inválida");
                break;
        }

        App.emprestimos.add(emprestimo);

        System.out.println("\n\n");
        System.out.println("Empréstimo cadastrado com sucesso!");
        
    }

}
