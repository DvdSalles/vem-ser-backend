package HomeWorkAula3;

public class ContaCorrente {
    Cliente cliente = new Cliente();
    String numeroConta;
    int agencia;
    double saldo;
    double chequeEspecial = 100;

    void imprimirContaCorrente(){
        System.out.println(this.cliente+"------- conta: "+this.numeroConta);
    }
    void imprimirSaldoTotal(){
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Cheque Especial: "+this.chequeEspecial);
    }
    boolean depositar(double valorDeposito){
        if(valorDeposito <= 0){
            System.err.println("Depósito inválido!");
            return false;
        }else{
            this.saldo = this.saldo + valorDeposito;
            System.out.println("Novo saldo: R$"+this.saldo);
            return true;
        }
    }
    boolean sacar(double valorSaque){
        if(valorSaque <= (this.saldo + this.chequeEspecial)){
            if(valorSaque <= this.saldo){
                this.saldo = this.saldo - valorSaque;
            }else{
                valorSaque = valorSaque - this.saldo;
                this.saldo = 0;
                this.chequeEspecial = this.chequeEspecial - valorSaque;
            }
            return true;
        }else{
            return false;
        }
    }
    double retornaSaldoComChequeEspecial(){

        return this.saldo + this.chequeEspecial;
    }
    boolean transferir(double valor,ContaCorrente conta){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
