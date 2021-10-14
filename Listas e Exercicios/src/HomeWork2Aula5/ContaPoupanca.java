package HomeWork2Aula5;

public class ContaPoupanca extends Conta implements Impressao {
    static final Double JUROS_MENSAL = 1.01;


    @Override
    public Boolean sacar(Double valorSaque) {
        if (valorSaque <= this.getSaldo()) {
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
            System.out.println("Depósito realizado.");
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
        public void creditarTaxa () {
            this.setSaldo(this.getSaldo() * JUROS_MENSAL);
        }

    @Override
    public void imprimir () {
        System.out.println("Saldo atual: R$"+this.getSaldo());
    }
}
