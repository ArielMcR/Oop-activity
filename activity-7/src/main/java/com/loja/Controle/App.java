package main.java.com.loja.Controle;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.loja.modelos.*;
import main.java.com.loja.utils.*;
import main.java.com.rede_social.modelos.Comentario;
import main.java.com.rede_social.modelos.Grupo;
import main.java.com.rede_social.modelos.Mensagem;
import main.java.com.rede_social.modelos.Postagem;
import main.java.com.rede_social.modelos.Usuario;
import main.java.com.rede_social.utils.ExibirMenu;
import main.java.com.rede_social.utils.Roteador;

public class App {

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    public static ArrayList<Entrega> entregas = new ArrayList<Entrega>();

    public static void main(String[] args) throws Exception {
        int opc = 0;
        ExibirMenu menu = new ExibirMenu();
        Roteador roteador = new Roteador();
        Scanner sc = new Scanner(System.in);
        do {
            menu.menu();
            opc = sc.nextInt();
            sc.nextLine();
            roteador.roteadorGeral(opc);

        } while (opc != 7);
        sc.close();
    }
}
