package questao2;


import java.util.Scanner; 
public class OperadoresCompostos { // vai ser um jogo interativo que o user perde ou ganha pontos
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int score = 0;
	int opcao;
	
	System.out.println("=== Bem Vindo ao ScorePlay ===");
	System.out.println(" Apenas Teste de atribuição de valores!");
	
	// laço para o jogo se repetir ate o usuario digitar 0
	do{
	System.out.println("\n ------------------------------- SCORE: " + score );
	System.out.println(" Escolha uma opção: ");
	System.out.println(" 1- Acertar desafio(+10 pontos)");
	System.out.println(" 2- Errar desafio (-5 pontos)");
	System.out.println(" 3- Encontrar bônus secreto (+20 pontos)");
	System.out.println(" 0- Sair do jogo");


	System.out.print(" Digite a opção: ");
	opcao = entrada.nextInt();
	
	// pular linha 
	System.out.println("");
	
	switch (opcao) {
	case 1:
		score += 10; // soma 10 
		System.out.println("Você acertou! +10 pontos");
		break;
	case 2:
		score -= 5;
		System.out.println("Você errou! -5 pontos");
		break;
	case 3:
		score += 20;
		System.out.println("---------> Bônus encontrado! +20 pontos<------------");
		break;
	case 0:
		System.out.println("Jogo encerrado. Pontução final: " + score);
			
	}
	}while (opcao !=0);
	
	entrada.close();
	}
}
