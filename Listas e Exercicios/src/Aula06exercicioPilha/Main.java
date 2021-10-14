package Aula06exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numeros = new Stack<>();

        Integer numero;
        for(int i = 0; i<15;i++){
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            scanner.nextLine();
            if(numero%2 == 0){
                numeros.add(numero);
            }else if(!numeros.isEmpty()){
                numeros.pop();
            }
        }
        while(!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }
    }
}
