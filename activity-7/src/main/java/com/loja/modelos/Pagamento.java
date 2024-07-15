package main.java.com.loja.modelos;

public class Pagamento {

    private float valor;
    private String metodoPagamento;
    private String statusPagamento;

    public Pagamento(float valor, String metodoPagamento, String statusPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    // Getters e setters omitidos para brevidade
}
