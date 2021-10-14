package Aula05exercicioHerança;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }
    public Gato(){

    }

    public void mia(){
        System.out.println(super.getNome()+" miou!");
    }
}
