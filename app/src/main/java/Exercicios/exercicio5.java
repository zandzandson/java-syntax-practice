package Exercicios;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float nota1, nota2, nota3;
        String nomeAluno;
        
        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.println("Informe a primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.println("Informe a segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.println("Informe a terceira nota: ");
        nota3 = leitor.nextFloat();
        
        float mediaAluno = (nota1 + nota2 + nota3) / 3;
        System.out.println("O aluno " + nomeAluno + " tem uma média de " + mediaAluno + ".");
    }
}
