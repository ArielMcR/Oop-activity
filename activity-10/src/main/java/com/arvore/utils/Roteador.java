package main.java.com.arvore.utils;

import main.java.com.arvore.utils.cadastro.*;
import main.java.com.arvore.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.arvore.utils.listagem.Listar;

public class Roteador {

    CadPessoa pessoa = new CadPessoa();
    CadArvore arvore = new CadArvore();
    CadEvento evento = new CadEvento();
    CadAdocao adocao = new CadAdocao();
    CadManuntecao manutencao = new CadManuntecao();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                pessoa.cadastrarPessoa();
                break;

            case 2:
                arvore.cadastrarArvore();
                break;
            case 3:
                evento.cadastrarEvento();
                break;
            case 4:
                adocao.cadastrarAdocao();
                break;

            case 5:
                manutencao.cadastarManutencao();
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
                listar.listarPessoa();
                ;
                break;

            case 2:
                listar.listarArvore();
                break;
            case 3:
                listar.listarEvento();
                break;
            case 4:
                listar.listarAdocao();
                break;
            case 5:
                listar.listarManuntecao();
                break;
            default:
                break;
        }
    }
}
