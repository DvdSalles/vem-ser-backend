package Lista02;

import java.util.Scanner;

class Exercico2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Primeiro a jogar digite um numero: %n");
        int numero1 = scanner.nextInt();

        System.out.printf("Segundo tente adivinhar o numero: %n");
        int numero2 = scanner.nextInt();

        while(numero1 != numero2) {

            if (numero1 > numero2){
                System.out.printf("Erooou(Faulstão) tente um numero maior. %n");
            }else {
                System.out.printf("Erooou(Faulstão) tente um numero menor. %n");
            }
            System.out.printf("Tente novamente: %n");
            numero2 = scanner.nextInt();
    }
        System.out.printf("Parabéns! Você acertou!");
    }
}
