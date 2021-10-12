package Lista02ex6_OO;

import java.util.Scanner;

public class Vetor10 {
    Scanner scanner = new Scanner(System.in);


    int[] numeros = {1,2,3,4,5,6,7,8,9,10};

    public void encontrarNumero(){
        System.out.println("Digite um valor para pesquisar: ");
        int valor = scanner.nextInt();
        scanner.nextLine();
        int posicao = -1;
        for (int i = 0; i < 10; i++) {
            if (valor == this.numeros[i]) {
                posicao = i;
                System.out.printf("Valor %d encontrado na posição [%d] %n",this.numeros[i], i);
                break;
            }
        }
        if (posicao == -1) {
            System.err.println("Valor não encontrado no vetor!");
        }
        this.encontrarNumero();
    }
}
