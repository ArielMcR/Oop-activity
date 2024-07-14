package main.java.com.voos.modelos;

/**
 * Usuario
 */
public class Usuario {
    private String nome = "";
    private String sobrenome = "";
    private String passaporte = "";
    private String email = "";
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getPassaporte() {
        return passaporte;
    }
    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}