package HomeWorkAula5;

public class Main {
    public static void main(String[] args) {
        Contato c1Contato1 = new Contato();
        c1Contato1.setDescricao("Não ligar pela manhã.");
        c1Contato1.setTelefone("999669696");
        c1Contato1.setTipo(1);

        Contato c1Contato2 = new Contato();
        c1Contato2.setDescricao("Não ligar pela tarde.");
        c1Contato2.setTelefone("9999856489");
        c1Contato2.setTipo(2);

        Endereco c1Endereco1 = new Endereco();
        c1Endereco1.setTipo(1);
        c1Endereco1.setLogradouro("Rua São Pedro");
        c1Endereco1.setNumero(12);
        c1Endereco1.setComplemento("Casa");
        c1Endereco1.setCep("78224452");
        c1Endereco1.setCidade("Lagoinha");
        c1Endereco1.setEstado("Paraiba");
        c1Endereco1.setPais("Brasil");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulano das Contas");
        cliente1.setCpf("12345665445");
        Endereco[] c1Enderecos = new Endereco[1];
        c1Enderecos[0] = c1Endereco1;
        cliente1.setEnderecos(c1Enderecos);
        Contato[] c1Contatos = new Contato[2];
        c1Contatos[0] = c1Contato1;
        c1Contatos[1] = c1Contato2;
        cliente1.setContatos(c1Contatos);
//        cliente1.imprimirContatos();
//        cliente1.imprimirEnderecos();
//        cliente1.imprimirCliente();

        ContaPagamento c1ContaPagamento = new ContaPagamento();
        c1ContaPagamento.setCliente(cliente1);
        c1ContaPagamento.setNumeroConta("1111");
        c1ContaPagamento.setAgencia("123");
        c1ContaPagamento.setSaldo(1000.0);

        ContaCorrente c1ContaCorrente = new ContaCorrente();
        c1ContaCorrente.setCliente(cliente1);
        c1ContaCorrente.setNumeroConta("2222");
        c1ContaCorrente.setAgencia("123");
        c1ContaCorrente.setSaldo(800.0);

        Contato c2Contato1 = new Contato();
        c2Contato1.setDescricao("Não ligar pela manhã.");
        c2Contato1.setTelefone("9996698888");
        c2Contato1.setTipo(1);

        Contato c2Contato2 = new Contato();
        c2Contato2.setDescricao("Não ligar pela tarde.");
        c2Contato2.setTelefone("99998888");
        c2Contato2.setTipo(2);

        Endereco c2Endereco1 = new Endereco();
        c2Endereco1.setTipo(1);
        c2Endereco1.setLogradouro("Rua São Paulo");
        c2Endereco1.setNumero(16);
        c2Endereco1.setComplemento("Casa");
        c2Endereco1.setCep("78224888");
        c2Endereco1.setCidade("Lagoinha");
        c2Endereco1.setEstado("Paraiba");
        c2Endereco1.setPais("Brasil");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ciclano Dos Paranaues");
        cliente2.setCpf("12345665888");
        Endereco[] c2Enderecos = new Endereco[1];
        c2Enderecos[0] = c2Endereco1;
        cliente1.setEnderecos(c2Enderecos);
        Contato[] c2Contatos = new Contato[2];
        c2Contatos[0] = c2Contato1;
        c2Contatos[1] = c2Contato2;
        cliente1.setContatos(c2Contatos);

        ContaPoupanca c2ContaPoupanca = new ContaPoupanca();
        c2ContaPoupanca.setCliente(cliente2);
        c2ContaPoupanca.setNumeroConta("3333");
        c2ContaPoupanca.setAgencia("123");
        c2ContaPoupanca.setSaldo(2000.0);

        c2ContaPoupanca.sacar(100.0);
        c2ContaPoupanca.transferir(c1ContaCorrente, 300.0);
        c1ContaCorrente.transferir(c2ContaPoupanca, 50.0);
        c1ContaPagamento.sacar(125.0);
        c2ContaPoupanca.creditarTaxa();
        c1ContaCorrente.imprimir();
        c1ContaPagamento.imprimir();
        c2ContaPoupanca.imprimir();


    }
}
