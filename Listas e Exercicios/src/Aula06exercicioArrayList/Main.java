package Aula06exercicioArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();
        nomes.add(new String(nome));
        while (!nome.equalsIgnoreCase("sair")) {
            System.out.println("Digite outro nome(para sair digite sair): ");
            nome = scanner.nextLine();
            nomes.add(new String(nome));
        }
        System.out.println(nomes.get(nomes.size()-2));
        System.out.println(nomes.get(0));
        System.out.println(nomes.remove(nomes.size()-1));
        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}
