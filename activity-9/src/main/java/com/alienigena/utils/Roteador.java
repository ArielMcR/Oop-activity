package main.java.com.alienigena.utils;

import main.java.com.alienigena.utils.cadastro.*;
import main.java.com.alienigena.utils.gerarRelatorio.GerarRelatorio;
import main.java.com.alienigena.utils.listagem.Listar;

public class Roteador {

    CadTurista turista = new CadTurista();
    CadEspecie especie = new CadEspecie();
    CadPontoTuristico pontoTuristico = new CadPontoTuristico();
    CadHotel hotel = new CadHotel();
    CadViagem viagem = new CadViagem();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                turista.cadastrarHospede();
                break;

            case 2:
                especie.cadastrarEspecie();
                break;
            case 3:
                pontoTuristico.cadastrarPontoTuristico();
                break;
            case 4:
                hotel.cadastrarHotel();
                break;

            case 5:
                viagem.cadastrarViagem();
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
                listar.listarTurista();
                break;

            case 2:
                listar.listarEspecie();
                break;
            case 3:
                listar.listarPontoTuristico();
                break;
            case 4:
                listar.listarHotel();
                break;
            case 5:
                listar.listarViagem();
                break;
            default:
                break;
        }
    }
}
