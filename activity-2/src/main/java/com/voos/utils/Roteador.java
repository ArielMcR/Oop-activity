package main.java.com.voos.utils;

import main.java.com.voos.utils.cadastro.*;
import main.java.com.voos.utils.gerarRelatorio.*;
import main.java.com.voos.utils.listagem.Listar;

public class Roteador {
    CadUsuario usuario = new CadUsuario();
    CadServico servico = new CadServico();
    CadAssento assento = new CadAssento();
    CadVoo voo = new CadVoo();
    CadReserva_Voo reserva = new CadReserva_Voo();

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
                voo.cadastrarVoo();
                break;
            case 3:
                servico.cadastrarServico();
                break;
            case 4:
                assento.cadastrarAssento();
                break;

            case 5:
                reserva.cadastroReserva();
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
                listar.listarUsuario();
                break;

            case 2:
                listar.listarVoo();
                break;
            case 3:
                listar.listarServico();
                break;
            case 4:
                listar.listarAssento();
                break;
            case 5:
                listar.listarReserva_voo();
                break;
            default:
                break;
        }
    }
}
