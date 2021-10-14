package HomeWorkAula5;

import java.sql.SQLOutput;

public class ContaCorrente extends Conta implements Impressao{
    private Double chequeEspecial = 200.0;

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }


    public Double retornarSaldoComChequeEspecial(){

        return this.getSaldo() + this.getChequeEspecial();
    }



    @Override
    public Boolean sacar(Double valorSaque){
        if(valorSaque <= (this.getSaldo()+this.chequeEspecial)){
            this.setSaldo(this.getSaldo()-valorSaque);
            System.out.println("Saque efetuado com sucesso!");
            return true;
        }else{
            System.err.println("Saldo insuficiente!");
            return false;
        }
    }

    @Override
    public Boolean depositar(Double valorDeposito) {
        if (valorDeposito <= 0){
            System.err.println("Depósito inválido!");
            return false;
        }else{
            this.setSaldo(this.getSaldo()+valorDeposito);
            System.out.println("Novo saldo: R$"+this.retornarSaldoComChequeEspecial());
            return true;
        }
    }

    @Override
    public void imprimir () {
        System.out.println("Saldo atual: R$"+this.retornarSaldoComChequeEspecial());
    }

    @Override
    public Boolean transferir(Conta conta, Double valor){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

}
