package main.java.com.biblioteca.modelos;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataDeEmprestimo = LocalDate.now();
    private LocalDate dataDeDevolucao = LocalDate.now().plusWeeks(2);

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public LocalDate renovarEmprestimo(LocalDate dataDeDevolucao) {
        LocalDate novaDataDevolucao = dataDeDevolucao.plusWeeks(2);
        this.dataDeDevolucao = novaDataDevolucao;
        return novaDataDevolucao;
    }
}
