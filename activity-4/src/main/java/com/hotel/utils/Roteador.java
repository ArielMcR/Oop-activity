package main.java.com.hotel.utils;

import main.java.com.hotel.utils.cadastro.*;
import main.java.com.hotel.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.hotel.utils.listagem.Listar;

public class Roteador {

    CadHospede hospede = new CadHospede();
    CadQuarto quarto = new CadQuarto();
    CadFuncionario funcionario = new CadFuncionario();
    CadReserva_Quarto reserva = new CadReserva_Quarto();
    CadServico servico = new CadServico();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                hospede.cadastrarHospede();
                break;

            case 2:
                quarto.cadastrarQuarto();
                break;
            case 3:
                servico.cadastrarServico();
                break;
            case 4:
                funcionario.cadastrarFuncionario();
                break;

            case 5:
                reserva.cadastrarReservaDeQuarto();
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
                listar.listarHospede();
                break;

            case 2:
                listar.listarQuarto();
                break;
            case 3:
                listar.listarServico();
                break;
            case 4:
                listar.listarFuncionarios();
                break;
            case 5:
                listar.listarReservas_de_Quarto();
                break;
            default:
                break;
        }
    }
}
