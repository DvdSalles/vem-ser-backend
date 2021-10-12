package Lista02ex8_OO;

import java.util.Scanner;

public class MatrizEscola {
    Scanner scanner = new Scanner(System.in);

    double[][] matriz = new double[5][4];
    String nome;

    public double[][] montarMatriz() {
        System.out.printf("Esta matriz será formada por 5 alunos e suas respectivas notas. %n");
        System.out.printf("Digite e matrícula do primeiro aluno: %n");
        this.matriz[0][0] = scanner.nextDouble();
        System.out.printf("Agora digite a média das provas deste aluno: %n");
        this.matriz[0][1] = scanner.nextDouble();
        System.out.printf("Agora digite a média dos trabalhos do aluno: %n");
        this.matriz[0][2] = scanner.nextDouble();

        System.out.printf("Digite e matrícula do segundo aluno: %n");
        this.matriz[1][0] = scanner.nextDouble();
        System.out.printf("Agora digite a média das provas deste aluno: %n");
        this.matriz[1][1] = scanner.nextDouble();
        System.out.printf("Agora digite a média dos trabalhos do aluno: %n");
        this.matriz[1][2] = scanner.nextDouble();

        System.out.printf("Digite e matrícula do terceiro aluno: %n");
        this.matriz[2][0] = scanner.nextDouble();
        System.out.printf("Agora digite a média das provas deste aluno: %n");
        this.matriz[2][1] = scanner.nextDouble();
        System.out.printf("Agora digite a média dos trabalhos do aluno: %n");
        this.matriz[2][2] = scanner.nextDouble();

        System.out.printf("Digite e matrícula do quarto aluno: %n");
        this.matriz[3][0] = scanner.nextDouble();
        System.out.printf("Agora digite a média das provas deste aluno: %n");
        this.matriz[3][1] = scanner.nextDouble();
        System.out.printf("Agora digite a média dos trabalhos do aluno: %n");
        this.matriz[3][2] = scanner.nextDouble();

        System.out.printf("Digite e matrícula do quinto aluno: %n");
        this.matriz[4][0] = scanner.nextDouble();
        System.out.printf("Agora digite a média das provas deste aluno: %n");
        this.matriz[4][1] = scanner.nextDouble();
        System.out.printf("Agora digite a média dos trabalhos do aluno: %n");
        this.matriz[4][2] = scanner.nextDouble();
        return this.matriz;
    }

    public void resultados() {
        double somaMediaFinal = 0;
        double maiorNotaFinal = 0;
        double matriculaMaiorNota = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 1; coluna < 2; coluna++) {
                this.matriz[linha][3] = (this.matriz[linha][1] * 0.6 + this.matriz[linha][2] * 0.4);
                System.out.printf("A média final do aluno %d é %.1f %n", linha + 1, this.matriz[linha][3]);
                somaMediaFinal += this.matriz[linha][3];
            }
            if (this.matriz[linha][3] > maiorNotaFinal) {
                maiorNotaFinal = this.matriz[linha][3];
                matriculaMaiorNota = this.matriz[linha][0];
            }
        }
        double media = somaMediaFinal / 5;
        System.out.printf("Média de todas as notas finais é %.1f %n", media);
        System.out.printf("A maior nota foi %.1f do aluno com a matrícula número - %.0f %n", maiorNotaFinal, matriculaMaiorNota);
    }
}