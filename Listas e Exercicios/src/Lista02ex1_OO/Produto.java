package Lista02ex1_OO;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calcularDesconto() {
        double desconto = 0.95;
        for (int i = 1; i <= 10; i++) {
            double valor = this.getPreco() * desconto;
            double total = valor * i;
            System.out.printf("%d %s x R$%.2f = R$%.2f %n", i, this.getNome(), valor, total);
            desconto -= 0.05;
        }
    }
}