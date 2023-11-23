package Calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES:");
        System.out.println(" ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Porcentagem");
        System.out.println("6. Potência");
        System.out.println("7. Raiz Quadrada");

        System.out.println(" ");
        System.out.print("Digite o número da operação desejada: ");
        int escolhaOperacao = scanner.nextInt();

        double numero1, numero2 = 0; 
        
        if (escolhaOperacao == 7) {
            System.out.print("Digite o número: ");
            numero1 = scanner.nextDouble();
        } else {
            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
        }

        double resultado = 0;

        switch (escolhaOperacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            case 5:
                resultado = (numero1 * numero2) / 100;
                break;
            case 6:
                resultado = Math.pow(numero1, numero2);
                break;
            case 7:
                resultado = Math.sqrt(numero1);
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
