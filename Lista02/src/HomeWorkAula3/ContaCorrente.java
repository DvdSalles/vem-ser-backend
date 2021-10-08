package HomeWorkAula3;

public class ContaCorrente {
    Cliente cliente = new Cliente();
    String numeroConta;
    int agencia;
    double saldo;
    double chequeEspecial;
    double saldoTotal = saldo + chequeEspecial;

    void imprimirContaCorrente(){
        System.out.println(this.cliente+"------- conta: "+this.numeroConta);
    }
    void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        System.out.println("Novo saldo: R$"+this.saldo);
    }
    void sacar(double valorSaque){
        if(valorSaque <= this.saldoTotal){
            this.saldoTotal = this.saldoTotal - valorSaque;
        }else{
            System.err.println("Saldo insuficiente!");
        }
    }
    double retornarSaldoTotal(){
        return this.saldoTotal;
    }
}
