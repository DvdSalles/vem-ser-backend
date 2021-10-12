package Lista02ex4_OO;

import java.util.Scanner;

public class Vetor {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[3];


    public void mostrarPosicao(){
        System.out.printf("Digite um número para a posição um: %n");
        this.numeros[0] = scanner.nextInt();
        System.out.printf("Digite mais um número para a segunda posição: %n");
        this.numeros[1] = scanner.nextInt();
        System.out.printf("Digite o último número para colocar na terceira posição: %n");
        this.numeros[2] = scanner.nextInt();
        if(this.numeros[0] < this.numeros[1] && this.numeros[0] < this.numeros[2]){
            System.out.printf("O menor número é %d e está na primeira posição", this.numeros[0]);
        }else if(this.numeros[1] < this.numeros[0] && this.numeros[1] < this.numeros[2]){
            System.out.printf("O menor número é %d e está na segunda posição", this.numeros[1]);
        }else{
            System.out.printf("O menor número é %d e está na terceira posição", this.numeros[2]);
        }
    }


}
