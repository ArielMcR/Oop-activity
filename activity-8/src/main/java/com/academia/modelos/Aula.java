package main.java.com.academia.modelos;

import java.time.LocalDateTime;
import java.util.List;
public class Aula {
    private Professor professor;
    private List<Aluno> aluno;
    private LocalDateTime data;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
