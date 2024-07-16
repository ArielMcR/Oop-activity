package main.java.com.academia.utils.cadastro;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CadAula {
    public static DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarAula() {
        Aula aula = new Aula();
        System.out.println(
                "Digite a data e hora da aula, no padrão (Hora, minuto, dia, mês, ano) ex: 12:20 01/01/2025");
        String data = sc.nextLine();
        LocalDateTime data_entrada = LocalDateTime.parse(data, formater);
        aula.setData(data_entrada);

        List<Aluno> alunosAula = new ArrayList<>();
        System.out.println("Escolha os alunos da aula, nota-se que eles têm que ser cadastrados antes");
        if (App.alunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado, por favor cadastrar na primeira opção do menu");
            return;
        }

        while (true) {
            for (int i = 0; i < App.alunos.size(); i++) {
                Aluno alunoAtual = App.alunos.get(i);
                System.out.println("| Opção " + i + " - Nome: " + alunoAtual.getNome() + ", sobrenome: "
                        + alunoAtual.getSobrenome() + " |");
            }
            System.out.println("Escolha uma opção (ou -1 para finalizar): ");
            int opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida == -1) {
                break;
            }
            Aluno usuarioEscolhido = App.alunos.get(opcaoEscolhida);
            alunosAula.add(usuarioEscolhido);
        }

        aula.setAluno(alunosAula);

        System.out.println("Escolha o professor da aula, nota-se que eles têm que ser cadastrados antes");
        if (App.alunos.size() == 0) {
            System.out.println("Nenhum professor cadastrado, por favor cadastrar na primeira opção do menu");
            return;
        }

        for (int i = 0; i < App.professores.size(); i++) {
            Professor professorAtual = App.professores.get(i);
            System.out.println("| Opção " + i + " - Nome: " + professorAtual.getNome() + ", sobrenome: "
                    + professorAtual.getSobrenome() + " |");
        }
        System.out.println("Escolha uma opção: ");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();
        Professor professorEscolhido = App.professores.get(opcaoEscolhida);
        aula.setProfessor(professorEscolhido);

        App.aulas.add(aula);
        System.out.println("Aula Cadastrada com Sucesso!!!");
        System.out.println("\n\n");
    }
}
