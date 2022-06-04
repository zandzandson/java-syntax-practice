package Exercicios;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valorDol, valorReal, cotaçãoDolReal;
        
        System.out.println("Informe o valor em Dolares: ");
        valorDol = leitor.nextFloat();
        
        System.out.println("Informe quantos reais valem 1USD: ");
        cotaçãoDolReal = leitor.nextFloat();
        
        valorReal = valorDol * cotaçãoDolReal;
        System.out.println("O valor equivale a R$" + valorReal + ".");
    }

}
