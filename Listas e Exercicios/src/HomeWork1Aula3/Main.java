package HomeWork1Aula3;

public class Main {
    public static void main(String[] args) {
//        Contato contato1 = new Contato();
//        contato1.descricao = "Não ligar aos domingos";
//        contato1.telefone = "61998959939";
//        contato1.tipo = 2;
//        contato1.imprimirContato();
//
//        Cliente cliente1 = new Cliente();
//        cliente1.nome = "Fulano das Contas";
//        cliente1.cpf = "123123123-12";
//        cliente1.contatos[0] = "61998959939";
//        cliente1.contatos[1] = "2345678";
//        cliente1.enderecos[0] = "Rua 03 casa 30";
//        cliente1.enderecos[1] = "Rua 04 casa 33";
//        cliente1.imprimirContatos();
//        cliente1.imprimirEnderecos();
//        cliente1.imprimirCliente();
//
//        Endereco endereco1 = new Endereco();
//        endereco1.tipo = 1;
//        endereco1.logradouro = "Rua 07";
//        endereco1.numero = 12;
//        endereco1.complemento = "kitnet no terreo.";
//        endereco1.cep = "72147 089";
//        endereco1.cidade = "Alagoinha";
//        endereco1.estado = "Paraiba";
//        endereco1.pais = "Brasil";
//        endereco1.imprimirEndereco();
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.depositar(100.0);
//        if(conta1.sacar(200)){
//            System.out.println("Sacou!");
//        }else{
//            System.out.println("Não tem!");
//        }
//        ContaCorrente conta1 = new ContaCorrente();
//        ContaCorrente conta2 = new ContaCorrente();
//
//        conta1.depositar(100);
//        conta1.transferir(50,conta2);
//        if(conta2.sacar(25)){
//            System.out.println("Sacou!");
//        }else{
//            System.out.println("Não tem!");
//        }
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.depositar(-200);
//        if(conta1.sacar(150)){
//            System.out.println("Sacou!");
//        }else{
//            System.out.println("Não tem!");
//        }
//        System.out.println(conta1.retornaSaldoComChequeEspecial());
        ContaCorrente conta1 = new ContaCorrente();
        conta1.depositar(200);
        System.out.println("Saldo mais cheque especial: R$"+conta1.retornaSaldoComChequeEspecial());


    }
}
