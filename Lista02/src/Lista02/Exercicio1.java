package Lista02;

import java.util.Scanner;

class Exercecio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double desconto = 0.95;

        System.out.printf("Digite o nome do produto: %n");
        String produto = scanner.nextLine();
        System.out.printf("Digite o preço do produto: %n");
        double preco = scanner.nextDouble();

        for(int i = 0; i < 10; i++){
            double valor = preco * desconto;
            double total = valor * (i+1);
            System.out.printf("%d X R$%.2f = R$%.2f %n", i+1, valor, total);
            desconto -= 0.05;
        }
    }
}
