package Praticando;

public class Main {
    public static void main(String[] args) {
//        Pessoa pessoa1 = new Pessoa("Fulano",80);
//        System.out.println(pessoa1.nome + " tem " + pessoa1.peso + "Kg.");
//        int valor = 10;
//        String resposta = (valor >= 5) ? "Verdade" : "Mentira";
//        System.out.printf(resposta);
        Pessoa pessoa2 = new Pessoa("Ciclano", 90);
        pessoa2.setPeso(98.8);
        System.out.printf(pessoa2.nome + " pesa: " + pessoa2.getPeso());
    }
}
