package manipulaArray;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayUsuario = criarArrayUsuario(scanner);
        exibirArray("Array do Usuário:", arrayUsuario);
        
        int[] arrayAleatorio = criarArrayAleatorio(5, 10); 
        exibirArray("Array Aleatório:", arrayAleatorio);
        
        int soma = calcularSoma(arrayUsuario);
        System.out.println("Soma do Array do Usuário: " + soma);
        
        int maiorValor = encontrarMaiorValor(arrayUsuario);
        System.out.println("Maior valor do Array do Usuário: " + maiorValor);
        
        int menorValor = encontrarMenorValor(arrayUsuario);
        System.out.println("Menor valor do Array do Usuário: " + menorValor);

        scanner.close();
    }
    
    private static int[] criarArrayUsuario(Scanner scanner) {
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
   
    private static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1);
        }

        return array;
    }
    
    private static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }
    
    private static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    private static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
   
    private static void exibirArray(String mensagem, int[] array) {
        System.out.print(mensagem + " [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
