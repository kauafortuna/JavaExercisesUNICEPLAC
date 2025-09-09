package questao4;


import java.util.Scanner;
public class AptoDirigir {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	// Head
	System.out.println("==================================================");
	System.out.println("  D E P A R T A M E N T O  DE  T R Â N S I T O ");
	System.out.println("==================================================");
	
	// Usuario inserindo idade
	System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();

	// Cnh
	System.out.print("Você possui CNH? (s/n): "); // tem ou n cnh, var cnh guarda valor
	char cnh = entrada.next().charAt(0);
	
	System.out.println(); // PULAR LINHA
	System.out.println("================= S T A T U S ================="); // Head status
	
	// Condicionais
	if (idade >= 18 && (cnh == 's' || cnh == 'S')) {
		System.out.println("Você é maior de idade e está apto a dirigir!"); // de MAior com CNH
	} else if (idade >=18 && (cnh == 'n' || cnh == 'N')){
		System.out.println("Você já é maior de idade e pode tirar a CNH, mas ainda NÃO pode dirigir."); // de MAior SEM cnh
	}else {
			System.out.println("Você ainda é MENOR de iadade, NÃO está apto a dirigir. "); //de MEnor
		}
	entrada.close();
	}
}
