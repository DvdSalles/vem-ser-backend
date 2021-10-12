package Lista01ex1_OO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();


        System.out.printf("Digite seu nome: ");
        pessoa1.setNome(scanner.nextLine());
        System.out.printf("Digite o sobrenome: ");
        pessoa1.setSobrenome(scanner.nextLine());
        System.out.printf("Digite a idade: ");
        pessoa1.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.printf("Digite sua cidade: ");
        pessoa1.setCidade(scanner.nextLine());
        System.out.printf("Digite seu estado: ");
        pessoa1.setEstado(scanner.nextLine());
        System.out.printf("Nome: %s %s %nIdade: %d %nCidade: %s %nEstado: %s %n", pessoa1.getNome(),
                pessoa1.getSobrenome(),pessoa1.getIdade(),pessoa1.getCidade(),pessoa1.getEstado());

    }
}
