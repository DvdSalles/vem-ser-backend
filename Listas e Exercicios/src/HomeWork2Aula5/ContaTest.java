package HomeWork2Aula5;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaTest {
    @Test
    public void deveTestarSaqueContaCorrenteEVerificarSaldoComSucesso(){
        //SETUP
        ContaCorrente c1ContaCorrente = new ContaCorrente();
        c1ContaCorrente.setChequeEspecial(200.0);
        c1ContaCorrente.setSaldo(1000.0);

        // ACT
        boolean sacar = c1ContaCorrente.sacar(200.0);
        double saldo = c1ContaCorrente.getSaldo();



        //ASSERT
        assertTrue(sacar);
        assertEquals(800.0, saldo, 0);
    }
    @Test
    public void deveTestarSaqueContaCorrenteEVerificarSemSaldo(){
        //SETUP
        ContaCorrente c1ContaCorrente = new ContaCorrente();
        c1ContaCorrente.setChequeEspecial(200.0);
        c1ContaCorrente.setSaldo(1000.0);

        // ACT
        boolean sacar = c1ContaCorrente.sacar(2000.0);
        double saldo = c1ContaCorrente.getSaldo();



        //ASSERT
        assertFalse(sacar);
        assertEquals(1000.0, saldo, 0);
    }
    @Test
    public void deveTestarSaqueContaPoupancaEVerificarSaldoComSucesso(){
        ContaPoupanca c1ContaPoupanca = new ContaPoupanca();
        c1ContaPoupanca.setSaldo(1000.0);
        c1ContaPoupanca.creditarTaxa();

        boolean sacar = c1ContaPoupanca.sacar(100.0);
        double saldo = c1ContaPoupanca.getSaldo();

        assertTrue(sacar);
        assertEquals(910.0,saldo,0);
    }
    @Test
    public void deveTestarSaqueContaPoupancaSemSaldo(){
        ContaPoupanca c1ContaPoupanca = new ContaPoupanca();
        c1ContaPoupanca.setSaldo(1000.0);
        c1ContaPoupanca.creditarTaxa();

        boolean sacar = c1ContaPoupanca.sacar(1100.0);
        double saldo = c1ContaPoupanca.getSaldo();

        assertFalse(sacar);
        assertEquals(1010.0,saldo,0);
    }
    @Test
    public void deveTestarSaqueContaPagamentoEVerificarSaldoComSucesso(){
        ContaPagamento c1ContaPagamento = new ContaPagamento();
        c1ContaPagamento.setSaldo(1000.0);

        boolean sacar = c1ContaPagamento.sacar(500.0);
        double saldo = c1ContaPagamento.getSaldo();

        assertTrue(sacar);
        assertEquals(495.75,saldo,0);
    }
    @Test
    public void deveTestarSaqueContaPagamentoSemSaldo(){
        ContaPagamento c1ContaPagamento = new ContaPagamento();
        c1ContaPagamento.setSaldo(1000.0);

        boolean sacar = c1ContaPagamento.sacar(2000.0);
        double saldo = c1ContaPagamento.getSaldo();

        assertFalse(sacar);
        assertEquals(1000.0,saldo,0);
    }
    @Test
    public void deveTestarTransferenciaEVerificarSaldo(){
        ContaCorrente c1ContaCorrente = new ContaCorrente();
        ContaPoupanca c2ContaPoupanca = new ContaPoupanca();
        c1ContaCorrente.setSaldo(1000.0);
        c2ContaPoupanca.setSaldo(1000.0);

        boolean transferir = c1ContaCorrente.transferir(c2ContaPoupanca,500.0);
        double saldo = c1ContaCorrente.getSaldo();
        double saldo2 = c2ContaPoupanca.getSaldo();

        assertTrue(transferir);
        assertEquals(500.0,saldo,0);
        assertEquals(1500.0,saldo2,0);
    }
    @Test
    public void deveTestarTransferenciaSemSaldo(){
        ContaCorrente c1ContaCorrente = new ContaCorrente();
        ContaPoupanca c2ContaPoupanca = new ContaPoupanca();
        c1ContaCorrente.setSaldo(1000.0);
        c2ContaPoupanca.setSaldo(1000.0);

        boolean transferir = c1ContaCorrente.transferir(c2ContaPoupanca,1500.0);
        double saldo = c1ContaCorrente.getSaldo();
        double saldo2 = c2ContaPoupanca.getSaldo();

        assertFalse(transferir);
        assertEquals(1000.0,saldo,0);
        assertEquals(1000.0,saldo2,0);
    }
    @Test
    public void deveTestarDepositoEVerificarSaldoComSucesso(){
        ContaPoupanca c1ContaPoupanca = new ContaPoupanca();
        c1ContaPoupanca.setSaldo(1000.0);

        boolean depositar = c1ContaPoupanca.depositar(1000.0);
        double saldo = c1ContaPoupanca.getSaldo();

        assertTrue(depositar);
        assertEquals(2000.0,saldo,0);
    }
    @Test
    public void deveTestarDepositoNegativo(){
        ContaPoupanca c1ContaPoupanca = new ContaPoupanca();
        c1ContaPoupanca.setSaldo(1000.0);

        boolean depositar = c1ContaPoupanca.depositar(-1000.0);
        double saldo = c1ContaPoupanca.getSaldo();

        assertFalse(depositar);
        assertEquals(1000.0,saldo,0);
    }


}
