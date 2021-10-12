package Lista02ex5_OO;

import java.util.Scanner;

public class Vetor20 {
    Scanner scanner = new Scanner(System.in);

    int[] vinteNumeros = new int[20];

    public void escolherVinte(){
        System.out.printf("Digite 20 numeros! %n");

        for(int i = 0; i < this.vinteNumeros.length; i++){
            System.out.printf("%dº número: %n", i+1);
            this.vinteNumeros[i] = scanner.nextInt();
        }
        for(int i = this.vinteNumeros.length; i > 0; i--){
            System.out.printf("Posição %d do vetor ficou o número %d %n", i-1, this.vinteNumeros[i-1]);
        }
    }
}
