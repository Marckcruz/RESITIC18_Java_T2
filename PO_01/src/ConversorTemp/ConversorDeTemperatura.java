package ConversorTemp;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

       
        double temperaturaConvertida = 0;
        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            temperaturaConvertida = celsiusParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + temperaturaConvertida + " °F");
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            temperaturaConvertida = fahrenheitParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + temperaturaConvertida + " °C");
        } else {
            System.out.println("Unidade de origem inválida. Encerrando o programa.");
        }

       
        scanner.close();
    }

    
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

  
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
