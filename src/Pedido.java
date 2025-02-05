package main;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
			    private List<Produto> itens;

			    public Pedido() {
			        itens = new ArrayList<>();
			    }

			    public void adicionarItem(Produto produto) {
			        itens.add(produto);
			    }

			    public double calcularTotal() {
			        double total = 0;
			        for (Produto item : itens) {
			            total += item.getPreco();
			        }
			        return total;
			    }

			    public void exibirPedido() {
			        System.out.println("\n--- Seu Pedido ---");
			        for (Produto item : itens) {
			            System.out.println(item);
			        }
			        System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
			    }
			
}
