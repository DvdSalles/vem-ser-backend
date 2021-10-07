package com.dbc;

import java.util.Scanner;

public class ExercicioAula02For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos elementos você deseja?");
        int elementos = scanner.nextInt();
        int[] valores = new int[elementos];
        int soma = 0;

        for (int index = 0; index < valores.length; index++) {
            System.out.printf("Digite o valor do indice" + index + ": ");
            valores[index] = scanner.nextInt();
            soma += valores[index];
        }
        float media = soma / valores.length;
        System.out.println(media);
    }
}
