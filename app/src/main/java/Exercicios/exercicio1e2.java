package Exercicios;

import java.util.Scanner;

public class exercicio1e2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("num1:");
        num1 = leitor.nextInt();
        System.out.println("num2: ");
        num2 = leitor.nextInt();
        
        somar(num1, num2);
        diminuir(num1, num2);
        dividir(num1, num2);
        multiplicar(num1, num2);
    }
    
    public static void somar(int x, int y) {
        int resultado = x + y;
        System.out.println("Adição: " + resultado);
    }
    
    public static void diminuir(int x, int y) {
        int resultado = x - y;
        System.out.println("Subtração: " + resultado);
    }
    
    public static void dividir(int x, int y) {
        int resultado = x / y;
        System.out.println("Divisão: " + resultado);
    }
    
    public static void multiplicar(int x, int y) {
        int resultado = x * y;
        System.out.println("Multiplicação: " + resultado);
    }
}

