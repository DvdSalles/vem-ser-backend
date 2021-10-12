package Lista02ex3_OO;

import java.util.Scanner;

public class Times {
    Scanner scanner = new Scanner(System.in);

   private String nome;
   private int quantidade;

    public Times(){
    }
    public Times(String nome,int numeroDeJogadores){
        this.nome = nome;
        this.quantidade = numeroDeJogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void listagemEResultados(){
        String nomeJogador = "";
        double alturaMaiorJogador = 0;
        String maiorJogador = "";
        int quantidadeJogador = 0;
        String maisVelho = "";
        int idadeMaisVelho = 0;
        String maisPesado = "";
        double pesoMaisPesado = 0;
        double todasAlturas = 0;

        while (quantidadeJogador < this.quantidade){
            System.out.printf("Digite o nome do jogador: %n");
            nomeJogador = scanner.next();
            System.out.printf("Digite a altura do jogador: %n");
            double altura = scanner.nextDouble();
            System.out.printf("Digite o peso do jogador: %n");
            double pesoJogador = scanner.nextDouble();
            System.out.printf("Digite a idade do jogador: %n");
            int idadeJogador = scanner.nextInt();
            quantidadeJogador++;
            if(quantidadeJogador == this.quantidade){
                break;
            }

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
        double mediaAlturas = todasAlturas / this.quantidade;
        System.out.printf("Quantidade de jogadores cadastrados pelo %s é: %d %n",this.nome, quantidadeJogador);
        System.out.printf("O jogador do %s mais alto e sua altura: %s %.2fm %n",this.nome, maiorJogador, alturaMaiorJogador);
        System.out.printf("O jogador do %s mais pesado e seu peso: %s %.2fKg %n",this.nome, maisPesado, pesoMaisPesado);
        System.out.printf("O jogador do %s mais velho e sua idade: %s %danos %n",this.nome, maisVelho, idadeMaisVelho);
        System.out.printf("A média de altura dos jogadores do %s é igual a: %.2fm",this.nome, mediaAlturas);

    }

}
