package main.java.com.hotel.modelos;

public class Quarto {
    private int numeroDoQuarto;

    private String tipo;
    private int quantidadeCamas;
    private int andar;
    private Float precoQuarto;
    private Boolean disponivel;

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeCamas() {
        return quantidadeCamas;
    }

    public void setQuantidadeCamas(int quantidadeCamas) {
        this.quantidadeCamas = quantidadeCamas;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Float getPrecoQuarto() {
        return precoQuarto;
    }

    public void setPrecoQuarto(Float precoQuarto) {
        this.precoQuarto = precoQuarto;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
