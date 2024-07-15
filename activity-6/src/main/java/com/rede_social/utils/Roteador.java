package main.java.com.rede_social.utils;

import main.java.com.rede_social.utils.cadastro.*;
import main.java.com.rede_social.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.rede_social.utils.listagem.Listar;

public class Roteador {

    CadUsuario usuario = new CadUsuario();
    CadPostagem postagem = new CadPostagem();
    CadMensagem mensagem = new CadMensagem();
    CadGrupo grupo = new CadGrupo();
    CadComentario comentario = new CadComentario();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                usuario.cadastrarUsuario();
                break;

            case 2:
                postagem.cadastrarPostagem();
                break;
            case 3:
                mensagem.cadastrarMensagem();
                break;
            case 4:
                grupo.cadastrarGrupo();
                break;

            case 5:
                comentario.cadastrarComentario();
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
                listar.listarUsuarios();
                break;

            case 2:
                listar.listarPostagens();
                break;
            case 3:
                listar.listarMensagens();
                break;
            case 4:
                listar.listarGrupos();
                break;
            case 5:
                listar.listarComentarios();
                break;
            default:
                break;
        }
    }
}
