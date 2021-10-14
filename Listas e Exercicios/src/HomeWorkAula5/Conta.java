package HomeWorkAula5;

abstract class Conta implements Movimentacao {
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private Double saldo;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
    public Boolean sacar(Double valorSaque){
        if (valorSaque <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Saque efetuado com sucesso!");
            return true;
        }else{
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
    public Boolean transferir(Conta conta,Double valor){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}

