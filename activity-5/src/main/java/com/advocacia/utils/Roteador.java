package main.java.com.advocacia.utils;

import main.java.com.advocacia.utils.cadastro.*;
import main.java.com.advocacia.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.advocacia.utils.listagem.Listar;

public class Roteador {

    CadCliente cliente = new CadCliente();
    CadAdvogado advogado = new CadAdvogado();
    CadCompromisso compromisso = new CadCompromisso();
    CadDocumento documento = new CadDocumento();
    CadProcesso processo = new CadProcesso();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                cliente.cadastrarCliente();
                break;

            case 2:
                advogado.cadastrarAdvogado();
                break;
            case 3:
                compromisso.cadastrarCompromisso();
                break;
            case 4:
                documento.cadastrarDocumento();
                break;

            case 5:
                processo.cadastrarProcesso();
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
                listar.listarCliente();
                break;

            case 2:
                listar.listarAdvogado();
                break;
            case 3:
                listar.listarCompromisso();
                break;
            case 4:
                listar.listarDocumentos();
                break;
            case 5:
                listar.listarProcessos();
                break;
            default:
                break;
        }
    }
}
