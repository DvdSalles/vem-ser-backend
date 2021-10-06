package com.dbc;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre:");
        float nota1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a nota do primeiro bimestre:");
        float nota2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a nota do primeiro bimestre:");
        float nota3 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a nota do primeiro bimestre:");
        float nota4 = scanner.nextFloat();
        scanner.nextLine();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media <= 5){
            System.out.println(String.format("Média final igual a %.2f. Aluno reprovado.", media));
        } else if (media < 7){
            System.out.println(String.format("Média final igual a %.2f. Aluno em exame.", media));
        } else {
            System.out.println(String.format("Média final igual a %.2f. Aluno aprovado.", media));
        }
    }
}
