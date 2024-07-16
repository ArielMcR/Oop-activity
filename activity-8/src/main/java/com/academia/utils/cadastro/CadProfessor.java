
package main.java.com.academia.utils.cadastro;

import java.time.LocalDateTime;
import java.util.Scanner;

import main.java.com.academia.Controle.App;
import main.java.com.academia.modelos.Professor;

public class CadProfessor {

    private static Scanner sc = new Scanner(System.in);

    public static void cadastrarProfessor() {
        Professor professor = new Professor();

        System.out.println("Nome:");
        professor.setNome(sc.nextLine());

        System.out.println("Sobrenome:");
        professor.setSobrenome(sc.nextLine());

        System.out.println("CPF:");
        professor.setCPF(sc.nextLine());

        System.out.println("Endereço:");
        professor.setEndereco(sc.nextLine());

        System.out.println("Telefone:");
        professor.setTelefone(sc.nextLine());

        System.out.println("E-mail:");
        professor.setEmail(sc.nextLine());

        App.professores.add(professor);
        System.out
                .println("Professor " + professor.getNome() + " " + professor.getSobrenome()
                        + " Cadastrado com Sucesso!!!");
        System.out.println("\n\n");
    }
}
