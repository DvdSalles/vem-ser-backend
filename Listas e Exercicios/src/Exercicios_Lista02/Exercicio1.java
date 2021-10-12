package Exercicios_Lista02;

import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double desconto = 0.95;

        System.out.printf("Digite o nome do produto: %n");
        String produto = scanner.nextLine();
        System.out.printf("Digite o preço do produto: %n");
        double preco = scanner.nextDouble();

        for(int i = 1; i <= 10; i++){
            double valor = preco * desconto;
            double total = valor * i;
            System.out.printf("%d x R$%.2f = R$%.2f %n", i, valor, total);
            desconto -= 0.05;
        }
    }
}
