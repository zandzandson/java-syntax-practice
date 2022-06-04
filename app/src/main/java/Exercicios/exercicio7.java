package Exercicios;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float tempC, tempF;
        
        System.out.println("Informe a temperatura em Celsius:");
        tempC = leitor.nextFloat();
        
        tempF = ((9 * tempC)+ 160) / 5;
        System.out.println("A temperatura em Fahrenheit é " + tempF + " graus.");
    }
    
}
