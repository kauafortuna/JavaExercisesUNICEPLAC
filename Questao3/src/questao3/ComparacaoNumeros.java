package questao3;

import java.util.Scanner;
public class ComparacaoNumeros {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	// Head
	System.out.println("==== Comparação entre dois valores (<>=) ===="); 
	
	// usuario inserindo os dois primeiros valores
	System.out.print("Digite o primeiro valor: ");
	int num1 = entrada.nextInt(); // n1
	
	System.out.print("Digite o segundo valor: ");
	int num2 = entrada.nextInt(); // n2
	
	// logica
	if (num1 > num2) {
		System.out.println("O primeiro número é MAIOR que o segundo.");
	}else if (num1 < num2){
		System.out.println("O primeiro número é MENOR que o segundo.");
	}else {
		System.out.println("Ambos são IGUAIS.");
	}
	entrada.close();		
	}

}
