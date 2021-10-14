package HomeWorkAula5;

public class ContaCorrente extends Conta implements Impressao{
    private Double chequeEspecial = 200.0;

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Double retornarChequeEspecial(){
        return this.getSaldo() + this.chequeEspecial;
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
            System.out.println("Novo saldo: R$"+this.getSaldo());
            return true;
        }
    }

    @Override
    public void imprimir () {
        System.out.println("Saldo atual: R$"+this.getSaldo());
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
