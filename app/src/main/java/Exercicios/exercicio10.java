package Exercicios;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valorProdutoParcelado, valorParcelado;
        
        System.out.println("Compra em 5x sem juros. Informe o valor do produto: ");
        valorProdutoParcelado = leitor.nextFloat();
        
        valorParcelado = valorProdutoParcelado / 5;
        System.out.println("O valor de cada parcela é de " + valorParcelado);
    }

}
