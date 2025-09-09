package questao22;

import java.util.Scanner;

public class MiniSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Jogar (Pontuação)");
            System.out.println("2 - Mercado (Carrinho de compras)");
            System.out.println("3 - Empréstimo (Simulação)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    joguinho(entrada);
                    break;
                case 2:
                    mercado(entrada);
                    break;
                case 3:
                    emprestimo(entrada);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    // 🎮 Jogar
    public static void joguinho(Scanner entrada) {
        int pontos = 0;
        int escolha;

        System.out.println("\n=== Bem-vindo ao Joguinho ===");

        do {
            System.out.println("\nPontuação atual: " + pontos);
            System.out.println("1 - Acertar desafio (+10)");
            System.out.println("2 - Errar desafio (-5)");
            System.out.println("3 - Encontrar bônus (+20)");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1: pontos += 10; break;
                case 2: pontos -= 5; break;
                case 3: pontos += 20; break;
                case 0: System.out.println("Saindo do jogo..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        System.out.println("Pontuação final: " + pontos);
    }

    // 🛒 Mercado
    public static void mercado(Scanner entrada) {
        double total = 0.0;
        int escolha;

        System.out.println("\n=== Mercado Virtual ===");

        do {
            System.out.println("\nTotal atual: R$ " + total);
            System.out.println("1 - Arroz (R$ 20.00)");
            System.out.println("2 - Feijão (R$ 12.00)");
            System.out.println("3 - Macarrão (R$ 8.00)");
            System.out.println("4 - Refrigerante (R$ 6.00)");
            System.out.println("5 - Chocolate (R$ 5.00)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1: total += 20.00; break;
                case 2: total += 12.00; break;
                case 3: total += 8.00; break;
                case 4: total += 6.00; break;
                case 5: total += 5.00; break;
                case 0: System.out.println("Compra finalizada."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        System.out.println("Total da compra: R$ " + total);
    }

    // 💸 Empréstimo
    public static void emprestimo(Scanner entrada) {
        System.out.println("\n=== Simulação de Empréstimo ===");

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double juros = entrada.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = entrada.nextInt();

        valor *= (1 + (juros / 100)); // aplica os juros
        double valorParcela = valor / parcelas;

        System.out.println("\nValor com juros: R$ " + valor);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);
    }
}

