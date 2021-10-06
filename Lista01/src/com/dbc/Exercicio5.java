package com.dbc;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos reais recebe por hora: ");
        float valor = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Agora o número de horas em horario de expediente durante o mês:");
        int horas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora digite quantas horas extras você fez no mês:");
        int extras = scanner.nextInt();
        scanner.nextLine();
        float extrasmetade = extras / 2;

        float salario = (horas + extrasmetade) * valor;
        System.out.println(String.format("O seu salário bruto esse mês é R$%.2f.", salario));
    }
}
