package Exercicios;
//ta dando algum erro estupido com a versao do gradle, nao consigo arrumar fodase
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Vendedor V = new Vendedor();
        
        System.out.println("Informe o nome do funcion�rio: ");
        V.setNomeFuncionario(leitor.nextLine());
        System.out.println("Informe o sal�rio fixo do funcion�rio: ");
        V.setSalarioFixo(leitor.nextFloat());
        System.out.println("Informe o valor total das vendas do funcion�rio no per�odo: ");
        V.setValorVendas(leitor.nextFloat());
        System.out.println("Informe a porcentagem ganha por comiss�o do funcion�rio em n�mero inteiro: ");
        V.setValorComissao(leitor.nextFloat());
        
        float salarioFinal = V.salarioFixo + ((V.valorComissao / 100) * V.valorVendas);
        System.out.println("O funcin�rio " + V.nomeFuncionario + " recebe R$" + V.salarioFixo + " fixo mensalmente, totalizando R$" + salarioFinal + " com as comiss�es.");
    }
}

class Funcionario {
    String nomeFuncionario;
    float salarioFixo;
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}

class Vendedor extends Funcionario {
    float valorVendas, valorComissao;
    //float salarioFinal;
           
    public Vendedor() {
        super();
    }
    
    public float getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(float valorComissao) {
        this.valorComissao = valorComissao;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }
}