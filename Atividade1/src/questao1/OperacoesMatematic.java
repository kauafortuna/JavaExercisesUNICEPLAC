package questao1;

import java.util.Scanner;
public class OperacoesMatematic {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// Pedindo os valores ao usuário
	System.out.print(" Digite o primeiro valor: ");
	double numero1 = sc.nextDouble();
	
	System.out.print(" Digite o segundo valor: ");
	double numero2 = sc.nextDouble();
	
	double soma = numero1 + numero2;
	double subtracao = numero1 - numero2;
	double multiplicacao = numero1 * numero2;
	double divisao = numero1 / numero2;
	
	if (numero2 != 0)	{
		divisao = numero1 / numero2;
	}else {
		System.out.println("Error: divisão por zero não  é permitida! ");
	}
	System.out.println("---------- R E S U L T A D O S ----------");
	System.out.println(" Soma: " + soma);
	System.out.println(" Subtração: " + subtracao);
	System.out.println(" Multiplicação: " + multiplicacao);
	System.out.println(" Divisão: " + divisao);
	System.out.println("------------------------------------------");
	
	sc.close();
	}

}
