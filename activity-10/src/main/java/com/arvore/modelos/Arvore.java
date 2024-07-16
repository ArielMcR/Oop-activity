package main.java.com.arvore.modelos;

public class Arvore {
    private String especie;
    private String localizacao;
    private String estado_saude;
    private Float altura;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEstado_saude() {
        return estado_saude;
    }

    public void setEstado_saude(String estado_saude) {
        this.estado_saude = estado_saude;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
