package Lista01ex5_OO;

import java.util.Scanner;

public class Salario {
    Scanner scanner = new Scanner(System.in);

    private double valorHora;
    private double salarioBruto;


    public Salario(){

    }
    public Salario(double valorHora){
        this.valorHora = valorHora;
    }

    public void calcular(){
        System.out.println("Digite a quantidade de horas comuns trabalhadas no mês: ");
        double horasComuns = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a quantidade de horas extras sem ser aos Domingos: ");
        double horas50 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a quantidade de horas extras aos Domingos: ");
        double horas100 = scanner.nextDouble();
        scanner.nextLine();
        this.salarioBruto = (horasComuns + horas50*1.5 + horas100*2) * this.valorHora;
        System.out.printf("O salário bruto este mês é R$%.2f",this.salarioBruto);
    }
}
