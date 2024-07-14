package main.java.com.biblioteca.modelos;

public class Reserva_Voo {
    private Voo voo;
    private Usuario usuario;
    private Assento assento;
    private boolean confirmada;

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public float adicionarServico(Servico servico) {
        float valor_atualizado = voo.getPreco_passagem() + servico.getPreco();
        return valor_atualizado;
    }
}
