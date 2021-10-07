package com.dbc;

import java.util.Scanner;

public class ExercicioAula02While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra(fim para encerrar):");
        String palavra = scanner.next();
        while(!palavra.equalsIgnoreCase("fim")){
            System.out.println(palavra + "| Digite outra palavra(fim para encerrar): ");
            palavra = scanner.next();
        }
    }
}
