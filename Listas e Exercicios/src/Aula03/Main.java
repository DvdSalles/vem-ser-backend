package Aula03;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "David";
        pessoa1.sobrenome = "Salles";
        pessoa1.idade = 32;
        pessoa1.whatsapp = "999999999";

        System.out.println(pessoa1.nomeSobrenome());
    }
}
