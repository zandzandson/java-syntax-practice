package Exercicios;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valorDol, valorReal, cota��oDolReal;
        
        System.out.println("Informe o valor em Dolares: ");
        valorDol = leitor.nextFloat();
        
        System.out.println("Informe quantos reais valem 1USD: ");
        cota��oDolReal = leitor.nextFloat();
        
        valorReal = valorDol * cota��oDolReal;
        System.out.println("O valor equivale a R$" + valorReal + ".");
    }

}
