package Lista02ex7_OO;

import java.util.Scanner;

public class Matriz4x4 {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[4][4];
    String nome;

    public int[][] montarMatriz(){
        for(int linha=0; linha<4; linha++){
            for(int coluna=0; coluna<4; coluna++){
                System.out.printf("%dª linha, %dª coluna = %n",linha+1, coluna+1);
                this.matriz[linha][coluna] = scanner.nextInt();
            }
        }
        return this.matriz;
    }
    public void verificarMaioresQueDez(){
        int contagem = 0;
        for(int linha=0; linha<4; linha++){
            for(int coluna=0; coluna<4; coluna++){
                if(this.matriz[linha][coluna] > 10){
                    contagem++;
                }
            }
        }
        System.out.printf("Existem na matriz %s, %d números maiores que 10.",this.nome, contagem);
    }
}
