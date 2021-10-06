package com.dbc;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para ver ela em ingles:");
        String palavra = scanner.nextLine();
        if(palavra.equalsIgnoreCase("Cachorro")){
                System.out.println("Cachorro em inglês é Dog.");
        }else if(palavra.equalsIgnoreCase("Tempo")){
            System.out.println("Tempo em inglês é Time.");
        }else if(palavra.equalsIgnoreCase("Amor")){
            System.out.println("Amor em inglês é Love.");
        }else if(palavra.equalsIgnoreCase("Cidade")){
            System.out.println("Cidade em inglês é City.");
        }else if(palavra.equalsIgnoreCase("Feliz")){
            System.out.println("Feliz em inglês é Happy.");
        }else{
            System.out.println("Esta palavra náo é válida!");
        }
    }
}
