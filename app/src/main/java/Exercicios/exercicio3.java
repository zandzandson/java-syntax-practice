package Exercicios;

import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float distanciaPercorrida, combustivelGasto;
        
        System.out.println("Informe a distância percorrida em quilometros: ");
        distanciaPercorrida = leitor.nextFloat();
        System.out.println("Informe a quantidade de combustível gasto em litros: ");
        combustivelGasto = leitor.nextFloat();
        
        ConsumoMedio(distanciaPercorrida, combustivelGasto);
    }
    
    public static void ConsumoMedio(float x, float y) {
        float ConsumoMedio = x / y;
        System.out.println("O consumo médio é de " + ConsumoMedio + " quilometros por litro");
    }
    
}