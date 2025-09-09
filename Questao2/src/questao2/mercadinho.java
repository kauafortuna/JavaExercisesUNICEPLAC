package questao2;

import java.util.Scanner;

public class mercadinho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0.0; // valor inicial do carrinho
		int opcao;
		
		System.out.println("=== Bem-vindo ao Mercado Virtual ===");

		do {
			System.out.println("\nTotal atual da compra: R$ " + total);
			System.out.println("Escolha um produto para adicionar a seu carrinho:");
			System.out.println("1 - Arroz (R$ 20.00)");
			System.out.println("2 - Feijão (R$ 12.00)");
			System.out.println("3 - Macarrãp (R$ 8.00)");
			System.out.println("4 - Coca Cola (R$ 6.00)");
			System.out.println("5 - Chocolate (R$ 5.00)");
			System.out.println("6 - Finalizar compra!");
			
			System.out.print("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
		switch (opcao) {   // Escolha caso igual do portugol
			case 1:
				total += 20.00; // em vez de fazer total <- total + 20, usamos "+="
				System.out.println("---Arroz adicionado!");
				break;
			case 2:
				total += 12.00;
				System.out.println("--- Feijão adicionado!");
				break;
			case 3:
				total += 8.00;
				System.out.println("--- Macarrão adicionado!");
				break;
			case 4: 
				total += 6.00;
				System.out.println("--- Colca Cola adicionada!");
				break;
			case 5:
				total += 5;
				System.out.println("Chocolate adicionado!");
				break;
			case 6:
				System.out.println("== Compra finalizada! ==");
			default:
				System.out.println();  // opções inválidas repete
		}
		}while(opcao != 6);  // enquanto o user nao esoclher o valor zero ficara no laço repetindo!
		System.out.println("\nTotal final da compra: R$" + total);
		System.out.println("====== Obrigado! ======");
		entrada.close();
	}
}


