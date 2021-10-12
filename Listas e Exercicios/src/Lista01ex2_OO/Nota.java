package Lista01ex2_OO;

import java.util.Scanner;

public class Nota {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private double bim1;
    private double bim2;
    private double bim3;
    private double bim4;

    public void media(){
        System.out.printf("Digite o nome do aluno: %n");
        this.nome = scanner.nextLine();
        System.out.printf("Digite a nota do primeiro bimestre: %n");
        this.bim1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Digite a nota do segundo bimestre: %n");
        this.bim2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Digite a nota do terceiro bimestre: %n");
        this.bim3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Digite a nota do quarto bimestre: %n");
        this.bim4 = scanner.nextDouble();
        scanner.nextLine();
        double mediaFinal = (this.bim1+this.bim2+this.bim3+this.bim4) / 4;
        if (mediaFinal <= 5){
            System.out.printf("Média final igual a %.1f. O aluno %s está reprovado.%n", mediaFinal, this.nome);
        } else if (mediaFinal < 7){
            System.out.printf("Média final igual a %.1f. O aluno %s está em exame.%n", mediaFinal, this.nome);
        } else {
            System.out.printf("Média final igual a %.1f. O aluno %s está aprovado.%n", mediaFinal, this.nome);
        }
    }
}
