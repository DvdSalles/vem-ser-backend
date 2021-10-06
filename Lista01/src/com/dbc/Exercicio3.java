package com.dbc;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total dos produtos:");
        float valor1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite o valor pago pelo cliente:");
        float valor2 = scanner.nextFloat();
        scanner.nextLine();
        float troco = valor2 - valor1;
        if (troco < 0) {
            System.out.println("O valor pago deve ser maior ou igual ao valor consumido.");
        } else {
            System.out.println(String.format("O cliente deve receber R$%.2f de troco.", troco));
        }
    }
}
