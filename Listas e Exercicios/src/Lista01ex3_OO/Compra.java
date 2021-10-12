package Lista01ex3_OO;

import java.util.Scanner;

public class Compra {
    Scanner scanner = new Scanner(System.in);

    private double totalPagar;
    private double pagou;

    public void comprou(){
        System.out.printf("Digite o total a pagar: ");
        this.totalPagar = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Digite quanto o cliente pagou: ");
        this.pagou = scanner.nextDouble();
        scanner.nextLine();
        double troco = this.pagou - this.totalPagar;
        if(this.pagou < this.totalPagar){
            System.err.printf("O valor pago não foi suficiente!");
        }else if(this.pagou > this.totalPagar){
            System.out.printf("O valor do troco é: R$%.2f", troco);
        }else{
            System.out.printf("Não precisa de troco, obrigado pela preferência.");
        }
        scanner.nextLine();
        this.comprou();
    }
}
