package com.dbc;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome da sua cidade:");
            String cidade = scanner.nextLine();
            System.out.println("Digite o nome do seu estado:");
            String estado = scanner.nextLine();
            System.out.println("Olá seu nome é " + nome + ", você tem " + idade + " anos de idade, você mora em " + cidade + ", situada no estado de " + estado + ".");
    }
}
