package Exercicios;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String valorA, valorB, valorHolder;
        
        System.out.println("Informe o valor de A:");
        valorA = leitor.nextLine();
        System.out.println("Informe o valor de B:");
        valorB = leitor.nextLine();
        
        valorHolder = valorA;
        valorA = valorB;
        valorB = valorHolder;
        System.out.println("Os valores de A e B são, respectivamente, " + valorA + " e " + valorB + ".");
    }
    
}
