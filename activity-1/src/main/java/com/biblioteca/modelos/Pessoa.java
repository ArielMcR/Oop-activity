package main.java.com.biblioteca.modelos;
public abstract class Pessoa {
    protected String nomePessoa = "";
    protected String sobrenomePessoa = "";
    protected String email = "";
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getSobrenomePessoa() {
        return sobrenomePessoa;
    }
    public void setSobrenomePessoa(String sobrenomePessoa) {
        this.sobrenomePessoa = sobrenomePessoa;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
