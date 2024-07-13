package main.java.com.biblioteca.utils.listagem;

import main.java.com.biblioteca.modelos.*;

import java.time.format.DateTimeFormatter;

import main.java.com.biblioteca.Controle.App;

public class Listar {

    public void listarProfessor() {

        if (App.professores.isEmpty()) {
            System.out.println("Não há professores cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Professores -----------|\n");
        for (int i = 0; i < App.professores.size(); i++) {
            Professor professorAtual = App.professores.get(i);
            System.out.println("Nome: " + professorAtual.getNomePessoa());
            System.out.println("Sobrenome: " + professorAtual.getSobrenomePessoa());
            System.out.println("Email: " + professorAtual.getEmail());
            System.out.println("Código: " + professorAtual.getcodigoProfessor());
            System.out.println("\n");
        }
    }

    public void listarAluno() {

        if (App.alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Alunos -----------|\n");
        for (int i = 0; i < App.alunos.size(); i++) {
            Aluno alunoAtual = App.alunos.get(i);
            System.out.println("Nome: " + alunoAtual.getNomePessoa());
            System.out.println("Sobrenome: " + alunoAtual.getSobrenomePessoa());
            System.out.println("Email: " + alunoAtual.getEmail());
            System.out.println("Código: " + alunoAtual.getcodigoAluno());
            System.out.println("\n");
        }
    }

    public void listarLivro() {

        if (App.livros.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Livros -----------|\n");
        for (int i = 0; i < App.livros.size(); i++) {
            Livro livroAtual = App.livros.get(i);
            System.out.println("Nome: " + livroAtual.getNomeDoLivro());
            System.out.println("Autor: " + livroAtual.getNomeDoAutor());
            System.out.println("Categoria: " + livroAtual.getCategoria());
            System.out.println("Editora: " + livroAtual.getEditora());
            System.out.println("\n");
        }
    }

    public void listarFuncionario() {

        if (App.funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.print("|----------- Lista de Funcionários -----------|\n");
        for (int i = 0; i < App.funcionarios.size(); i++) {
            Funcionario funcionarioAtual = App.funcionarios.get(i);
            System.out.println("Nome: " + funcionarioAtual.getNomePessoa());
            System.out.println("Sobrenome: " + funcionarioAtual.getSobrenomePessoa());
            System.out.println("Email: " + funcionarioAtual.getEmail());
            System.out.println("Funcionário: " + funcionarioAtual.getCodigoFuncionario());
            System.out.println("\n");
        }
    }

    public void listarEmprestimos() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.print("|----------- Lista de Empréstimo -----------|\n");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < App.emprestimos.size(); i++) {
            Emprestimo emprestimoAtual = App.emprestimos.get(i);
            String data_de_emprestimo_formatada = emprestimoAtual.getDataDeEmprestimo().format(formatador);
            String data_de_devolucao_formatada = emprestimoAtual.getDataDeDevolucao().format(formatador);
            System.out.println("\n");

            System.out.println("Livro emprestado: " + emprestimoAtual.getLivro().getNomeDoLivro());
            System.out.println("Emprestado para : " + emprestimoAtual.getPessoa().getNomePessoa());
            System.out.println("Data de empréstimo: " + data_de_emprestimo_formatada);
            System.out.println("Data de devolução: " + data_de_devolucao_formatada);
            System.out.println("\n");
        }
    }
}
