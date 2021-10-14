package HomeWorkAula5;

public interface Movimentacao {
    public Boolean sacar(Double valorSaque);
    public Boolean depositar(Double valorDeposito);
    public Boolean transferir(Conta conta, Double valor);
}
