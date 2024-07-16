package main.java.com.academia.utils.listagem;

import java.time.format.DateTimeFormatter;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.*;

public class Listar {
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public void listarAlunos() {
        if (App.alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de alunos cadastrados -----------|");
        for (int i = 0; i < App.alunos.size(); i++) {
            Aluno alunoAtual = App.alunos.get(i);
            System.out.println("Nome: " + alunoAtual.getNome());
            System.out.println("Sobrenome: " + alunoAtual.getSobrenome());
            System.out.println("Email: " + alunoAtual.getEmail());
            System.out.println("Telefone: " + alunoAtual.getTelefone());
            System.out.println("Cpf: " + alunoAtual.getCPF());
            System.out.println("Status: " + alunoAtual.getStatus());
            System.out.println("\n");
        }
    }

    public void listarProfessor() {
        if (App.professores.isEmpty()) {
            System.out.println("Não há professores cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de professores cadastradas -----------|");
        for (int i = 0; i < App.professores.size(); i++) {
            Professor professorAtual = App.professores.get(i);
            System.out.println("Nome: " + professorAtual.getNome());
            System.out.println("Sobrenome: " + professorAtual.getSobrenome());
            System.out.println("Email: " + professorAtual.getEmail());
            System.out.println("Cpf: " + professorAtual.getCPF());
            System.out.println("Telefone: " + professorAtual.getTelefone());
            System.out.println("Status: " + professorAtual.getCargaHoraria());
            System.out.println("\n");
            System.out.println("\n");
        }
    }

    public void listarAssinaturas() {
        if (App.assinaturas.isEmpty()) {
            System.out.println("Não há assinaturas cadastrados.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de assinaturas cadastrados -----------|");
        for (int i = 0; i < App.assinaturas.size(); i++) {
            PlanoAssinatura assinaturaAtual = App.assinaturas.get(i);
            System.out.println("Tipo: " + assinaturaAtual.getTipo());
            System.out.println("valor: " + assinaturaAtual.getValor());
            System.out.println("Descrição: " + assinaturaAtual.getDescricao());
            System.out.println("\n");
        }
    }

    public void listarAulas() {
        if (App.aulas.isEmpty()) {
            System.out.println("Não há aulas cadastradas.");
            System.out.println("Voltando...");
            return;
        }

        System.out.println("\033[H\033[2J");
        System.out.println("|----------- Lista de aulas cadastradas -----------|");
        for (int i = 0; i < App.aulas.size(); i++) {
            Aula aluaAtual = App.aulas.get(i);
            System.out.println("Data: " + aluaAtual.getData().format(formatadorHora));
            System.out.println("Membros: ");
            for (Aluno aluno : aluaAtual.getAluno()) {
                System.out.println("- " + aluno.getNome() + " " + aluno.getSobrenome());
            }
            System.out.println("Professor: " + aluaAtual.getProfessor().getNome());
        }
    }

}
