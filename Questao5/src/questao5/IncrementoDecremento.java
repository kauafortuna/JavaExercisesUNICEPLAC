package questao5;

import java.util.Scanner;
public class IncrementoDecremento {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	// Head
	System.out.println("=================================");
	System.out.println(" (++)INCREMENTO (--)DECREMENTO ");
	System.out.println("=================================");// FECHANDO O HEAD
	
	// user insere os valores
	System.out.print("Digite um número: ");
	int num = entrada.nextInt();
	
	//mensagem final com incremento e decremento
	System.out.println(); // pulando linha
	System.out.println("============ R E S U L T A D O ============"); // ABRINDO O HEAD
	System.out.println("Número digitado: " + num); // MOSTRA O NUMERO NORMAL
	System.out.println("Incremento: " + (++num)); // SOMA +1
	System.out.println("Decremento: " + (--num)); // Tira -1
	System.out.println("==========================================="); // FECHANDO O HEAD
	entrada.close();
	}
}
