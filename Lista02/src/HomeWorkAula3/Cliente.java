package HomeWorkAula3;

public class Cliente {
    String nome;
    String cpf;
    String[] contatos = new String[2];
    String[] enderecos = new String[2];


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
