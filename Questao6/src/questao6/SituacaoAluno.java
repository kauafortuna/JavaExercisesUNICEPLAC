package questao6;

import java.util.Scanner;
public class SituacaoAluno {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	// HEAD
	System.out.println("======== Aluno AP, RC, RP ========");
	// inicio
	System.out.print("Digite o nome do Aluno: ");
	String nome = entrada.nextLine();
	
	System.out.print("Digite a nota do Aluno: ");
	double nota = entrada.nextDouble();
	
	System.out.println();
	System.out.println("===== S T A T U S ====="); // head
	
	
	// Cálculo
	if (nota >= 8) {
		System.out.println(nome + ": APROVADO!");
	}else if (nota >= 7) {
		System.out.println(nome + ": RECUPERAÇÃO!");
	}else {
		System.out.println(nome + ": REPROVADO!");
	}
	System.out.println("NOTA: " + nota);
	entrada.close();
	}

}
