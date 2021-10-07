package com.dbc;

public class Exercicio1Aula2 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 8;
        numeros[1] = 10;
        numeros[2] = 7;
        int soma = numeros[0] + numeros[1] + numeros[2];
        int media = ((numeros[0] + numeros[1] + numeros[2]) / 3);
        System.out.printf("A soma dos 3 números é %d e a média deles é %d.", soma, media);

        int [][] matrizNumeros = new int [2][2]; //[LINHA][COLUNA]
        matrizNumeros[0][0] = 30;
        matrizNumeros[0][1] = 60;
        matrizNumeros[1][0] = 90;
        matrizNumeros[1][1] = 120;

        int somaMatriz = matrizNumeros[0][0] + matrizNumeros[0][1] + matrizNumeros[1][0] + matrizNumeros[1][1];
        int somaLinha1 = matrizNumeros[0][0] + matrizNumeros[0][1];
        int somaLinha2 = matrizNumeros[1][0] + matrizNumeros[1][1];
        int subValores = somaLinha1 - somaLinha2;
        System.out.printf("A soma de todos os valores é %d, a soma da primeira linha é %d, a soma da segunda %d" +
                " e a subtração delas respectivamente é %d", somaMatriz, somaLinha1, somaLinha2, subValores);

    }
}
