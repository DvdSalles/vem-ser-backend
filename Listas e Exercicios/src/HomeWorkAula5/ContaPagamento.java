package HomeWorkAula5;

public class ContaPagamento extends Conta implements Impressao{
    static final Double TAXA_SAQUE = 4.25;

    @Override
    public Boolean sacar(Double valorSaque) {
        if (valorSaque+TAXA_SAQUE <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Saque efetuado com sucesso!");
            return true;
        } else {
            System.err.println("Saldo insuficiente!");
            return false;
        }
    }

    @Override
    public Boolean depositar(Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.err.println("Depósito inválido!");
            return false;
        } else {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Novo saldo: R$" + this.getSaldo());
            return true;
        }
    }

    @Override
    public Boolean transferir(Conta conta, Double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void imprimir () {
        System.out.println("Saldo atual: R$"+this.getSaldo());
    }
}

