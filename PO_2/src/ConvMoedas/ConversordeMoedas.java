package ConvMoedas;

import java.util.Scanner;

public class ConversordeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CONVERSOR DE MOEDAS");
        System.out.println(" ");
        System.out.println("1. Real(R$) em Dólar(US$)");
        System.out.println("2. Real(R$) em Euros(€)");
        System.out.println("3. Dólar(US$) em Real(R$)");
        System.out.println("4. Dolar(US$) em Euros(€)");
        System.out.println("5. Euros(€) em Real(R$)");        
        System.out.println("6. Euros(€) em Dólar(US$)");
        
        System.out.println(" ");
        System.out.print("Digite o número da Conversão desejada: ");
        int escolhaOperacao = scanner.nextInt();
          
        
        double moeda1, moeda2 = 0;
                   
        double valorConvertido = 0;

        switch (escolhaOperacao) {
            case 1: //real em dólar
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de real(is): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do dólar: ");
                moeda2 = scanner.nextDouble();                
            	valorConvertido = moeda1 / moeda2;
                break;
                
            case 2: //real em euro
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de real(is): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do euros: ");
                moeda2 = scanner.nextDouble();
            	valorConvertido = moeda1 / moeda2;
                break;
                
            case 3: //dólar em real
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de dolar(es): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do real: ");
                moeda2 = scanner.nextDouble();
            	valorConvertido = moeda1 * moeda2;
                break;
                
            case 4:// dólar em euros
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de dólar(s): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do euros: ");
                moeda2 = scanner.nextDouble();
            	valorConvertido = moeda1 * moeda2;
                break;    
                
            case 5: //Euros em real
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de euro(s): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do real: ");
                moeda2 = scanner.nextDouble();
            	valorConvertido = moeda1 * moeda2;
                break;                        
                
            case 6: //euro em dólar
            	
            	System.out.println(" ");
            	System.out.print("Digite a quantidade de euro(s): ");
                moeda1 = scanner.nextDouble();
                System.out.print("Digite a taxa de cambio atual do dólar: ");
                moeda2 = scanner.nextDouble();
            	valorConvertido = moeda1 / moeda2;
                break;
            
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }
        if(escolhaOperacao == 1) {
        	System.out.println("O valor convertido é: " + valorConvertido  + " dólar(es)");
        }else if(escolhaOperacao == 2) {
        	System.out.println("O valor convertido é: " + valorConvertido + " euros");
        }else if(escolhaOperacao == 3) {
        	System.out.println("O valor convertido é: " + valorConvertido + " real(is)");
        }else if(escolhaOperacao == 4) {
        	System.out.println("O valor convertido é: " + valorConvertido + " real(is)");
        }else if(escolhaOperacao == 5) {
        	System.out.println("O valor convertido é: " + valorConvertido + " euros");  
        }else if (escolhaOperacao == 6) {
        	System.out.println("O valor convertido é: " + valorConvertido + " dólar(es)");
        }
        scanner.close();
    }
      
}
