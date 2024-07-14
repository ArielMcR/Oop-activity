package main.java.com.hospital.utils;

import main.java.com.hospital.utils.cadastro.*;

import main.java.com.hospital.utils.gerarRelatorio.GerarRelatorio;

import main.java.com.hospital.utils.listagem.Listar;

public class Roteador {

    CadPaciente paciente = new CadPaciente();
    CadMedico medico = new CadMedico();
    CadExame exame = new CadExame();
    CadAgenda_Exame agenda_exame = new CadAgenda_Exame();
    CadAgenda_consulta consulta = new CadAgenda_consulta();

    GerarRelatorio relatorio = new GerarRelatorio();

    // Listagem
    Listar listar = new Listar();

    @SuppressWarnings("static-access")
    public void roteadorGeral(int opcao) {
        switch (opcao) {
            case 1:
                paciente.cadastrarPaciente();
                break;

            case 2:
                medico.cadastrarMedico();
                break;
            case 3:
                exame.cadastrarExame();
                break;
            case 4:
                consulta.cadastrarConsulta();
                break;

            case 5:
                agenda_exame.cadastrarExame();
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
                listar.listarPaciente();
                ;
                break;

            case 2:
                listar.listarMedico();
                break;
            case 3:
                listar.listarExames();
                break;
            case 4:
                listar.listarAgendamento_consultas();
                break;
            case 5:
                listar.listarAgendamento_Exames();
                break;
            default:
                break;
        }
    }
}
