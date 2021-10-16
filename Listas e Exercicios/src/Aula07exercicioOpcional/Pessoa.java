package Aula07exercicioOpcional;

public class Pessoa {
    private int id;
    private String nome;
    private double salario;
    private String cargo;

    public Pessoa(int id, String nome, double salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return "Pessoa: " +
                "|id: " + id +
                ", |nome: '" + nome + '\'' +
                ", |salario: " + salario +
                " |cargo: "+ cargo +
                '|';
    }
}

