package Lista02ex2_OO;

import java.util.Scanner;

public class Jogo {
    Scanner scanner = new Scanner(System.in);

    private int numero1;
    private int numero2;

    public int getNumero() {
        return numero1;
    }
    public void setNumero(int numero) {
        this.numero1 = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void jogar(){
        System.out.println("Jogador1, escolha um número: ");
        this.numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Jogador2, tente adivinhar o número: ");
        this.numero2 = scanner.nextInt();
        scanner.nextLine();

        while(this.numero1 != this.numero2){
            if(this.numero1 > this.numero2){
                System.out.printf("Erooouw! Tente um número maior!%n");
            }else{
                System.out.printf("Erooouw! Tente um número menor!%n");
            }
            System.out.println("Tente outro número Jogador2: ");
            this.numero2 = scanner.nextInt();
            scanner.nextLine();
        }
        System.err.println("Parabéns! Você acertou!");

    }
}
