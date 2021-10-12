package HomeWorkAula3;

public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];


    void imprimirContatos(){
        System.out.println(this.contatos[0]);
        System.out.println(this.contatos[1]);
    }
    void imprimirEnderecos(){
        System.out.println(this.enderecos[0]);
        System.out.println(this.enderecos[1]);
    }
    void imprimirCliente(){
        System.out.println(this.nome+" --------- CPF: "+this.cpf);
    }
}
