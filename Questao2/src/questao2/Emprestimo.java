package questao2;

import java.util.Scanner;
public class Emprestimo {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	// head
	System.out.println("======== B A N C O  AVAK ========");
	System.out.println("--- Apenas empréstimos!");
	
	// Pedindo o valor do emprestimo
	System.out.print("Digite o valor do empréstimo: R$");
	double valor = entrada.nextDouble();
	
	// juros
	System.out.print("Digite a taxa de juros (% ao mês): ");
	double juros = entrada.nextDouble();

	// parcelas
	System.out.print("Digite a quantidade de parcelas: ");
	int parcelas = entrada.nextInt();
	
	// aplicando valor com *= e /=
	valor *= (1 +(juros/100)); // valor = valor vezes (1+ juros/100)
	
	// Divide pelo número de parcelas
	double valorParcela = valor / parcelas; // valor /= parcelas 	
	
	System.out.println("\n=== Simulação de Empréstimo ===");
    System.out.println("Valor com juros: R$ " + valor);
    System.out.println("Quantidade de parcelas: " + parcelas);
    System.out.println("Valor de cada parcela: R$ " + valorParcela);
	
    entrada.close();
	}

}
