package Exercicios;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float jurofixo = 0.07f, valorDeposito, rendimento, valorTotal;

        System.out.println("Informe o valor do depósito: ");
        valorDeposito = leitor.nextFloat();
        
        rendimento = valorDeposito * jurofixo;
        valorTotal = valorDeposito + rendimento;
        System.out.println("O valor do investimento após um mês é de R$" + valorTotal);
    }

}