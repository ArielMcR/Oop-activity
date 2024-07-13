package main.java.com.biblioteca.utils;

import main.java.com.biblioteca.utils.cadastro.*;
import main.java.com.biblioteca.utils.gerarRelatorio.*;
import main.java.com.biblioteca.utils.listagem.Listar;

public class Roteador {
    CadProfessor professor = new CadProfessor();
    CadAluno aluno = new CadAluno();
    CadLivro livro = new CadLivro();
    CadFuncionario funcionario = new CadFuncionario();
    CadEmprestimo emprestimo = new CadEmprestimo();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                professor.cadastrarProfessor();
                break;

            case 2:
                aluno.cadastrarAluno();
                break;
            case 3:
                funcionario.cadastrarFuncionario();
                break;
            case 4:
                livro.cadastrarLivro();
                break;

            case 5:
                emprestimo.cadastroEmprestimo();
                break;

            case 6:
                relatorio.gerarRelatorio();
                break;

            default:
                break;
        }
    }

    public void roteadorRelatorio(int opcao) {
        switch (opcao) {
            case 1:
                listar.listarProfessor();
                break;

            case 2:
                listar.listarAluno();
                break;
            case 3:
                listar.listarFuncionario();
                break;
            case 4:
                listar.listarLivro();
                break;
            case 5:
                listar.listarEmprestimos();
                break;
            default:
                break;
        }
    }
}
