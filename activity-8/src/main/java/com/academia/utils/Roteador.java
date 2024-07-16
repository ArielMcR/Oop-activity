package main.java.com.academia.utils;

import main.java.com.academia.utils.cadastro.*;
import main.java.com.academia.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.academia.utils.listagem.Listar;

public class Roteador {

    CadAluno aluno = new CadAluno(); //
    CadProfessor professor = new CadProfessor(); // Adicionar outros cadastros
    CaDPlanoAssinatura assinatura = new CaDPlanoAssinatura();
    CadAula aula = new CadAula();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                aluno.cadastrarAluno();
                break;

            case 2:
                professor.cadastrarProfessor();
                break;
            case 3:
                assinatura.cadastrarPlano();
                break;
            case 4:
                aula.cadastrarAula();
                break;

            case 5:
                relatorio.gerarRelatorio();
                break;

            default:
                break;
        }
    }

    public void roteadorRelatorio(int opcao) {
        switch (opcao) {
            case 1:
                listar.listarAlunos();
                break;

            case 2:
                listar.listarProfessor();
                break;
            case 3:
                listar.listarAssinaturas();
                break;
            case 4:
                listar.listarAulas();
                break;
            default:
                break;
        }
    }
}
