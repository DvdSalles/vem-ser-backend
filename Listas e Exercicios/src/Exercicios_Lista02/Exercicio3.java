package Exercicios_Lista02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeJogador = "";
        double alturaMaiorJogador = 0;
        String maiorJogador = "";
        int quantidadeJogador = 0;
        String maisVelho = "";
        int idadeMaisVelho = 0;
        String maisPesado = "";
        double pesoMaisPesado = 0;
        double todasAlturas = 0;

        while (!nomeJogador.equalsIgnoreCase("sair")){
            System.out.printf("Digite o nome do jogador: %n");
            nomeJogador = scanner.next();
            if(nomeJogador.equalsIgnoreCase("sair")){
                break;
            }
            System.out.printf("Digite a altura do jogador: %n");
            double altura = scanner.nextDouble();
            System.out.printf("Digite o peso do jogador: %n");
            double pesoJogador = scanner.nextDouble();
            System.out.printf("Digite a idade do jogador: %n");
            int idadeJogador = scanner.nextInt();

            quantidadeJogador++;

            if(alturaMaiorJogador < altura){
                alturaMaiorJogador = altura;
                maiorJogador = nomeJogador;
            }
            if(pesoMaisPesado < pesoJogador){
                pesoMaisPesado = pesoJogador;
                maisPesado = nomeJogador;
            }
            if(idadeMaisVelho < idadeJogador){
                idadeMaisVelho = idadeJogador;
                maisVelho = nomeJogador;
            }
            todasAlturas += altura;


        }
        double mediaAlturas = todasAlturas / quantidadeJogador;
        System.out.printf("Quantidade de jogadores cadastrados é: %d %n", quantidadeJogador);
        System.out.printf("O jogador mais alto e sua altura: %s %.2fm %n", maiorJogador, alturaMaiorJogador);
        System.out.printf("O jogador mais pesado e seu peso: %s %.2fKg %n", maisPesado, pesoMaisPesado);
        System.out.printf("O jogador mais velho e sua idade: %s %danos %n", maisVelho, idadeMaisVelho);
        System.out.printf("A média de altura total é igual a: %.2fm", mediaAlturas);

    }
}
