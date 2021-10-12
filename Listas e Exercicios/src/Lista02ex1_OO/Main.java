package Lista02ex1_OO;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Lápis");
        produto1.setPreco(2.00);
        produto1.calcularDesconto();

        Produto produto2 = new Produto();
        produto2.setNome("Caderno");
        produto2.setPreco(10.00);
        produto2.calcularDesconto();

    }
}
