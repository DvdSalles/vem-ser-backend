package Aula07exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a sua comida.");
        System.out.println("1- Japonesa");
        System.out.println("2- Fast Food");
        System.out.println("3- Tradicional");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        TiposComida tiposComida = TiposComida.values()[tipo-1];

        switch (tipo){
            case 1:
                System.out.println("Sua comida "+ tiposComida.getDescricao());
                break;
            case 2:
                System.out.println("Sua comida "+tiposComida.getDescricao());
                break;
            case 3:
                System.out.println("Sua comida "+tiposComida.getDescricao());
                break;
            default:
                System.err.println("Opção inválida!");
                break;
        }
    }
}
