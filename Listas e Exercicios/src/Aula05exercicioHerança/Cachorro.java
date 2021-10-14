package Aula05exercicioHerança;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    public void Cachorro(){

    }

    public void late(){
        System.out.println(super.getNome()+" latiu!");
    }
}
