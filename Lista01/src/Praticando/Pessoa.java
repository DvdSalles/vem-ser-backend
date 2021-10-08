package Praticando;

public class Pessoa extends Mamifero{
    String nome;
    public Pessoa(String valorNome,int peso){
        super(peso);
        this.nome = valorNome;
    }
}
