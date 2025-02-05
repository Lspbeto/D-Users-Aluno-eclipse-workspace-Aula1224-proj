package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lanchonete {
	

		// Classe principal que simula a lanchonete
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Pedido pedido = new Pedido();

		        // Cardápio da lanchonete
		        List<Produto> cardapio = new ArrayList<>();
		        cardapio.add(new Produto("X-Burger", 15.00));
		        cardapio.add(new Produto("X-Salada", 18.00));
		        cardapio.add(new Produto("Refrigerante", 5.00));
		        cardapio.add(new Produto("Batata Frita", 10.00));
		        cardapio.add(new Produto("Sorvete", 8.00));

		        int opcao;
		        do {
		            System.out.println("\n--- Cardápio ---");
		            for (int i = 0; i < cardapio.size(); i++) {
		                System.out.println((i + 1) + ". " + cardapio.get(i));
		            }
		            System.out.println("0. Finalizar pedido");

		            System.out.print("Escolha um item (ou 0 para finalizar): ");
		            opcao = scanner.nextInt();

		            if (opcao > 0 && opcao <= cardapio.size()) {
		                Produto produtoEscolhido = cardapio.get(opcao - 1);
		                pedido.adicionarItem(produtoEscolhido);
		                System.out.println(produtoEscolhido.getNome() + " adicionado ao pedido!");
		            } else if (opcao != 0) {
		                System.out.println("Opção inválida. Tente novamente.");
		            }
		        } while (opcao != 0);

		        // Exibir o pedido e o total
		        pedido.exibirPedido();
		        System.out.println("Obrigado pela preferência!");

		        scanner.close();
		    }

}
